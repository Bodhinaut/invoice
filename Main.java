import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       String productName1;
       int productQty1;
       double productPrice1;
       double productCost1;
       
       String productName2;
       int productQty2;
       double productPrice2;
       double productCost2;
       
       
       /* Ask the user for the product data. */
       Scanner keyboard = new Scanner(System.in);
       
       /* Product 1. */
       System.out.print("Enter product name: ");
       productName1 = keyboard.nextLine();
       
       System.out.print("Enter quantity: ");
       productQty1 = keyboard.nextInt();
       
       System.out.print("Enter item price: ");
       productPrice1 = keyboard.nextDouble();
       
       /* Product 2. */
       System.out.print("Enter product name: ");
       productName2 = keyboard.nextLine();
       
       System.out.print("Enter quantity: ");
       productQty2 = keyboard.nextInt();
       
       System.out.print("Enter item price: ");
       productPrice2 = keyboard.nextDouble();
       
       
       /* Compute the total cost. */
       productCost1 = productQty1 * productPrice1;
       productCost2 = productQty2 * productPrice2;
       
       /* Display the invoice. */
       System.out.println("\nInvoice:");
       System.out.println("========");
       
       System.out.println( String.format("%s%s%d%s%.2f%s%.2f",productName1, ": ", productQty1, 
                             " @ $", productPrice1, " = $", productCost1) );
                             
       System.out.printf("%30s%s%d%s%.2f%s%.2f",productName2, ": ", productQty2, 
                             " @ $", productPrice2, " = $", productCost2);
    
   }
}
