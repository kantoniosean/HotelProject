package hotelproject;

import java.util.*;

public class Hotel implements Comparable<Hotel> {
    
    ArrayList<room> rooms = new ArrayList<>();
    
    private String name;
    private int stars;
    private double googleRating;
    private double averageRoomPrice;
    
    public Hotel(String hotelName, int hotelStars)
    {
        name = hotelName;
        stars = hotelStars;
    }
    
    public void setGoogleRating(double hotelRating)
    {
        googleRating = hotelRating;
    }
    
    public void setRoomPrice(double hotelRoomPrice)
    {
        averageRoomPrice = hotelRoomPrice;
    }
    
    public void addRoom(room r)
    {
        rooms.add(r);
    }

    public void listRooms()
    {
        Collections.sort(rooms);
        String roomInfo;
        for(room r: rooms)
        {
            roomInfo = String.format("%s", r.getRoomInfo());
            System.out.print(roomInfo);
        }
            
        }
    
    
    public double getAverageRoomPrice()
    {
        for(room r: rooms)
            averageRoomPrice += r.price;
        
            averageRoomPrice = averageRoomPrice / rooms.size();
            return averageRoomPrice;
              }
    
    public String getInfo()
    {
        
        return String.format("%-10s%8d%7s%4.2f%8.2f", name, stars, '$', getAverageRoomPrice(), googleRating);
    }
    
    @Override
    public int compareTo(Hotel other)
    {
      if (Double.compare(averageRoomPrice, other.averageRoomPrice) != 0)
        return Double.compare(averageRoomPrice, other.averageRoomPrice);
        
        else if (Integer.compare(stars, other.stars) != 0)
            return -1 * Integer.compare(stars, other.stars);
      
        else 
           return -1 * Double.compare(googleRating, other.googleRating);
    }
    
    
}
