import java.util.Scanner;

public class reverseOneString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //nextInt输入为整数
        int num=sc.nextInt();
        String str=Integer.toString(num,8);
        int len=str.length();
        for (int i=0;i<len;i++)
        {
            System.out.print(str.charAt(len-i-1));
        }
    }
}
