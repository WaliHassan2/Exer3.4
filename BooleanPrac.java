/**
 * 
 * @author walihassanii
 *
 */
import javax.swing.JOptionPane;
public class BooleanPrac {
/**
 * 
 * @param args establish parameters to determine group and team size.
 */
	public static void main(String[] args) {
		
		
		int numPeople, numPlayers;
		{
		String input1 = JOptionPane.showInputDialog("Enter the number of people");
		numPeople = Integer.parseInt(input1);
		
		if(numPeople > 10) {	
		int groupsize = numPeople / 2;
		JOptionPane.showMessageDialog(null,"The number of people is " + numPeople + "\nand the group size is " + groupsize);
	
		}else if ((numPeople < 10) && (numPeople >= 3)){
		 int groupsize2 = numPeople/3;
		 JOptionPane.showMessageDialog(null,"The number of people is " + numPeople + "\nand the group size is " + groupsize2);
		
		}else{
		JOptionPane.showMessageDialog(null,"The number of people has\nto be at least 3");
		}
			
		String input2 = JOptionPane.showInputDialog("Enter the number of players");	
		numPlayers = Integer.parseInt(input2);
		
		if((numPlayers <= 55) && (numPlayers >= 11)){
		int teamSize = numPlayers / 11;
		JOptionPane.showMessageDialog(null,"The number of players is " + numPlayers + "\nand the team size is " + teamSize);
		
		}else{
		int teamSize2 = 1;
		JOptionPane.showMessageDialog(null,"The number of players is " + numPlayers + "\nand the team size is " + teamSize2);
		}
		
		System.exit(0);
		}
		}

}
