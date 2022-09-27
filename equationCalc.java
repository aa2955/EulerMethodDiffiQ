import java.util.*;
public class equationCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input stepSize, count, and initial value of y");
        double stepSize = scan.nextDouble();
        int count = scan.nextInt();
        double initialCond = scan.nextDouble();
        System.out.println(Euler(stepSize, count, initialCond));
    }

    public static String Euler(double stepSize, int count, double initialCond)
    {
        //first make a for loop for count number of times with i increasing by stepSize
            //input equation for y(n+1) and ouput every iteration of count
        double y;

        for (int i = 1; i <= count; i++)
        {
            y = initialCond + (stepSize * ((2 * initialCond) - 1));
            initialCond = y;
            System.out.println("y(" + i + ") = " + y);
        }
        return " ";
    }
}
