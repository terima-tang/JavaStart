import java.util.Scanner;
// ע����������Ϊ Main, ��Ҫ���κ� package xxx ��Ϣ
public class calTimesOfChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String str2=sc.nextLine();
        String lowcase=str.toLowerCase();
        String lowcase2=str2.toLowerCase();
        char cha=lowcase2.charAt(0);
        int leng=str.length();
        int a=0;
        for(int i=0;i<=leng-1;i++){
          if(lowcase.charAt(i)==cha)
            a++; 
        }
        System.out.println(a);
        sc.close();
    }
}