public abstract class Athlete implements ITravelDistance {
    protected int distanceTravelled;

    public Athlete() {
        this.distanceTravelled = 0;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void travelDistance(int distance){
        distanceTravelled += distance;
    }
}
