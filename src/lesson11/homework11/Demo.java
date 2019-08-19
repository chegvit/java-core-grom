package lesson11.homework11;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(123, 500,2,new Date(),"Vostok","Dnepr");
        Room room2 = new Room(323, 220,3,new Date(),"Vostok","Dnepr");
        Room room3 = new Room(5678,220 ,3,new Date(),"Vostok","Dnepr");
        Room room4 = new Room(13145, 150,3,new Date(),"Vostok","Dnepr");
        Room[] rooms = new Room[] {room1, room2,room3,room4 };
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        API api1 = new BookingComAPI(rooms);
        API api2 = new TripAdvisorAPI(rooms);
        API api3 = new GoogleAPI(rooms);
        API[] apis = new API[] {api1,api2,api3};
        Controller controller = new Controller(apis);
      //  System.out.println(Arrays.toString(controller.cheapestRoom(api1.getAll(),api2.getAll());
        System.out.println(Arrays.toString(controller.requestRooms(130,3,"Dnepr","Vostok")));
        //TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
       // System.out.println(Arrays.toString(googleAPI.getRooms()));
       // System.out.println(Arrays.toString(googleAPI.findRooms(220,2,"Dnepr","Vostok")));
        //System.out.println(Arrays.toString(googleAPI.getAll()));
        //System.out.println(Arrays.toString(bookingComAPI.findRooms(200,2,"Dnepr","Vostok")));
        //System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(220,3,"Dnepr","Vostok")));
    }
}
