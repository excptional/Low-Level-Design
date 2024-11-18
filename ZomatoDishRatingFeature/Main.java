package ZomatoDishRatingFeature;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("1", "Bikash Dutta", "bikash123@gmail.com");
        User user2 = new User("2", "Madhumita Ghosh", "madhu123@gmail.com");
        User user3 = new User("3", "Swagata Satpati", "sagu123@gmail.com");

        Dish biryani = new Dish(false, 200);
        Dish friedRice = new Dish(false, 150);
        Dish chilliChicken = new Dish(false, 150);
        Dish sahiPaneer = new Dish(true, 180);

        biryani.setRating(3, user1);
        biryani.setRating(4, user2);

        System.out.println(biryani.getRating());
        System.out.println(user2.getRatings().size());
        System.out.println(biryani.raters.size());
    }

}
