import java.util.Scanner;


public class CalculatorMain {
    public static void main(String args[])
    {
        calculator();
        //System.out.println(i);
    }
    static int add(int first, int second)
    {
        return first+second;
    }
    static int subtract(int first, int second)
    {
        return first-second;
    }
    static double divide(int first, int second)
    {
        double temp = 0;
        try
        {
            temp = (double)first/second;
        }
        catch (ArithmeticException e)
        {
                System.out.println(e);
        }
        return 0;
    }
    static int multiply(int first, int second)
    {
        return first*second;
    }

    static void calculator()
    {
        Scanner sc = new Scanner(System.in);
        boolean latch = true;
         while(true)
        {
            System.out.println("Enter first operand");
            int firstOpearand = sc.nextInt();
            System.out.println("Enter Second operand");
            int secondOperand = sc.nextInt();

            while(latch)
            {
                System.out.println("Enter operator");
                String operator = sc.next();
                switch (operator)
                {
                    case "+":
                        System.out.println(firstOpearand+"+"+secondOperand+"="+add(firstOpearand,secondOperand));
                        latch = false;
                        break;
                    case "-":
                        System.out.println(firstOpearand+"-"+secondOperand+"="+subtract(firstOpearand,secondOperand));
                        latch = false;
                        break;
                    case "/":
                        System.out.println(firstOpearand+"/"+secondOperand+"="+divide(firstOpearand,secondOperand));
                        latch = false;
                        break;
                    case "*":
                        System.out.println(firstOpearand+"*"+secondOperand+"="+multiply(firstOpearand,secondOperand));
                        latch = false;
                        break;
                }
            }

        }



    }

}
