import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFoods = new HashMap();

        favouriteFoods.put("Roddy", "Bananas");
        favouriteFoods.put("Cleyra", "Arepas");
        favouriteFoods.put("Colin", "Knowledge");

        System.out.println(favouriteFoods.get("Roddy"));
    }
}
