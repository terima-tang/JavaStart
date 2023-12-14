import java.util.Scanner;
//import java.io.*;
public class calTheCoordinate {
   public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    String str= sc.nextLine();
    String [] arr=str.split(";");
     int x=0,y=0;
    for(String str1:arr){
        if(!str1.matches("[AWSD][0-9]{1,2}")){
            continue;
        }
        int i=Integer.parseInt(str1.substring(1));
        switch (str1.charAt(0)) {
            case 'A':
                x-=i;
                break;
            case 'D':
                x+=i;
                break;
            case 'W':
                y+=i;
            case 'S':
                y-=i;
            default:
                break;
        }    
    }
             System.out.println(x+","+y);
   }
}
