package ZomatoDishRatingFeature;

import java.util.ArrayList;
import java.util.List;

public class Dish implements DishRating {

    boolean isVeg;
    int price;
    double rating;
    List<User> raters;
    List<Rating> ratings;

    public Dish(boolean isVeg, int price) {
        this.isVeg = isVeg;
        this.price = price;
        rating = 0d;
        raters = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    @Override
    public double getRating() {
        return rating;
    }

    @Override
    public void setRating(double rating, User user) {
        if(raters.contains(user)) {
            System.out.println("You're already rated.");
        } else {
            Rating _rating = new Rating(rating, this, user);
            user.setRatings(_rating);
            raters.add(user);
            ratings.add(_rating);
            this.rating = ((this.rating * (raters.size() - 1)) +  rating) / raters.size();
        }
    }

}
