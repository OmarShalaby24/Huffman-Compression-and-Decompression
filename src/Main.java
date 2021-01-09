import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String filename;

        System.out.print("Enter File Name:");
        filename = sc.nextLine();
        //str = readFile("test.txt");
        str = readFile(filename);
        //str = "Hello World\nsecond line\nthird line\nline for symbols and digits like 1 2 3 4 5 67890";
        char[] letter = new char[str.length()];
        int[] frequency = new int[str.length()];

        int i,j,k=0,flag=0;
        char iterator;

        for(i=0;i<str.length();i++){
            iterator = str.charAt(i);
            for(j=0;j<str.length();j++){
                flag=1;
                if(letter[j]==iterator){
                    frequency[j]++;
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                letter[k] = iterator;
                frequency[k]++;
                k++;
            }
        }
        System.out.println("letter\tfrequency");
        for (i=0 ; i< letter.length;i++){
            if((int)letter[i]==0){
                break;
            }
            System.out.println("'"+letter[i]+"'"+"\t\t"+frequency[i]);
        }
    }

    public static String readFile(String filename){
        String string = "";
        try{
            string = new String(Files.readAllBytes(Paths.get(filename)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return string;
    }
}