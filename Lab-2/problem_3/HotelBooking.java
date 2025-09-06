package Lab_2.problem_3;

public record HotelBooking(String hotelName, int nights, double pricePerNight) {

    public HotelBooking{
        if(hotelName == null || hotelName.isEmpty() || nights<0 || pricePerNight<0){
            throw new IllegalArgumentException("Invalid Inputs");
        }
    }

    public double totalCost(){
        return nights * pricePerNight;
    }


}
