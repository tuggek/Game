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
    void moveOne(Creations other) {
        super.setDamage(50);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        System.out.println(super.getName() + " used water-gun!");
    }


    @Override
    void moveTwo(Creations other) {
        super.setDamage(20);
        other.setMaxHP(other.getMaxHP() - this.getDamage());
        System.out.println(super.getName() + " used tackle!");
    }


    @Override
    void moveThree(Creations other) {
        int heal = 30;
        if(super.getMaxHP() >= 120) {
            super.setMaxHP(120);
            System.out.println(super.getName() + " is already max hp!");
        }
        else {
            int currentHP = super.getMaxHP();
            super.addMaxHP(heal);
            if(super.getMaxHP() >= 120) {
                System.out.println(super.getName() + " healed " + (120 - currentHP) + " hp!");
                super.setMaxHP(120);
            } else {
                System.out.println(super.getName() + " healed " + heal +  " hp!");
            }
        }
    }


    @Override
    void moveFour(Creations other) {
        super.setDamage(40);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        System.out.println(super.getName() + " used bubble!");
    }

}
    
