public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Baloo", 12);
        bear.setName("Yogi");
        String name = bear.getName();

        System.out.println(name);
    }
}
