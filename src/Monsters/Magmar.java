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
    String moveOne(Creations other) {
        super.setDamage(50);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        return "ember";
    }

    @Override
    String moveTwo(Creations other) {
        super.setDamage(20);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        return "tackle";
    }

    @Override
    String moveThree(Creations other) {
        super.addMaxHP(30);
        return "recovery";
    }

    @Override
    String moveFour(Creations other) {
        super.setDamage(30);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        return "flare";
    }

    


}
