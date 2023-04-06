package Monsters;

import Setup.Type;

public abstract class Creations {
    String name;
    int maxHP, damage = 0;
    Type type;
    boolean isAlive;

    
    public Creations(String name, int maxHP, Type type, boolean isAlive) {
        this.name = name;
        this.maxHP = maxHP;
        this.type = type;
        this.isAlive = isAlive;
    } 

    public Creations() {};

    public void use(int pick, Creations other) {
        boolean movePicked = true;
        while(movePicked) {
            switch(pick) {
                case 1:
                    moveOne(other);
                    movePicked = false;   
                    break;
                case 2:
                    moveTwo(other);
                    movePicked = false;
                    break;
                case 3:
                    moveThree(other);
                    movePicked = false;
                    break;
                case 4:
                    moveFour(other);
                    movePicked = false;
                    break;
            }
        }
    }
    
    public abstract void displayAbilities();
    
    abstract void moveOne(Creations other);
    
    abstract void moveTwo(Creations other);

    abstract void moveThree(Creations other);

    abstract void moveFour(Creations other);


    public void addMaxHP(int hp) {
        this.maxHP += hp;
    }


    //Getters
    public String getName() {
        return this.name;
    } 

    public int getMaxHP() {
        return this.maxHP;
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean getStatus() {
        return this.isAlive;
    }

    public Type getType() {
        return this.type;
    }

    //Setters
    public void setStatus(boolean status) {
        this.isAlive = status;   
    }

    public void setMaxHP(int hp) {
        this.maxHP = hp;
    }
    
    public void setDamage(int dmg) {
        resetDamage();
        this.damage = dmg;
    }

    public void setType(Type type) {
        this.type = type;
    }

    private void resetDamage() {
        this.damage = 0;
    }
    
}
