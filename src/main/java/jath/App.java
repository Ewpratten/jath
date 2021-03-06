/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jath;

import java.util.List;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
      System.out.println("jath interpreter 0.1");
      System.out.println("Built on jdk8");
      
      if(args.length < 1){
        System.out.println("Usage: jath /path/to/file.jath");
        return;
      }
      
      List<String[]> file;
      try{
         file = ReadFile.read(args[0]);
      }catch (IOException ex){
        System.out.println("File " + args[0] + " not found");
        return;
      }
      
      
      System.out.println("--------------------\n");
      
      
      String error = Runner.run(file);
      if(error == ""){
        return;
      }
      
      System.out.println("Execution of "+args[0]+" failed with the following error:");
      System.out.println(error);
      return;
    }
}
