public class Reservation{

    private int roomNumber = -1;
    private String guestName = "";
    
    public Reservation(String guestName, int roomNumber){
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    
    public int room(){
        return roomNumber;
    }

    public String name(){
        return guestName;
    }

    public void changeName(String newName){
        guestName = newName;
    }

    public void changeRoom(int number){
        roomNumber = number;
    }
 // private data and other methods not shown
} 