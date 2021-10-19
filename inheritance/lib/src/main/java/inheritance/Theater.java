package inheritance;

import java.util.ArrayList;

public class Theater extends Place {
    private ArrayList<String> allMovie = new ArrayList<>();

    public Theater(String name) {
        super(name);
    }

    public void addMovie(String movieName){
        allMovie.add(movieName);
    }
    public void deleteMovie(String movieName){
                allMovie.remove(movieName);
        }

    public ArrayList<String> getAllMovie() {

        return allMovie;
    }

    public void AllMovie(){
        if(allMovie.size() != 0){
          getAllMovie();
        }
        System.out.println(" no movies ");
        }

    @Override
    public String toString() {
    if(getReviewList().size() != 0){
        return "Theater{" +
                "name='" + getName() + '\'' +
                ", allMovie=" +  getAllMovie() +
                '}' + getReviewList().toString() ;
    }else{
        return "Theater{" +
                "name='" + getName() + '\'' +
                ", allMovie=" + getAllMovie() +
                '}';
    }
    }
}


