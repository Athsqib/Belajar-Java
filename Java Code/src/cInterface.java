public class cInterface {
    public interface Prey {
        void flee();        
    }

    public interface Predator {
        void hunt();
    }

    public static class Rabbit implements Prey{
        @Override
        public void flee() {
            System.out.println("*The rabbit is fleeing*");
        }
    }

    public static class Hawk implements Predator{
        @Override 
        public void hunt(){
            System.out.println("*The hawk is hunting*");
        }
    }

    public static class Fish implements Prey,Predator{

        @Override
        public void hunt() {
            System.out.println("This fish is hunting smaller fish");
        }

        @Override
        public void flee() {
            System.out.println("This fish is fleeing from a larger fish");    
        }
    
    }
    
    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        hawk.hunt();
        rabbit.flee();
        fish.hunt();
        fish.flee();
    }
}
