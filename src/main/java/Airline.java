import airlineController.FlightController;
import airplaneModel.FlightInformationRepository;
import airplaneModel.FlightService;
import airplaneModel.PlaceRepository;
import org.springframework.boot.SpringApplication;

public class Airline {

    public static void main(String []args) {
       // SpringApplication.run(FlightController.class,args);
        PlaceRepository placeRepository = new PlaceRepository();
        FlightInformationRepository flightRepository = new FlightInformationRepository();
        FlightService _service = new FlightService(flightRepository,placeRepository);
        _service.getFlightInformation();
        _service.getPlaces();
    }
}
