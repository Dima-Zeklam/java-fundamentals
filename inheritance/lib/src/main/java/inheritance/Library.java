/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {

        Restaurant McDonald = new Restaurant("McDonald’s",5.0,6.5);
        System.out.println(McDonald.toString());
        System.out.println("---------------------------------------");
        Review review = new Review("good restaurant","Jad", -1);
        Review review2 = new Review("well restaurant","Jon", 5);
        Review review3 = new Review("excellent restaurant","Avril", 8);
        System.out.println(review.toString());
        System.out.println("---------------------------------------");
        McDonald.addReview(review);
        McDonald.addReview(review2);
        McDonald.addReview(review3);
           for (int i =0;i<McDonald.returnrRviewList().size();i++)
        System.out.println("review "+(i+1) +": "+ McDonald.returnrRviewList().get(i));
        System.out.println("---------------------------------------");
        System.out.println(McDonald.toString());
    }
}
