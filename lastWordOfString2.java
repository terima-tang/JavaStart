import java.util.Scanner;
public class lastWordOfString2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        int a =st.length();
        int b=0;
        for(int i=a-1;i>0;i--)
        {
           if(st.charAt(i)==' ')
           break;
           b++;
        }
        System.out.println(b);
        sc.close();
    }
    
}
