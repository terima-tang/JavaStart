import java.util.Scanner;
import java.util.Arrays;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class dictionaryArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String [] arr=new String[num];
        String str1=sc.nextLine();//有效去除第一位为回车的问题
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