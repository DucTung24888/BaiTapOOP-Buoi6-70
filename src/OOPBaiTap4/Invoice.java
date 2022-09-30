package OOPBaiTap4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return customer == null ? 0:customer.getId();
    }

    public String getCustomerName() {
        return customer == null ? "" : customer.getName();
    }

    public double getCustomerDiscount() {
        return customer == null ? 0 : customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        if (customer == null || getCustomerDiscount() == 0) {
            return amount;
        }
        return amount == 0 ? 0 : (amount * getCustomerDiscount()) / 100;
    }

    @Override
    public String toString() {
        return String.format("Invoice[id=%d,customer=%s(%d)(%.0f%%),amount=%.1f]"
                ,id,getCustomerName(),getCustomerID(),getCustomerDiscount(),getAmount());
    }
}
