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
        String s =String.valueOf(str.charAt(i+1));/*�����ַ�����ֱ������parseintת��Ϊint��
                                                    ������Ҫʹ��valueOfתΪString����*/
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