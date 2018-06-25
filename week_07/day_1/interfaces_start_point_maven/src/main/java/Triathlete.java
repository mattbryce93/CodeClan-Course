public class Triathlete extends Athlete implements IRun, ISwim, ICycle{

    public void run(int distance) {
        distanceTravelled += distance;
    }

    public void swim(int distance) {
        distanceTravelled += distance;
    }

    public void cycle(int distance) {
        distanceTravelled += distance;
    }

}
