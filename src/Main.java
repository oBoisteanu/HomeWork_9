public class Main {
    public static void main(String[] args) {

        Animal elefant = new Elefant();
        elefant.isEating();
        elefant.isRunning();
        elefant.showActivities();
        System.out.println(Animal.getMaxNumberOfActivities());

        System.out.println("------------------------------");

        Erbivor elefant1 = new Elefant();
        System.out.println(elefant1.drinkWater());
        elefant1.isEatingPlants();





    }
}