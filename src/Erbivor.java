public interface Erbivor {
    public abstract void isEatingPlants();

    public default boolean drinkWater() {
        return true;
    }
}
