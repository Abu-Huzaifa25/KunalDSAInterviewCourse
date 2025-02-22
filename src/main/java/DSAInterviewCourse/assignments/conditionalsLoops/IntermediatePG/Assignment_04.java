package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

import java.util.Scanner;

public class Assignment_04 {

    public static void main(String[] args) {


        // 4. Calculate Discount Of Product
        // Price = 123;
        // Discount == 10%;
        // total Price = ? find what price is;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Price of Product : ");
        float price = scanner.nextInt();

        System.out.print("Enter Discount Of Product : ");
        float discount = scanner.nextInt(); // we can add Integer value in float

        float discountedPriceIs = 0;
        float totalDiscount = 0;

        totalDiscount = price * discount / 100;
        discountedPriceIs = price - totalDiscount;

        System.out.println("The final price of the Product is : "+ discountedPriceIs + ", Total Discount is : " + totalDiscount);















    }



}