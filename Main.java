import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number to count down or up from:");
    Scanner s = new Scanner(System.in);
    // Variables
    int startNum;
    // imput Variable
    startNum = s.nextInt();
    //check to see if false
    if (startNum > 0) {
      while (startNum != 0) {    
        //subtract 1 then print line.
        // I know you can use -- & ++ but I set it up wrong the first time so I just switched to this
        startNum = startNum - 1;
        System.out.println(startNum);
      }
    }
    else if (startNum < 0) {
      while (startNum != 0) {
        //add 1 then print line
        startNum = startNum + 1;
        System.out.println(startNum);
      }
    }

    System.out.println("Blast off!");
  }
}