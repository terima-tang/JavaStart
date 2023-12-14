import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class reverseTheString2 {                   //注意这里是将字符串变为数字后输出的
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        if(len>=2){
        for(int i=len;i>=2;i--)
       {
           if(str.charAt(i-1)!=str.charAt(i-2))
            {
            String s = String.valueOf(str.charAt(i-1));
            int num =Integer.parseInt(s); //只有前后两个数字不同时输出
            System.out.print(num);
            }
       }
            String s1 = String.valueOf(str.charAt(0));
            int num2 =Integer.parseInt(s1);
            System.out.println(num2);
        }
       else
        //String s2 = String.valueOf(str.charAt(0));
       // int num3 =Integer.parseInt(s1);
       //System.out.println(num2); //System.out.println(str.charAt(len-1))
       sc.close();


       String st="asssh";
       int num=st.indexOf('h');
       System.out.println(num);

        
    }
}
