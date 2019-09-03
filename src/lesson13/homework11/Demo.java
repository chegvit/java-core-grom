package lesson13.homework11;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Room room1 = new Room(3435,230,3,new Date(),"Vostok","Dnepr");
        Room room2 = new Room(323, 220,3,new Date(),"Vostok","Dnepr");
        Room room3 = new Room(5678,220 ,3,new Date(),"Vostok","Dnepr");
        Room room4 = new Room(13145, 150,3,new Date(),"Vostok","Dnepr");
        Room[] rooms = new Room[] {room1, room2,room3,room4 };

        GoogleAPI googleAPI = new GoogleAPI(rooms);

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
        API api1 = new BookingComAPI(rooms);
        API api2 = new TripAdvisorAPI(rooms);
        API api3 = new GoogleAPI(rooms);

        API[] apis = new API[] {api1,api2,api3};
        Controller controller = new Controller(apis);

        System.out.println(Arrays.deepToString(bookingComAPI.getRooms()));
        System.out.println(Arrays.deepToString(bookingComAPI.findRooms(150,3,"Kiev","Ukraine")));
        System.out.println(Arrays.deepToString(googleAPI.findRooms(200,3,"Dnepr","Vostok")));
        System.out.println(Arrays.deepToString(tripAdvisorAPI.findRooms(130,3,"Dnepr","Vostok")));
        controller.getApis();
        System.out.println(Arrays.deepToString(controller.check(api1,api2)));
        System.out.println(Arrays.deepToString(controller.requestRooms(150,3,"Dnepr","Vostok")));
    }
    }


