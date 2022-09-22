import java.util.Scanner;

public class UseCalculator {

  public static void main(String[] args)
  {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

    boolean done = false;
    String command;

    while(!done)
    {
      System.out.println("Enter operation name.");
      command = scanner.nextLine();
      if(command.equals("")) command = scanner.nextLine();

      if(command.equals("add"))
      {
        System.out.println("Enter two numbers to add.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.add(a, b));

      }
      else if(command.equals("subtract"))
      {
        System.out.println("Enter two numbers to subtract.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.subtract(a, b));

      }
      else if(command.equals("multiply"))
      {
        System.out.println("Enter two numbers to multiply.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.multiply(a, b));

      }
      else if(command.equals("divide"))
      {
        System.out.println("Enter two numbers to divide.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.divide(a, b));

      }
      else if(command.equals("fibonacci"))
      {
        System.out.println("Enter fibonacci number you want.");
        int a = scanner.nextInt();
        System.out.println("Result: " + calculator.fibonacciNumberFinder(a));

      }
      else if(command.equals("binary"))
      {
        System.out.println("Enter decimal to convert to binary string.");
        int a = scanner.nextInt();
        System.out.println("Result: " + calculator.intToBinaryNumber(a));

      }
      else if(command.equals("done"))
      {
        done = true;
        System.out.println("Exiting calculator.");
      }
      else
      {
        System.out.println("Command not recognized, try again.");
      }

    }
  }
}
