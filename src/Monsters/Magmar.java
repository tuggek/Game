package Monsters;

import Setup.Type;

public class Magmar extends Creations {
    
    public Magmar() {
        super("Magmar", 120, Type.FIRE, true);
    }

    @Override
    public void displayAbilities() {
        System.out.println("\nWhat will " + getName() + " do? (HP: " + getMaxHP() +")");
        System.out.println("Choose a move: ");
        System.out.println("[1:   Ember   ]  [2:  Tackle  ]\n[3: Recovery  ]  [4:  Flare   ]");
    }


    @Override
    String moveOne() {
        super.setDamage(50);
        return "ember";
    }

    @Override
    String moveTwo() {
        super.setDamage(20);
        return "tackle";
    }

    @Override
    String moveThree() {
        super.addMaxHP(30);
        return "recovery";
    }

    @Override
    String moveFour() {
        super.setDamage(20);
        return "flare";
    }

    


}
