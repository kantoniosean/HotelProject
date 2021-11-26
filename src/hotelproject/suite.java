package hotelproject;


public class suite extends room {

private int numberOfRooms;
private boolean hasKicthen;

    public suite(int RoomNumber, double RoomPrice, int NumberOfRooms, boolean HasKitchen)
     {
        super(RoomNumber, RoomPrice); 
        numberOfRooms = NumberOfRooms;
        hasKicthen = HasKitchen;
    }
    
        @Override
    public String getRoomInfo() {
    String info = "Suite \t" + roomNo + "\t$" + price + "\t\t"+ numberOfRooms + "\t\t"; 
        if(hasKicthen)
        return info + "Kitchen" + "\n";
            else
                return info + "No Kitchen" + "\n";
     }




}
