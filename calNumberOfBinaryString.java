import java.util.Scanner;

public class calNumberOfBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str=Integer.toBinaryString(num);//��intתΪ2����string
        int len =str.length();
        int cal=0;
        int i;
        for(i=0;i<len;i++){
            if(str.charAt(i)=='1')
            cal++;    
        }
        System.out.println(cal);
       
    }
}
