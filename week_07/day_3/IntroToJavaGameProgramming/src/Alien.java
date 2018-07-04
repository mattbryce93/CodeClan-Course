public class Alien extends Sprite {

    private final int INITIAL_X = 800;

    public Alien(int x, int y) {
        super(x, y);
        initAlien();
    }

    private void initAlien(){
        loadImage("Resources/enemy1.png");
        getImageDimensions();
    }

    public void move(){
        if(x < 0){
            x = INITIAL_X;
        }
        x -= 2;
    }

}
