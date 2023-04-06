package Monsters;

import Setup.Type;

public abstract class Creations {
    String name;
    int maxHP, damage = 0, speed = 0;
    Type type;
    boolean isAlive;

    
    public Creations(String name, int maxHP, Type type, boolean isAlive, int speed) {
        this.name = name;
        this.maxHP = maxHP;
        this.type = type;
        this.isAlive = isAlive;
        this.speed = speed;
    } 


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

    //Abstracts
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

    public int getSpeed() {
        return this.speed;
    }

    //Setters
    public void setStatus(boolean status) {
        this.isAlive = status;   
    }

    public void setMaxHP(int hp) {
        this.maxHP = hp;
    }
    
    public void setDamage(int dmg) {
        this.damage = 0; //Reset
        this.damage = dmg;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
