/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary2;

import java.util.Random;
import java.util.*;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static  ArrayList<Integer> roll (int num){

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random = new Random();
        int rand = 0;
        for(int i =0;i<num;i++){
            while (true){
                rand = random.nextInt(7);
                if(rand !=0) break;
            }
            arr.add(rand);
//   System.out.println(rand);
        }


        return arr;
    }

    public static boolean containsDuplicates(int[] arr){
        boolean val =false ;
        for(int i=0;i<arr.length;i++){
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                {val = true ;
                    break;}
            }}
        return val;
    }
    public static double average(int []arr) {
        double sum = 0;
        double avg = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            count++;
        }

        return sum/count;
    }
    public static int[] lowestAverage(int[][] arr) {
        ArrayList<Double> averageArray = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            averageArray.add(sum / arr[i].length);
        }
        //  System.out.println(averageArray);

        return arr[averageArray.indexOf(Collections.min(averageArray))];
    }
    public static void main(String[] args) {
        int []arr = {1,2,6,3,1};
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(roll(4));
        System.out.println(containsDuplicates(arr));
        System.out.println(average(arr));
        int[] averageArray= lowestAverage(weeklyMonthTemperatures);
        System.out.println(Arrays.toString(averageArray));

    }
}