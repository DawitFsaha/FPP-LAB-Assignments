package Lab_2.problem_3;

public record FlightBooking(String origin, String destination, double distanceKm) {

    public FlightBooking{
        if(origin == null || origin.isEmpty() || destination == null || destination.isEmpty() || distanceKm<=0){
            throw new IllegalArgumentException("Invalid input");
        }
    }
    public double computeFlightTime(double avgSpeed){
        return distanceKm/avgSpeed;
    }

    @Override
    public String toString() {
        return "FlightBooking{" +
                "orgin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", distanceKm=" + distanceKm +
                '}';
    }
}
