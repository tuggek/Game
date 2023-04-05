package Setup;


public class Wataroo extends Creations {

    public Wataroo() {
        super("Wataroo", 120, Type.WATER, true);
    }


    @Override
    void displayAbilities() {
        System.out.println("\nWhat will " + getName() + " do? (HP: " + maxHP +")");
        System.out.println("Choose a move: ");
        System.out.println("[1: Water-gun ]  [2:  Tackle    ]\n[3: Recovery  ]  [4:  Bubbles   ]");
    }


    @Override
    String moveOne() {
        super.setDamage(50);
        return "water gun";
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
        return "bubble";
    }

}
    
