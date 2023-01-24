
import java.util.Scanner;


public class MainApp {


    public static Scanner input = new Scanner(System.in);
    public void rule(){
        System.out.println("Hi, Welcome in this game here you come for read the rule of this game ");
        System.out.println("");
        System.out.println("Step 1.>  If AI get stone and you type paper then you win.");
        System.out.println("Step 2.>  If AI get paper and you type stone then you lose.");
        System.out.println("Step 3.>  If AI get Scissor and you type Paper then You lose.");
        System.out.println("Step 4.>  If AI get Paper and you type Scissor then you win.");
        System.out.println("Step 5.>  If AI get Stone and you type Scissor then you lose.");
        System.out.println("Step 6.>  If AI get Scissor and you type Stone then you win.");

    }
    public int rand = (int)(Math.random()*3);
    public void ran(){

        System.out.println("");
        System.out.print("AI Choose : ");
        if ( rand == 0) {
            System.out.println("Stone");
        }else if (rand ==1) {
           System.out.println("Paper");            
        }else if(rand == 2){
           System.out.println("Scissor");
        }
    }
    public void Game(){
        
        /*
         * Note 
         * Stone == 0
         * Paper == 1
         * Scissor == 2
         */
        // while (true) {
              
                System.out.print("Write p for paper , c for Scissor ,s for stone: ");
                String r = input.next();
        
                switch (r) {
            case "s":
            System.out.println("");
                
                if (rand == 0) {
                    System.out.println("=====>   Match draw!!");
                    ran();
                    return;
                }else if (rand == 1) {
                    System.out.println("=====>   I lose ???????");
                    ran();
                    return;
                }
                System.out.println("=====>   I win (^_^)");
                ran();
                
                break;
                case "p":
                System.out.println("");

                if (rand == 0) {
                    System.out.println("=====>   I win (^_^)");
                    ran();
                    return;
                }else if (rand == 1) {
                    System.out.println("=====>   Match draw!!");
                    ran();
                    return;
                }

                System.out.println("=====>   I lose ???????");
                ran();
                break;
                case "c":
                System.out.println("");


                if (rand == 0) {
                    System.out.println("=====>   I lose ???????");
                    ran();
                    return;
                }else if (rand == 1) {
                    System.out.println("=====>   I win (^_^)");
                    ran();
                    return;
                }

                System.out.println("=====>   Match draw!!");
                ran();

                break;
                default:
                System.out.println("Error................................");
                break;
            }
        
    }
    
    // }
   public static void main(String[] args) {
    MainApp s = new MainApp();

    
        
        System.out.println("\n\n\n\n");
        System.out.println("Hey, Welcome in Stone , Paper and Scissor Game !!");
    System.out.println("You want to play game then click (1). \nif you want to read rule of game then click (2).");
    
    System.out.println("");
    System.out.print("Choose your Option : ");
    int option = input.nextInt();
    System.out.println("\n");

    
    switch (option) {
        
            case 1: 
            
            s.Game();
            
            break;
            case 2:

            s.rule();
            break;
            default:
            
        System.out.println("You choose wrong Option .");
        break;
    }
    


   }
}
