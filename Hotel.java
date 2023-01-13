import java.util.*;
public class Hotel{

    
    private Reservation[] rooms;
    private String hotelName = "";
 // each element corresponds to a room in the hotel;
 // if rooms[index] is null, the room is empty;
 // otherwise, it contains a reference to the Reservation
 // for that room, such that
 // rooms[index].getRoomNumber() returns index

    private ArrayList<String>waitList;
 

    public Hotel(String str, int rooms){
        this.rooms = new Reservation[rooms];
        waitList = new ArrayList<String>();
        hotelName = str;
    }


    
 // if there are any empty rooms (rooms with no reservation),
 // then create a reservation for an empty room for the
 // specified guest and return the new Reservation;
 // otherwise, add the guest to the end of waitList
 // and return null
    public Reservation requestRoom(String guestName){
        Reservation temp = new Reservation(guestName, 0);
        for(int i = 0; i < rooms.length;i++){
            if(rooms[i] == null){
                temp.changeRoom(i);
                rooms[i] = temp;
                return temp;
            } 
        }
        waitList.add(guestName);
        return null;
    }

    
 // release the room associated with parameter res, effectively
 // canceling the reservation;
 // if any names are stored in waitList, remove the first name
 // and create a Reservation for this person in the room
 // reserved by res; return that new Reservation;
 // if waitList is empty, mark the room specified by res as empty and
 // return null
 // precondition: res is a valid Reservation for some room
 // in this hotel
    public Reservation cancelAndReassign(Reservation res){
        int room = res.room();
        String guest = "";
        rooms[room] = null;
        if(waitList.size() != 0){
            guest = waitList.get(0);
            waitList.remove(0);
        }
        else{
            return null;
        }
        Reservation newRes = new Reservation(guest, room);
        rooms[room] = newRes;
        return newRes;
        
        
    }

    public void printCurrentReservations(){
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] != null){
                System.out.println(rooms[i].name() +" in room " + rooms[i].room());
            }
            else{
                System.out.println("Vacant");
            }
        }
    }

    public void printCurrentWaitlist(){
        System.out.println("\nWaiting List:");
        for(int i = 0; i < waitList.size(); i++){
            System.out.println(waitList.get(i));
        }
    }
    public Reservation reservation(int room){
        return rooms[room];
    }
} 