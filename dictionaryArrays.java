import java.util.Scanner;
import java.util.Arrays;

// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class dictionaryArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String [] arr=new String[num];
        String str1=sc.nextLine();//��Чȥ����һλΪ�س�������
        for(int i=0;i<num;i++){
        arr[i] =sc.nextLine();
        }
        Arrays.sort(arr);
        for(String str:arr){
            System.out.println(str);
        }
        System.out.println(str1);
        
    }
}