package Setup;

import java.util.InputMismatchException;
import java.util.Scanner;

import Monsters.Creations;


public class Fight {

    private Scanner sc = new Scanner(System.in);
    private boolean turn = true;
    private Monsters monsters = new Monsters();
    
    public void start() {
        System.out.println("*******************");
        System.out.println("CHOOSE YOUR MONSTER\n");
        System.out.println("Press 1 for: " + monsters.get(0).getName());
        System.out.println("Press 2 for: " + monsters.get(1).getName());
        System.out.println("*******************");
        
        boolean repeat = true;
        int pick = 0;
        //Catches wrong input for picking a monster.
        while(repeat) {
            try {
                pick = sc.nextInt();
                repeat = false;
            }
            catch(InputMismatchException e) {
                System.out.println("Error: Please enter a number.");
                repeat = true;
                sc.nextLine();
            }
        }
        pickPhase(turn, pick);       
    }

    private void pickPhase(boolean turn, int n) {
        while(turn) {
            if(n == 1) {
                monsters.get(0);
                System.out.println("You chose " + monsters.get(0).getName().toUpperCase() + "!!");
                versus(monsters.get(0), monsters.get(1));
                turn = false;
           }
            else if(n == 2) {
                monsters.get(1);
                System.out.println("You chose " + monsters.get(1).getName().toUpperCase() + "!!");
                versus(monsters.get(1), monsters.get(0));
                turn = false;
            } 
            else if(n < 1 || n > 2) {
                System.out.println("Please choose either 1 or 2");
                n = sc.nextInt();
            }
        }
    }
    

    private void versus(Creations monsterOne, Creations monsterTwo) {
        System.out.println(monsterOne.getName() +  " VS " + monsterTwo.getName());
        System.out.println(" ");
        boolean vsTurn = true;
        
        while(monsterOne.getStatus() && monsterTwo.getStatus()) {
            if(vsTurn) {
                turn(monsterOne, monsterTwo);
                vsTurn = false;
            } else {
                turn(monsterTwo, monsterOne);
                vsTurn = true;
            }
        }
        winner(monsterOne, monsterTwo);
    }

    private void turn(Creations m1, Creations m2) {
            
            int selectMove = 0;
            boolean repeat = true;
            while(repeat)
            try {
                
                m1.displayAbilities();
                selectMove = sc.nextInt();
                repeat = false;
            }catch(InputMismatchException e) {
                System.out.println("\nERROR: Enter a number\n");
                repeat = true;
                sc.nextLine();
            }
            
            while(selectMove < 0 || selectMove > 4) {
                System.out.println("Please choose 1, 2, 3 or 4.");
                selectMove = sc.nextInt();
            }
            
            chooseMove(m1, m2, selectMove);
            postRound(m2);
    }

    private void chooseMove(Creations m1, Creations m2, int select) {
        switch(select) {
            case 1: 
                m1.use(select);
                useMove(m1,m2);
                break;
            case 2:
                m1.use(select);
                useMove(m1,m2);
                break;
             case 3: //Recovery
                m1.use(select);
                m1.getMaxHP();
                break;
            case 4:
                m1.use(select);
                useMove(m1,m2);
                break;
        }
    }
    

    private void postRound(Creations m1) {
        if(m1.getMaxHP() > 0) {
            System.out.println(m1.getName() + " is " + m1.getMaxHP() + " HP!");
        }
        else if(m1.getMaxHP() <= 0) {
            m1.setMaxHP(0);
            m1.setStatus(false);
        }
    }


    private void useMove(Creations m1, Creations m2) {
        m2.setMaxHP(m2.getMaxHP()-m1.getDamage());
    }
    
    private void winner(Creations m1, Creations m2) {
        if(m1.getMaxHP() == 0) {
            System.out.println("\n" + m1.getName() + " has fainted!");
            System.out.println("\n"+ m2.getName() + " has won the battle!");
        }
        else if(m2.getMaxHP() == 0) {
            System.out.println("\n" + m2.getName() + " has fainted!");
            System.out.println(m1.getName() + " has won the battle!");
        }
    }
}
    

