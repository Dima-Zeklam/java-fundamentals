package inheritance;

import java.util.ArrayList;

public class Restaurant extends Place{
    public Restaurant(String name, double stars, double price) {
        super(name, stars, price);
    }

    public String toString(){
        if(getReviewList().size()!= 0)
            return "Restaurant name " + getName() + " with stars " + getStars()
                    + ", his price " + getPrice() + "$ " +getReviewList().toString() ;
        else
            return  "Restaurant name " + getName() + " with stars " + getStars() + ", his price " + getPrice() + "$ ";

    }


}
