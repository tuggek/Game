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
    void moveOne(Creations other) {
        super.setDamage(50);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        System.out.println(super.getName() + " used ember!");
    }

    @Override
    void moveTwo(Creations other) {
        super.setDamage(20);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
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
        super.setDamage(30);
        other.setMaxHP(other.getMaxHP() - super.getDamage());
        System.out.println(super.getName() + " used flare!");
    }

    


}
