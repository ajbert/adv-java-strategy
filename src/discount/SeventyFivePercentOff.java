package discount;

public class SeventyFivePercentOff implements Discounter{

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * .75);
    }
}
