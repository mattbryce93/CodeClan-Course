public class Missile extends Sprite{
    private final int Board_WIDTH = 600;
    private  final int MISSILE_SPEED = 10;

    public Missile(int x, int y){
        super(x,y);
        initMissile();
    }

    private void initMissile(){
        loadImage("Resources/pewpew.png");
        getImageDimensions();
    }

    public void move(){
        x += MISSILE_SPEED;
        if(x > Board_WIDTH){
            vis = false;
        }
    }

}
