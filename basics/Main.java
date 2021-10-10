import java.time.LocalDateTime;
public class Main
{
  public static String pluralize(String word,int num){
if(num == 0 || num >1)
return word + 's';

return word;
}
 public static void flipNHeads(int n){
     boolean  flip  = true;
     int heads = 0;
     int FLIPS =0;
     while(flip){
          double rand = Math.random();
         if(rand > 0.5){
         System.out.println("tails");
         FLIPS++;}
         else if(rand < 0.5){
           System.out.println("heads");
           heads++;
              FLIPS++;
         }
         if(heads == n )
             flip=false;
         
     }
       System.out.println("It took " + FLIPS + " flips to flip " + n +" heads in a row.");
   
     
}
 public static void clock(){
     LocalDateTime now = LocalDateTime.now();



int hour = now.getHour();
int minute = now.getMinute();
    int secNow = now.getSecond();
int second = now.getSecond();
for(int i = 0;i<100;i++){

    try{
    Thread.sleep(1000);
    if(second < 10){
 System.out.println(hour + ":" + minute + ":0" + second  );}else if(minute<10){
     System.out.println(hour + ":0" + minute + ":" + second  );
 }else{
         System.out.println(hour + ":" + minute + ":" + second  ); 
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
if(minute == 59){
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