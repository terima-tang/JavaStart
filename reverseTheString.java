import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class reverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        if(len>=2){
        for(int i=len;i>=2;i--)
       {
        if(str.charAt(i-1)!=str.charAt(i-2))  //ֻ��ǰ���������ֲ�ͬʱ���
        System.out.print(str.charAt(i-1));
       }
       System.out.println(str.charAt(0));
        }
       else
       System.out.println(str); //System.out.println(str.charAt(len-1))
       sc.close();
        
    }
}
