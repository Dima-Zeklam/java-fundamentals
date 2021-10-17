package inheritance;

import java.util.ArrayList;

public class Restaurant {
   private  String name ;
   private double stars;
   private double price;

    public Restaurant(String name, double stars,double price){
        this.name= name;
        if(stars < 0 ){
            this.stars = 0;
        }else if(stars > 5){
            this.stars = 5;
        }else
            this.stars= stars;

        this.price= price;
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
    public ArrayList<Review> returnrRviewList(){
        return reviewList;
    }
    public String toString(){
      if(reviewList.size()!= 0)
        return "Restaurant name " + name + " with stars " + stars + ", his price " + price + "$ " +reviewList.toString() ;
      else
        return  "Restaurant name " + name + " with stars " + stars + ", his price " + price + "$ ";

    }


}
