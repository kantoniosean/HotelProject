package hotelproject;


//new class singleRoom that inherits that class room
public class singleRoom extends room {
    
    private String bedType;
    private boolean smoking;
   
    public singleRoom(int RoomNumber, double RoomPrice, String BedT, boolean Smoking)
    {
        super(RoomNumber, RoomPrice);
        bedType = BedT;
        smoking = Smoking;
    }
    
    @Override
    public String getRoomInfo() {
    String info = "Room \t" + roomNo  + "\t$" + price + "\t\t"+ bedType + "\t\t"; 
    
    if(smoking)
    return info + "Smoking" + "\n";
        else
        return info + "No Smoking" + "\n";
 }
    
    
     
    
    
    
}
