package inheritance;

import java.util.ArrayList;

public class Place {
    private String name;
    private double stars = 0.0;
    private double price;
    private String description;

    public Place(String name, double stars, double price) {
        this.name = name;
        if (stars < 0) {
            this.stars = 0;
        } else if (stars > 5) {
            this.stars = 5;
        } else
            this.stars = stars;

        this.price = price;
    }

    public Place(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public Place(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public double getStars() {
        return stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    ArrayList<Review> reviewList = new ArrayList<>();
    public void addReview (Review review){
        reviewList.add(review);
        starsAvg();
    }
    public void starsAvg(){
        double sum = 0;
        double avg =0.0;
        for(int i=0;i<reviewList.size();i++)
        {
            sum = sum + reviewList.get(i).getStars();
            avg = sum/reviewList.size();
        }
        this.stars = avg;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }


}
