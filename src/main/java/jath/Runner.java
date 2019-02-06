package jath;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Runner{
  public static String run(List<String[]> commands){
    Map<String, String> varMap = new HashMap<String, String>();
    List<String> operators = Arrays.asList("+", "-", "*", "/");
    
    float buffer = 0.0f;
    String operation = "+";
    
    for(String[] line : commands){
      for(String command : line){
        System.out.println(command);
        if(operators.stream().anyMatch(str -> str.trim().equals(command))){
          operation = command;
        }else if(command.charAt(0) == '$'){
          System.out.println("Vars not yet supported");
        }else{
          buffer = Runner.mod(buffer, new Float(command), operation);
        }
      }
      System.out.println(buffer);
      buffer = 0.0f;
    }
    return "";
  }
  
  private static float mod(float buffer, float value, String operator){
    switch(operator){
      case "+":
        return buffer + value;
      case "-":
        return buffer - value;
      case "*":
        return buffer * value;
      case "/":
        return buffer / value;
    }
    return buffer;
  }
}