package controllers;

import db.DBHelper;
import models.Department;
import models.Engineer;
import models.Manager;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.staticFileLocation;

public class DepartmentsController {
    public DepartmentsController() {
        this.setupEndpoints();
    }

    private void setupEndpoints() {

        get("/departments/:id/edit", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Department department = DBHelper.find(intId, Department.class);

            Map<String, Object> model = new HashMap<>();
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("department", department);
            model.put("template", "templates/departments/edit.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        get("/departments", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Department> departments = DBHelper.getAll(Department.class);
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("template", "templates/departments/index.vtl");
            model.put("departments", departments);
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        get ("/departments/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("template", "templates/departments/create.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        get("/departments/:id", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Department department = DBHelper.find(intId, Department.class);
            Manager manager = DBHelper.findManagerForDept(department);
            List<Engineer> engineers = DBHelper.findEngineersForDept(department);

            Map<String, Object> model = new HashMap<>();
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("department", department);
            model.put("manager", manager);
            model.put("engineers", engineers);
            model.put("template", "templates/departments/show.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        get ("/departments/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("template", "templates/departments/create.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

        post ("/departments", (req, res) -> {
            String title = req.queryParams("title");

            Department department = new Department(title);
            DBHelper.save(department);
            res.redirect("/departments");
            return null;
        }, new VelocityTemplateEngine());

        post ("/departments/:id/delete", (req, res) -> {
            int id = Integer.parseInt(req.params(":id"));
            Department departmentToDelete = DBHelper.find(id, Department.class);
            DBHelper.delete(departmentToDelete);
            res.redirect("/departments");
            return null;
        }, new VelocityTemplateEngine());

        post ("/departments/:id", (req, res) -> {
            String strId = req.params(":id");
            Integer intId = Integer.parseInt(strId);
            Department department = DBHelper.find(intId, Department.class);
            String title = req.queryParams("title");
            department.setTitle(title);
            DBHelper.update(department);
            res.redirect("/departments");
            return null;

        }, new VelocityTemplateEngine());

    }
}
