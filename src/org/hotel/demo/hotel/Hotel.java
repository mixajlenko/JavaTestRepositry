package org.hotel.demo.hotel;

import org.hotel.demo.client.Client;

public class Hotel {

    private String hotelName;

    private Room [] [] rooms;

    public Hotel(String hotelName, Room[][] rooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
    }

    public boolean booking (int floorNumber, int roomNumber, Client client) {

        if (
                roomNumber > 0
                        && floorNumber > 0
                        && rooms.length >= floorNumber
                        && rooms[floorNumber - 1].length >= roomNumber
        ) {
            Room roomToBooking = rooms [floorNumber] [roomNumber];
            return roomToBooking.booking(client);
        }
        return false;
    }
}
