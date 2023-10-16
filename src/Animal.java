public interface Animal {

    public static final String isAnimated = "Respires";
    public static  int  maxNumberOfLegs = 4;

    public abstract void isRunning();
    public abstract  void  isEating();
    public default  void showActivities () {
        System.out.println("The animal has activities");
    }
    public static int getMaxNumberOfActivities (){
        return 4;
    }
}
