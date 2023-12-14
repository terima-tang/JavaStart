import java.util.Scanner;
import java.util.HashSet;
public class theNumberOfString {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int leng=str.length();
    HashSet<Character> sh = new HashSet<Character>();
    for(int i=0;i<leng;i++){
        sh.add(str.charAt(i));
    }
    System.out.println(sh.size());
    sc.close();
}
}
