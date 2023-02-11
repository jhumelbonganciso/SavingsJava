
import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        SavingsObj savingsObj = new SavingsObj(.2, .5, 1, .25);
        int choice = 6;
        Scanner s = new Scanner(System.in);
        do {
            savingsObj.menu();
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println(savingsObj.totalMoney());
                    System.out.println();
                    break;

                case 2:
                    savingsObj.AddToTotalMoney(savingsObj.getPenny());
                    break;

                case 3:
                    savingsObj.AddToTotalMoney(savingsObj.getNickel());
                    break;
                case 4:
                    savingsObj.AddToTotalMoney(savingsObj.getDime());
                    break;
                case 5:
                    savingsObj.AddToTotalMoney(savingsObj.getQuarter());
                    break;

                case 6:
                    savingsObj.withdraw();
                    System.out.println(savingsObj.totalMoney());

                default:
                    System.out.println("Please choose between 0 - 6 only.");

            }

        } while (choice != 0);
        s.close();
    }
}
