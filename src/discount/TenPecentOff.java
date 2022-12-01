package discount;

public class TenPecentOff implements Discounter{

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * .1);
    }
}
