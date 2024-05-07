// Write a Java program to create a Room class, the attributes of this class is roomno, roomtype, roomarea and
// ACmachine. In this class the member functions are setData and displayData. Use member function to set data
// and display that data using displayData() method. 

class Room{
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;

    void setData(int rmN,String rmT,float rmA,boolean ACm){
        this.roomno=rmN;
        this.roomtype=rmT;
        this.roomarea=rmA;
        this.ACmachine=ACm;
    }
    void displayData(){
        System.out.println("Room No : "+this.roomno);
        System.out.println("\nRoom Type : "+this.roomtype);
        System.out.println("\nRoom Area : "+this.roomarea);
        System.out.println("\nRoom ACMachine : "+this.ACmachine);
    }
}


public class PRG3 {
    public static void main(String[] args) {
        Room r1=new Room();
        r1.setData(23, "King", 23.56f, true);
        r1.displayData();
    }    
}
