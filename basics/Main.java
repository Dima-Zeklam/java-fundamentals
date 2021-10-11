import java.time.LocalDateTime;
public class Main
{
  public static String pluralize(String word,int num){
if(num == 0 || num >1)
return word + 's';

return word;
}
    public static void flipNHeads(int num) {
        int heads = 0;
        int counter = 0;
       
        while (heads != num) {
            double rand = Math.random();
         if(rand >= 0.5){
         System.out.println("heads");
         heads++;
             
         }
         else {
          System.out.println("tails");
                heads = 0;
            }
            counter++;
        }
        
         String flipNum;
        if(counter == 1 ){
            flipNum = "flip";
        }else
          flipNum = "flips";
    
        String headsNum;
         if(heads == 1 ){
            headsNum = "head";
        }else
          headsNum = "heads";

        System.out.println("It took " + counter + " " +
        flipNum + " to flip " + heads + " " + headsNum + " in a row.");
    }

 public static void clock(){
     LocalDateTime now = LocalDateTime.now();



int hour = now.getHour();
int minute = now.getMinute();;
    int secNow = now.getSecond();
int second = now.getSecond();
for(int i = 0;i<100;i++){

    try{
    Thread.sleep(1000);
    System.out.print(hour + ":" );
     if(minute<10){
     System.out.print("0" + minute );
 }else{
         System.out.print(minute); 
 }
    if(second < 10){
 System.out.println(":0" + second  );
 }else{
         System.out.println(":" + second  ); 
 }
}catch(InterruptedException e){
    e.printStackTrace();
}


if(second == 59){
    second=-1;
    secNow=0;
    minute++;
}
second++;
secNow++;
if(minute == 60){
    minute=0;
    hour++;
}

}
 }


  public static void main(String[] args) {
int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

flipNHeads(3);

clock();
}}