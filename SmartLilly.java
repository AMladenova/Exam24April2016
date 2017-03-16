import java.util.Scanner;

/**
 * Created by mlade on 16/03/2017.
 */
public class SmartLilly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int yearsLilly = Integer.parseInt(console.nextLine());
        double priceWashingMachine = Double.parseDouble(console.nextLine());
        int singleToyPrice = Integer.parseInt(console.nextLine());

        double savings = 0;
        double moneyGathered = 10;
        double moneyFromToys = 0;

        for (int i = 1; i <= yearsLilly; i++) {
            if (i % 2 == 0){
                savings += moneyGathered;
                savings -= 1;
                moneyGathered += 10;
            }else{
                moneyFromToys += singleToyPrice;
            }
        }
        double allMoney = moneyFromToys + savings;
        if(allMoney >= priceWashingMachine){
            System.out.printf("Yes! %.2f", allMoney - priceWashingMachine);
        }else{
            System.out.printf("No! %.2f", Math.abs(priceWashingMachine - allMoney));
        }
    }
}
