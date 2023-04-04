package Setup;

import java.util.Scanner;

public class Fight {

    Scanner sc = new Scanner(System.in);
    boolean turn = true;

    Monsters monsters = new Monsters();
    

    public void start() {
        System.out.println("*******************");
        System.out.println("CHOOSE YOUR MONSTER\n");
        System.out.println("Press 1 for: " + monsters.get(0).name);
        System.out.println("Press 2 for: " + monsters.get(1).name);
        System.out.println("*******************");
        int n = sc.nextInt();
        
            while(turn) {
                if(n == 1) {
                    monsters.get(0);
                    System.out.println("You chose " + monsters.get(0).name.toUpperCase() + "!!");
                    versus(monsters.get(0), monsters.get(1));
                    turn = false;
                } else if(n == 2) {
                    monsters.get(1);
                    System.out.println("You chose " + monsters.get(1).name.toUpperCase() + "!!");
                    versus(monsters.get(1), monsters.get(0));
                    turn = false;
                } else if(n < 1 || n > 2) {
                    System.out.println("Please choose either 1 or 2");
                    n = sc.nextInt();
                }
            }
    }
    

    private void versus(Creations monsterOne, Creations monsterTwo) {
        System.out.println(monsterOne.name +  " VS " + monsterTwo.name);
        System.out.println(" ");
        boolean vsTurn = true;
        
        while(monsterOne.isAlive && monsterTwo.isAlive) {
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
            System.out.println("*******************");
            System.out.println("What will " + m1.name + " do? (HP: " + m1.getMaxHP() + " )");
            
            m1.displayAbilities();
            int selectMove = sc.nextInt();
            
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
            m1.isAlive = false;
        }
    }


    private void useMove(Creations m1, Creations m2) {
        m2.maxHP -= m1.getDamage();
    }
    
    private void winner(Creations m1, Creations m2) {
        if(m1.maxHP == 0) {
            System.out.println(m2.getName() + " has won the battle!");
        }
        else if(m2.maxHP == 0) {
            System.out.println(m1.getName() + " has won the battle!");
        }
    }
    
}
