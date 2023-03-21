import java.util.Scanner;
public class ex7_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your message:");
    String user = sn.nextLine();
    System.out.print("Your message is :"+textCheck(user));
  }
  public static boolean textCheck(String user){
    if(user.charAt(1) == 'e')
      return true;
    else
      return false;
  }
}
