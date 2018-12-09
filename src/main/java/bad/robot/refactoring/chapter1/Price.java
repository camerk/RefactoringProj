package bad.robot.refactoring.chapter1;

public abstract class Price {

    int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    abstract double getCharge(int daysRented);

    int getFreqRenterPoints(int daysRented){
        return 1;
    }
}
