import spark.ModelAndView;
import models.Calculator;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;

public class Controller {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/add/:num1/:num2", (req, res) -> {
            Integer number1 = Integer.parseInt(req.params(":num1"));
            Integer number2 = Integer.parseInt(req.params(":num2"));
            Calculator calculator = new Calculator(number1, number2);
            int result = calculator.add();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        get("/subtract/:num1/:num2", (req, res) -> {
            Integer number1 = Integer.parseInt(req.params(":num1"));
            Integer number2 = Integer.parseInt(req.params(":num2"));
            Calculator calculator = new Calculator(number1, number2);
            int result = calculator.subtract();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        get("/multiply/:num1/:num2", (req, res) -> {
            Integer number1 = Integer.parseInt(req.params(":num1"));
            Integer number2 = Integer.parseInt(req.params(":num2"));
            Calculator calculator = new Calculator(number1, number2);
            int result = calculator.multiply();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        get("/divide/:num1/:num2", (req, res) -> {
            Integer number1 = Integer.parseInt(req.params(":num1"));
            Integer number2 = Integer.parseInt(req.params(":num2"));
            Calculator calculator = new Calculator(number1, number2);
            double result = calculator.divide();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);
    }
}
