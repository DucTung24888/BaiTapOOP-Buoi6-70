package OOPBaiTap4;

public class MainOOPBaiTap4 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(01,new Customer(02,"Tung",30),1000);
        System.out.println(invoice);
        System.out.printf("%s(%d)(%.0f%%)",invoice.getCustomerName(),invoice.getCustomerID(),
                invoice.getCustomerDiscount());
        System.out.printf("Id is: %d",invoice.getCustomerID());
        System.out.printf("\nName is: %s",invoice.getCustomerName());
        System.out.printf("\nDiscount is: %.0f%%",invoice.getCustomerDiscount());

    }
}
