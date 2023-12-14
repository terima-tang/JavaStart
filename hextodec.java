import java.util.Scanner;
import java.io.*;


public class hextodec {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int len=str.length();
        String str2=str.substring(2,len);
        int num=Integer.parseInt(str2,16);
        System.out.println(num);
        sc.close();

    }
    
}
