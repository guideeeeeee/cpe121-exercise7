import java.util.Scanner;
public class ex7_3{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your message:");
    String user = sn.nextLine();
    UPPER(user);
  }
  public static void UPPER(String user){
    System.out.print("Your message is :");
    for(int i = 0; i<user.length()-3;i++){
      System.out.print(user.charAt(i)); 
    }
    for(int i = user.length()-3; i<user.length();i++){
      String user1 = user.toUpperCase();
      System.out.print(user1.charAt(i)); 
    }
  }
}