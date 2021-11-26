package hotelproject;

public class PentHouse extends room {
    
    private int numBath;
    private boolean theater;
    
    public PentHouse(int RoomNumber, double RoomPrice, int NumberBath, boolean MovieTheater)
    {
        super(RoomNumber, RoomPrice);
        numBath = NumberBath;
        theater = MovieTheater;
    }
    
      @Override
      public String getRoomInfo() {
      String info = "PentH \t" + roomNo + "\t$" + price + "\t\t"+ numBath + "\t\t"; 
      if(theater)
        return info + "Theater" + "\n";
          else
        return info + "No Theater" + "\n";
        }

    
}
