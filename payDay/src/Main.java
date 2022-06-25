import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class Main {

    public static String payCalc(String name, double hourlyRate, double hoursWorked, double deductionRate) {
        double grossPay = hourlyRate * hoursWorked;
        double deduction = grossPay * deductionRate;
        double netPay = grossPay - deduction;
        String paycheck = String.format("%s %.2f %.2f %.2f", name, grossPay, deduction, netPay);
        return paycheck;
    }

    public static void main(String[] args) {
        System.out.print(Main.payCalc("Kris", 21.5, 10.0, 0.05));
    }


    @Test

    public void testPay() {
        Main test = new Main();
        String payTest = test.payCalc("Kris", 21.5, 10.0, 0.05);
        Assertions.assertEquals("Kris 215.00 10.75 204.25", payTest);
    }

}


