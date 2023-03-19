import java.util.Scanner;
public class ex7_2{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your message:");
    String user = sn.nextLine();
    swap(user);
  }
  public static void swap(String user){
    System.out.print("Your message is :");
    for(int i = 2; i<user.length();i++){
      System.out.print(user.charAt(i));
    }
    for(int i = 0; i<2;i++){
      System.out.print(user.charAt(i));
    }
  }
}