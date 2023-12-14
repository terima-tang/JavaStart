import java.util.Scanner;
public class takeAnApproximateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        while(str.charAt(i)!='.')
        {
          i++;
        }
        String s =String.valueOf(str.charAt(i+1));/*由于字符不能直接利用parseint转化为int，
                                                    所以需要使用valueOf转为String类型*/
        int num =Integer.parseInt(s,10);
        int ou=Integer.parseInt(str.substring(0,i),10);
        if(num>=5)
        {
        System.out.println(ou+1);
        }
        else
        System.out.println(ou);
        sc.close();
        }
}