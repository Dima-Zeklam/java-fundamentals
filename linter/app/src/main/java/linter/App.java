/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {


    public static String lint(Path path){
        String errorMessage = "";
        int lineNumber = 0;
    try {
       List <String> list =Files.readAllLines(path);
       for(String line:list){
           lineNumber++;
           if(!line.isEmpty() ){
               if(line.contains("{") || line.contains("}") ||line.contains("if") ||line.contains("else")
               || line.contains(";")){

               }else{

                   errorMessage += "Line " + lineNumber + ": Missing semicolon.\n" ;
               }

           }



       }
    }catch (IOException e){
        System.out.println("Error : file not found");
    }
    return errorMessage;
    }

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/gates.js");
        System.out.println( lint(path));
    }


}
