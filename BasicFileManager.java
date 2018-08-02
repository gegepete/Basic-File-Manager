import java.io.*;
import java.util.*;
public class BasicFileManager {
    public static void main(String[] args) {
        try{
            BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
            String cmd;
            
            while(true){
                System.out.println("CMD: ");
                cmd = cons.readLine();
                String[] v = cmd.split("\\s+");
                
                switch(v[0]){
                    case "exit":
                        return;
                    case "mkdir":
                        new File(v[1]).mkdir();
                        System.out.println("Folderul a fost creat.");
                        break;
                    case "cf":
                        new File(v[1]).createNewFile();
                        System.out.println("Fisierul a fost creat.");
                        break;
                    case "remove":
                        File f1 = new File(v[1]);
                        boolean r = f1.delete();
                        if(r){
                            System.out.println("Fisierul a fost sters.");
                        }else{
                            System.out.println("Nu a fost sters nici un fisier.");
                        }
                        break;
                    case "list":
                        String[] files = new File(v[1]).list();
                        Arrays.asList(files).forEach(System.out::println);
                        
                        }
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}