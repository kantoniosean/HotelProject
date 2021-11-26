package hotelproject;


public class room implements Comparable<room> {
    
    public int roomNo;
    public double price;
    
    public room(int RoomNumber, double RoomPrice)
    {
       roomNo = RoomNumber;
       price = RoomPrice;
    }
    
    public void setPrice(double RoomPrice)
    {
       price = RoomPrice;  
    }
    
   
    public String getRoomInfo()
    {
        return " ";
    }
    
    public int compareTo(room other)
    {
        return Double.compare(price, other.price);

        
    }
    
}
