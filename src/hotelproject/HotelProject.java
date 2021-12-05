package hotelproject;

import java.util.*;

public class HotelProject {

    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();                 
        
        Hotel h1 = new Hotel("Hilton", 5);
        h1.setGoogleRating(4.1);
        
        h1.addRoom(new singleRoom(101, 122.5, "Queen", true)); 
        h1.addRoom(new singleRoom(102, 180.99, "King", true)); 
        h1.addRoom(new singleRoom(203, 160.0, "Twin", false)); 
        h1.addRoom(new suite(601, 400.5, 2, false)); 
        h1.addRoom(new suite(602, 600.5, 3, true));
        h1.addRoom(new PentHouse(7700, 2000, 3, false));
        h1.addRoom(new PentHouse(5140, 1200, 2, false));
        h1.addRoom(new PentHouse(5600, 2500, 2, true));
          
        Hotel h2 = new Hotel("Marriott", 4);
        h2.setGoogleRating(4.5);
        
        h2.addRoom(new singleRoom(1001, 350, "Queen", false));
        h2.addRoom(new singleRoom(1002, 377, "King", true)); 
        h2.addRoom(new suite(3304, 1001, 2, true)); 
        h2.addRoom(new suite(4304, 1500, 4, true)); 
        h2.addRoom(new PentHouse(5060, 3500, 4, true));
        h2.addRoom(new PentHouse(6666, 3100, 3, false));
        h2.addRoom(new PentHouse(7000, 2700, 2, true));
        
       Hotel h3 = new Hotel("Holiday Inn", 4);
       h3.setGoogleRating(4.3);
       
       h3.addRoom(new singleRoom(111, 109.0, "Full", true));
       h3.addRoom(new singleRoom(314, 200.0, "Queen", false));
       h3.addRoom(new singleRoom(476, 150.0, "King", false));
       h3.addRoom(new suite(2005, 500.0, 3, true));
       h3.addRoom(new suite(3001, 750, 2, false));
       h3.addRoom(new PentHouse(6001, 2500, 3, true));
       h3.addRoom(new PentHouse(7050, 3000, 3, true));
       h3.addRoom(new PentHouse(5000, 1500, 2, false));
       
        hotels.add(h1);
        hotels.add(h2);
        hotels.add(h3);
        
            
        Collections.sort(hotels);
        
        System.out.println("----------------------------------------------------------");
        for(Hotel h: hotels)
        {
            System.out.println(h.getInfo());
            System.out.println("----------------------------------------------------------");
            h.listRooms();
            System.out.println("----------------------------------------------------------");
        }
    }
    
}
