public class Elefant implements Animal, Erbivor {


    @Override
    public void isRunning() {
        System.out.println("Elefant is running");
    }

    @Override
    public void isEating() {
        System.out.println("Elefant is eating");
    }

    @Override
    public void showActivities() {
        Animal.super.showActivities();
    }


    @Override
    public void isEatingPlants() {
        System.out.println("Elefant is eating Plants");
    }
}

