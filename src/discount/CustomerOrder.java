package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;

    Discounter discount;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public double getBillAmount() {
        double tempBill;
        switch (discountType) {
            case 'S':
            case 's':
                discount = new TenPecentOff();
              tempBill =  discount.getBillAmount(billAmount);
                break;
            case 'D':
            case 'd':
                discount = new HalfOff();
                tempBill = discount.getBillAmount(billAmount);
                break;
            case 'L':
            case 'l':
                discount = new SeventyFivePercentOff();
                tempBill = discount.getBillAmount(billAmount);
                break;
            default:
                tempBill = billAmount;
        }
        return tempBill;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
