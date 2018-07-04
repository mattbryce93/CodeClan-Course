import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Created by user on 01/11/2017.
 */
public class PlayerShip extends Sprite{

    private int dx;
    private int dy;
    private int x;
    private int y;
    private int iconWidth;
    private int iconHeight;
    private Image image;
    private ArrayList missiles;

    public PlayerShip(int x, int y) {
        super(x, y);
        initCraft();
    }

    private void initCraft() {
        missiles = new ArrayList();
        ImageIcon ii = new ImageIcon("Resources/player1.png");
        iconWidth = ii.getIconWidth();
        iconHeight = ii.getIconHeight();
        image = ii.getImage();
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public ArrayList getMissiles() {
        return missiles;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public Image getImage() {
        return image;
    }

    public int getImageWidth() {
        return iconWidth;
    }

    public int getImageHeight() {
        return iconHeight;
    }

    public void fire(){
        missiles.add(new Missile(x + getImageWidth(), y + getImageHeight()/3));
    }

}
