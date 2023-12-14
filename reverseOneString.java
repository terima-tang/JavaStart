import java.util.Scanner;
public class reverseOneString {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //nextlineÊäÈëÎª×Ö·û´®
        String str=sc.nextLine();
        int len = str.length();
        for(int i=0;i<len;i++){
            System.out.print(str.charAt(len-i-1));
        }
    }
    
}
