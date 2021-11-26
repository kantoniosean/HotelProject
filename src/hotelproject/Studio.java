
package hotelproject;

public class Studio extends room {
    
    private double sqft;
    private boolean view;
    
    public Studio(int RoomNumber, double RoomPrice, double SquareFt, boolean HasView)
    {
        super(RoomNumber, RoomPrice);
        sqft = SquareFt;
        view = HasView;
    }   

    
    
    
}
