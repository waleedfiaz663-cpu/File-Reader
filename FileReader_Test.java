package file.reader;

import java.io.*;

public class FileReader_Test {

    
    public static void main(String[] args) {
       
        try{
            
            FileReader fr = new FileReader ("C:/Users/Administrator/OneDrive/Desktop/Caharcter.txt");
            
            int i;
            
            while((i=fr.read())!=-1){
                
                System.out.println((char)i);
                
                
            }
            
            fr.close();
            
        }
        
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
    }
    
}
