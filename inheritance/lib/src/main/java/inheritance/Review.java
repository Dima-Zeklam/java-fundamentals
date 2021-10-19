package inheritance;

public class Review {
   private String body ;
   private String author;
   private int stars;
   private String movie =" ";

    public Review(String body, String author, int stars){
        this.body= body;
        this.author= author;
        if(stars <0 ){
            this.stars = 0;
        }else if(stars>5){
            this.stars = 5;
        }else
            this.stars= stars;

    }
    public Review(String body, String author, int stars,String movie){
        this.body= body;
        this.author= author;
        if(stars <0 ){
            this.stars = 0;
        }else if(stars>5){
            this.stars = 5;
        }else
            this.stars= stars;
        this.movie=movie;

    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        if(movie != " ")
            return "Review{" +
                    "author='" + author + '\'' + " Movie name:" + movie + '\'' +
                    "body='" + body + '\'' +
                    ", stars=" + stars +
                    '}';
            else
        return "Review{" +
                " author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + stars +
                '}';
    }
}
