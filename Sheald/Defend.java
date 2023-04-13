package Sheald;

public class Defend {
    public abstract class Defend implements Defendable {
        protected int pointOfDefend;
    
        public Defend(int pointOfDefend) {
            this.pointOfDefend = pointOfDefend;
        } 
}
