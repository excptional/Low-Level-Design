package ZomatoDishRatingFeature;

import java.util.ArrayList;
import java.util.List;

public class User {
    String userId;
    String name;
    String email;
    List<Rating> ratings;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.ratings = new ArrayList<>();
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(Rating rating) {
        ratings.add(rating);
    }

}

