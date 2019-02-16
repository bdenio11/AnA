import javax.swing.JOptionPane;

public class Battle{
public static void main(String [] args){
Object chosen = null;
Object amount = null;
int [] lou = new int [12];
  do{
      String[] choices = { "Infantary", "Tank", "Artillery", "AAA", "Fighter", "Bomber", "Submarine" , "Destroyer", "Cruiser", "Battleship", "Carrier", "Done"};
      chosen = JOptionPane.showInputDialog(null,"Please choose what kinds of units will be fighting. To quit, select done ", "Unit Selection",JOptionPane.INFORMATION_MESSAGE, null,choices, choices[0]);
      if (! chosen.equals("Done")){
        amount = JOptionPane.showInputDialog("How many of units are there?");
        String a = amount.toString();
        int count = Integer.parseInt (a);
        String s = chosen.toString();
        switch(s){
          case "Infantary": lou[0] = count;
          break;
          case "Tank": lou[1] =  count;
          break;
          case "Artillery" : lou[2] = count;
          break;
          case "AAA": lou[3] = count;
          break;
          case "Fighter": lou[4] = count;
          break;
          case "Bomber": lou[5] = count;
          break;
          case "Submarine": lou[6] = count;
          break;
          case "Destroyer": lou[7] = count;
          break;
          case "Cruiser": lou[8] = count;
          break;
          case "Battleship": lou[9] = count;
          break;
          case "Carrier": lou[10] = count;
          break;
        }//Switch statement
      }//If Statement to make sure Input is not being requested for the done option.

} while(! chosen.equals("Done")); //DO while loop for asking how many units



    }//main

}//class
