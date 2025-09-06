package Lab_2.problem_3;

public final class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final double milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay){
        if(carModel == null || days < 0 || ratePerDay < 0 || milesPerDay < 0){
            throw new IllegalArgumentException("Invalid Inputs");
        }
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost(){
        return days * ratePerDay;
    }

    public double totalMilesAllowed(){
        return days * milesPerDay;
    }


    public String getCarModel() {
        return carModel;
    }

    public int getDays() {
        return days;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }
}
