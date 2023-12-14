import java.util.Scanner;
 public class divideTheString{
    public static void main(String [] args){

         Scanner sc=new Scanner(System.in);
         StringBuilder sb= new StringBuilder();
         
         String str=sc.nextLine();
         sb.append(str);
         int len=str.length();
         int num=8-len%8;
         while(num>0&&num<8){
            sb.append('0');
            num--;
         }

         String str1=sb.toString();
         while (str1.length()>0) {
            System.out.println(str1.substring(0,8));
            str1=str1.substring(8);
         }
            
         }
    }
 