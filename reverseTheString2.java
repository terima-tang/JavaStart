import java.util.Scanner;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class reverseTheString2 {                   //ע�������ǽ��ַ�����Ϊ���ֺ������
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
            int num =Integer.parseInt(s); //ֻ��ǰ���������ֲ�ͬʱ���
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
