import java.util.Scanner;
public class ex7_4{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter your message:");
    String user = sn.nextLine();
    System.out.print("The summation of number is :"+sumNumber(user));
  }
  public static int sumNumber(String str){
    int sum = 0;
    String temp ="0";
    boolean door  = false;
    for(int i = 0;i<str.length();i++){
      if(Character.isDigit(str.charAt(i))){
        door = true;
        temp = temp+str.charAt(i);
      }
      else{
        door = false;
      }
      if(door == false||i == str.length()-1){
        sum = sum+Integer.parseInt(temp);
        temp = "0";
      }
    }
    
    return sum;
  }
}