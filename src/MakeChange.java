import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("What is the price of the item");
		Double itemPrice = kb.nextDouble();
		System.out.println("Amount tendered?");
		Double cashTendered = kb.nextDouble();

		double remainingChange = cashTendered - itemPrice;
		remainingChange = Math.round(remainingChange * 100.0) / 100.0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count1 = 0;
		int countQ = 0;
		int countD = 0;
		int countN = 0;
		int countP = 0;

		if (cashTendered % itemPrice == 0) {
			System.out.println("Customer used exact change");
		} else if (cashTendered < itemPrice) {
			System.out.println("Error: Customer did not give enough money");
		} else if (cashTendered > itemPrice) {
			while (remainingChange > 0.009) {
				if (remainingChange >= 20) {
					count20++;
					remainingChange -= 20;
				} else if (remainingChange >= 10) {
					count10++;
					remainingChange -= 10;
				} else if (remainingChange >= 5) {
					count5++;
					remainingChange -= 5;
				} else if (remainingChange >= 1) {
					count1++;
					remainingChange -= 1;
				} else if (remainingChange >= 0.25) {
					countQ++;
					remainingChange -= 0.25;
				} else if (remainingChange >= 0.10) {
					countD++;
					remainingChange -= 0.10;
				} else if (remainingChange >= 0.05) {
					countN++;
					remainingChange -= 0.05;
				} else if (remainingChange >= 0.01) {
					countP++;
					remainingChange -= 0.01;
				} else {
					// (remainingChange >= 0.001)
					remainingChange += 0.005;
				}

			}
			System.out.println("Amount: " + itemPrice);
			System.out.println("Tendered: " + cashTendered);
			System.out.println("Please return the following change:");
		}
		if (count20 > 0) {
			System.out.println(count20 + " : Twenty dollar bills");
		}
		if (count10 > 0) {
			System.out.println(count10 + " : Ten dollar bills");
		}
		if (count5 > 0) {
			System.out.println(count5 + " : Five dollar bills");
		}
		if (count1 > 0) {
			System.out.println(count1 + " : One dollar bills");
		}
		if (countQ > 0) {
			System.out.println(countQ + " : Quarters");
		}
		if (countD > 0) {
			System.out.println(countD + " : Dimes");
		}
		if (countN > 0) {
			System.out.println(countN + " : Nickels");
		}
		if (countP > 0) {
			System.out.println(countP + " : Pennies");
		}
	}

}
