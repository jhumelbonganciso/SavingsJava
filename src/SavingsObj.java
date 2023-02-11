import java.util.Scanner;

public class SavingsObj {
    private double penny, nickel, dime, quarter;
    private double totalMoney = 0;
    private Scanner s = new Scanner(System.in);

    SavingsObj() {
    }

    SavingsObj(double penny, double nickel, double dime, double quarter) {
        this.penny = penny;
        this.nickel = nickel;
        this.dime = dime;
        this.quarter = quarter;
    }

    public double getPenny() {
        return penny;
    }

    public double getNickel() {
        return nickel;
    }

    public double getDime() {
        return dime;
    }

    public double getQuarter() {
        return quarter;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void AddToTotalMoney(double val) {
        totalMoney += val;
    }

    public void withdrawal(double val) {
        setTotalMoney(getTotalMoney() - val);
    }

    public void setTotalMoney(double total) {
        this.totalMoney = total;
    }

    public void withdraw() {

        System.out.println("How much do you wanted to withdraw? ");
        double withdrawal = s.nextDouble();
        System.out.println();
        if (withdrawal <= getTotalMoney()) {
            withdrawal(withdrawal);
        } else {
            System.out.println("Withdrawal denied");
            System.out.println();
        }

        System.out.println("You have withdraw " + withdrawal);
        System.out.println();
    }

    public void menu() {
        System.out.println();
        System.out.println("1. Show total in the bank");
        System.out.println("2. Add a Penny");
        System.out.println("3. Add a nickel");
        System.out.println("4. Add a dime");
        System.out.println("5. Add a quarter");
        System.out.println("6. Take money out of the bank");
        System.out.println("Enter 0 to quit");
        System.out.print("Enter your choice:  ");
    }

    public String totalMoney() {
        return "Your total money is " + getTotalMoney();

    }
}
