import java.util.Scanner;

public class calNumberOfBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str=Integer.toBinaryString(num);//将int转为2进制string
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
