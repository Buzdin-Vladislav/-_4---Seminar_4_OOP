package Sheald;

public class SmallShield {
    public int armor; // крепкость 
    
    public int getArmor() {
        return armor;
    }

    public SmallShield(int pointOfDefend, int armor) {
        super(pointOfDefend);
        this.armor = armor;
    }
    
    @Override
    public String toString() {
        return "SmallShield [armor = " + armor + "]" + "Defend = " + pointOfDefend;
    }

    @Override
    public int defend() {
        return new Random().nextInt(10, pointOfDefend);
    }
}

