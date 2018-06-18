public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Baloo");
        bear.setName("Yogi");
        String name = bear.getName();

        System.out.println(name);
    }
}
