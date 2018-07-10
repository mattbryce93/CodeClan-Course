import models.Game;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.debug.DebugScreen.enableDebugScreen;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        Game game1 = new Game("Colony Wars");
        Game game2 = new Game("Hearts of Iron IV");
        Game game3 = new Game("Heart of Darkness");
        Game game4 = new Game("Europa Universalis");
        Game game5 = new Game("City Skylines");
        ArrayList<Game> games = new ArrayList<Game>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);

        get("/game", (req, res) -> {
            Collections.shuffle(games);
            String result = games.get(0).getTitle();
            HashMap<String, Object> model = new HashMap<>();
            model.put("result", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);
        enableDebugScreen();
    }



}
