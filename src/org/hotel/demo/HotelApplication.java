package org.hotel.demo;

import org.hotel.demo.client.Client;
import org.hotel.demo.hotel.Hotel;
import org.hotel.demo.hotel.Room;

public class HotelApplication {
    public static void main(String[] args) {

        Room[] [] HiltonRooms = new Room [1] [1];
        Hotel hiltonHotel = new Hotel("HILTOM", HiltonRooms);
        Client client1 = new Client("38077777777", "Test Client1");
        Client client2 = new Client ("3806666666", "Test Client2" );
    }
}
