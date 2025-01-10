
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class emptyFile extends Exception{

    public emptyFile(String msg) {
        //super(msg);
        System.out.println(msg);
    }
    
}   


public class FileHandling {
 public static void main(String[] args) throws emptyFile{
    String filename = "test.txt";
    File fs = new File(filename);
    
    try(Scanner sc = new Scanner(fs)) {
        int count=0;
        if (! sc.hasNext()){
            throw new emptyFile("File is Empty :(");
        }
    
        while(sc.hasNext()){
            if(sc.next()!=null) count++;
        }
        System.out.println("Total Words = "+count);       
    } 
    catch (FileNotFoundException fnf) {
        System.out.println("File Not Found :(");
    }

    
 }   
}
