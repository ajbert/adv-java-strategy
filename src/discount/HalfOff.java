package discount;

public class HalfOff implements Discounter{


    public double getBillAmount(double billAmount) {

        return billAmount - (billAmount * .5);

    }

}
