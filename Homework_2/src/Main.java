package Paper_6_Using_classes.Homework_2.src;

import static ibio.Helpers.*;

public class Main {
    public static void main(String[] args)
    {
        boolean running = true;

        while (running) // = (to running == true), but since already stated true before no repetition
        {
            String operation = inputString ("give operation: ");
            {
                if (operation.equals("end")) // .equals for strings / == is only for int/boo/all primary
                    running = false;
                else
                {
                    int A = inputInt ("give first integer operand: ");
                    int B = inputInt ("give second integer operand: ");
                    if (operation.equals("add"))
                        System.out.println (A + B);
                    else if (operation.equals("sub"))
                        System.out.println(A - B);
                    else
                        System.out.println("unknown operation");
                }
            }
        }
    }
}