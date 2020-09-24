package democlass;
import java.util.*;
public class mainclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Room r = new Room("Amla",70,4);
		Room amla = new Room("Amla",70,4);
		Room bahada = new Room("Bahada",70,4);
		System.out.println("The object value is "+r);
		
		Room[] rooms = new Room[10];
		for(int i=0;i<3;i++)
		{
			rooms[i]=new Room();
			System.out.println("Enter room name ");
			String roomName = sc.nextLine();
			System.out.println("Enter no. of chairs ");
			int noOfChairs = sc.nextInt();
			System.out.println("Enter no. of projectors");
			int noOfProjectors = sc.nextInt();
			sc.nextLine();
		//	rooms[i]= new Room(roomName,noOfChairs,noOfProjectors);
			rooms[i].setName(roomName);
			rooms[i].setNoOfChairs(noOfChairs);
			rooms[i].setNoOfProjectors(noOfProjectors);
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Object value "+rooms[i]);
		}
		for(int i=0;i<3;i++)
		{
		System.out.println("The name is :"+rooms[i].name);
		System.out.println("No. of chairs :"+rooms[i].noOfChairs);
		System.out.println("No. of projectors : "+rooms[i].noOfProjectors);
		}
		//get number of chairs for a room
		int noOfChairs = getNumberOfChairs(Room room);
	}
	
}
