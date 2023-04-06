package Monsters;

import Setup.Type;

public class Wataroo extends Creations {

    public Wataroo() {
        super("Wataroo", 120, Type.WATER, true);
    }


    @Override
    public void displayAbilities() {
        System.out.println("\nWhat will " + getName() + " do? (HP: " + getMaxHP() +")");
        System.out.println("Choose a move: ");
        System.out.println("[1: Water-gun ]  [2:  Tackle    ]\n[3: Recovery  ]  [4:  Bubbles   ]");
    }


    @Override
    String moveOne(Creations other) {
        super.setDamage(50);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        return "water gun";
    }


    @Override
    String moveTwo(Creations other) {
        super.setDamage(20);
        other.setMaxHP(other.getMaxHP() - this.getDamage());
        return "tackle";
    }


    @Override
    String moveThree(Creations other) {
        super.addMaxHP(30);
        return "recovery";
    }


    @Override
    String moveFour(Creations other) {
        super.setDamage(40);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        return "bubble";
    }

}
    
