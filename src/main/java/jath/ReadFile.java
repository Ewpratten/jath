package jath;

import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class ReadFile{
  public static List<String> read(String path) throws IOException {
    // try{
    //   Scanner fileScanner = new Scanner(new File(path));
    // }catch(FileNotFoundException ex){
    //   System.out.println("File not found");
    //   return new ArrayList<String>();
    // }
    // ArrayList<String> output = new ArrayList<String>();
    
    // while (fileScanner.hasNext()){
    //   output.add(fileScanner.next());
    // }
    
    // fileScanner.close();
    
    List<String> output = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
    
    return output;
  }
}