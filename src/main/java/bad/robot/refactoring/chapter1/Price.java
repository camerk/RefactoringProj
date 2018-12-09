package bad.robot.refactoring.chapter1;

public abstract class Price {

    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    abstract double getCharge(int daysRented);
}
