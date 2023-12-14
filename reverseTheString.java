import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class reverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        if(len>=2){
        for(int i=len;i>=2;i--)
       {
        if(str.charAt(i-1)!=str.charAt(i-2))  //只有前后两个数字不同时输出
        System.out.print(str.charAt(i-1));
       }
       System.out.println(str.charAt(0));
        }
       else
       System.out.println(str); //System.out.println(str.charAt(len-1))
       sc.close();
        
    }
}
