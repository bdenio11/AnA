import javax.swing.JOptionPane;


public class Battle{










public static void main(String [] args){
Object chosen = null;
Object amount = null;
int [] myUnits = new int [11];//keeps track of the units that are fighting for you
int [] eUnits = new int [11];//keeps track of the enemy units that you are fighting against
  do{
      String[] choices = { "Infantary", "Tank", "Artillery", "AAA", "Fighter", "Bomber", "Submarine" , "Destroyer", "Cruiser", "Battleship", "Carrier", "Done"};
      chosen = JOptionPane.showInputDialog(null,"Please choose what kinds of units will be fighting for your team. To quit, select done ", "Unit Selection",JOptionPane.INFORMATION_MESSAGE, null,choices, choices[0]);
      if (! chosen.equals("Done")){
        amount = JOptionPane.showInputDialog("How many of units are there?");
        String a = amount.toString();
        int count = Integer.parseInt (a);
        String s = chosen.toString();
        switch(s){
          case "Infantary": myUnits[0] = count;
          break;
          case "Tank": myUnits[1] =  count;
          break;
          case "Artillery" : myUnits[2] = count;
          break;
          case "AAA": myUnits[3] = count;
          break;
          case "Fighter": myUnits[4] = count;
          break;
          case "Bomber": myUnits[5] = count;
          break;
          case "Submarine": myUnits[6] = count;
          break;
          case "Destroyer": myUnits[7] = count;
          break;
          case "Cruiser": myUnits[8] = count;
          break;
          case "Battleship": myUnits[9] = count;
          break;
          case "Carrier": myUnits[10] = count;
          break;
        }//Switch statement
      }//If Statement to make sure Input is not being requested for the done option.

} while(! chosen.equals("Done")); //DO while loop for asking how many units

do{
    String[] choices = { "Infantary", "Tank", "Artillery", "AAA", "Fighter", "Bomber", "Submarine" , "Destroyer", "Cruiser", "Battleship", "Carrier", "Done"};
    chosen = JOptionPane.showInputDialog(null,"Please choose what kinds of units will be fighting for the enemy. To quit, select done ", "Unit Selection",JOptionPane.INFORMATION_MESSAGE, null,choices, choices[0]);
    if (! chosen.equals("Done")){
      amount = JOptionPane.showInputDialog("How many of units are there?");
      String a = amount.toString();
      int count = Integer.parseInt (a);
      String s = chosen.toString();
      switch(s){
        case "Infantary": eUnits[0] = count;
        break;
        case "Tank": eUnits[1] =  count;
        break;
        case "Artillery" : eUnits[2] = count;
        break;
        case "AAA": eUnits[3] = count;
        break;
        case "Fighter": eUnits[4] = count;
        break;
        case "Bomber": eUnits[5] = count;
        break;
        case "Submarine": eUnits[6] = count;
        break;
        case "Destroyer": eUnits[7] = count;
        break;
        case "Cruiser": eUnits[8] = count;
        break;
        case "Battleship": eUnits[9] = count;
        break;
        case "Carrier": eUnits[10] = count;
        break;
      }//Switch statement
    }//If Statement to make sure Input is not being requested for the done option.

} while(! chosen.equals("Done")); //DO while loop for asking how many units
int kills = 0;
int deaths = 0;
for(int i = 0; i < myUnits.length; i++){
  int attackCount = myUnits[i];//keeps track of how many attacks each unit type gets
  while(attackCount > 0){

    int roll = (int) (Math.random() * 6 + 1);
    switch(i){
      case 0:
      case 10:
      if(roll == 1){
        kills ++;
        System.out.println("Attacker scores a kill");
      }
      attackCount--;
      break;
      case 1:
      case 4:
      case 8:
      if(roll <= 3){
      kills ++;
      }
      attackCount--;
      break;
      case 2:
      case 6:
      case 7:
       if(roll <= 2){
        kills++;
      }
      attackCount--;
      break;
      case 5:
      case 9:
       if(roll <= 4){
        kills++;
      }
      attackCount--;
      break;
      default:
      attackCount--;
      break;
    }//switch
  }//while
}//for

for(int j = 0; j < eUnits.length; j++){
  int defenseCount = eUnits[j];
  while(defenseCount > 0){
  int roll = (int) (Math.random() * 6 + 1);
    switch(j){
      case 0:
      case 2:
      case 7:
      case 10:
      if(roll <= 2){
        deaths++;
        System.out.println("defender scores a kill ");
      }
      defenseCount --;
      break;
      case 1:
      case 8:
      if(roll <= 3){
        deaths++;
      }
      defenseCount-- ;
      break;
      case 4:
      case 9:
      if(roll <= 4){
        deaths ++;
      }
      defenseCount --;
      break;
      case 5:
      case 6:
      if(roll <= 1){
        deaths ++;
      }
      defenseCount --;
      break;
      default:
      defenseCount --;
      break;





    }//switch
  }//while
}//for



System.out.println(kills);
System.out.println(deaths);



    }//main

}//class
