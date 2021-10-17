package inheritance;

public class Review {
   private String body ;
   private String author;
    private int stars;

    public Review(String body, String author, int stars){
        this.body= body;
        this.author= author;
       if(stars <0 || stars>5){
           this.stars = 0;
       }else
           this.stars= stars;

    }

    public int getStars() {
        return stars;
    }

    public String toString(){

        return "Review " + body + " with stars " + stars + ", author " + author ;
    }
}
