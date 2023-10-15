import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert the bill: $");
        double bill = scan.nextDouble();
        System.out.println();
        System.out.print("Insert the tip percentage (without the percentage sign): ");
        double percent = scan.nextDouble();
        System.out.println();
        System.out.print("Insert number of people: ");
        int numberOfPeople = scan.nextInt();
        System.out.println();
        TipCalculator calculate = new TipCalculator(percent, bill, numberOfPeople);
        System.out.println("Tip Per Person: " + calculate.tipPerPerson());
        System.out.println("Total Per Person: " + calculate.totalPerPerson());
        System.out.println("Total Bill including tip: "+ calculate.totalBill());
        System.out.println("Total tip: " + calculate.getTip());
    }
}
