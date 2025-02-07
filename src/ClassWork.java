public class ClassWork {
    public static void main(String[] args)
    {
       int noPersons = 4;
       double dishPrice = 18.99;
       final double TAX_RATE = 0.2;
       double subTotal = noPersons * dishPrice;
       double tax = subTotal * TAX_RATE;
       double tip = subTotal * 0.15;
       double total = subTotal + tip + tax;
        System.out.println("Total tax:"+ tax);
        System.out.println("Total tip:"+ tip);
        System.out.println("Total price:"+ total);
        System.out.println("Each person owes:"+ total/noPersons);
    }
}