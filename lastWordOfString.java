import java.util.Scanner;
public class lastWordOfString {
public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  String i= sc.nextLine();
String [] sp=i.split(" ");
int l=sp[sp.length-1].length();
System.out.println(l);
sc.close();
}
}
