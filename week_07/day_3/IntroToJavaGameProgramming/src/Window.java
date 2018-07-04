import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Window extends JPanel implements Runnable {

    private final int B_WIDTH = 800;
    private final int B_HEIGHT = 600;
    private final int INITIAL_X = 40;
    private final int INITIAL_Y = 40;
    private final int DELAY = 100;

    private Image player;
    private Thread animator;
    private int x, y;
    private PlayerShip playerShip;
    private ArrayList aliens;
    KeyboardInput keyboard = new KeyboardInput();

    public Window() {

        initWindow();
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("Resources/player1.png");
        player = ii.getImage();
    }

    private void initWindow() {

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setDoubleBuffered(true);
        addKeyListener(keyboard);
        setFocusable(true);
        playerShip = new PlayerShip(100,100);
        initAliens();

        loadImage();

        x = INITIAL_X;
        y = INITIAL_Y;

    }

    public void initAliens(){
        aliens = new ArrayList<Alien>();
        aliens.add(new Alien(700, 300));
        aliens.add(new Alien(700, 400));
        aliens.add(new Alien(700, 500));
    }

    @Override
    public void addNotify() {
        super.addNotify();

        animator = new Thread(this);
        animator.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(playerShip.getImage(), playerShip.getX(), playerShip.getY(), this);
        ArrayList ms = playerShip.getMissiles();
        for (Object m1 : ms){
            Missile m = (Missile)m1;
            g2d.drawImage(m.getImage(), m.getX(), m.getY(), this);
        }
        for (Object a1 : aliens){
            Alien a = (Alien)a1;
            g2d.drawImage(a.getImage(), a.getX(), a.getY(), this);
        }
        Toolkit.getDefaultToolkit().sync();
    }



    public void cycle() {
       x += 1;
       y += 1;

       if (y > B_HEIGHT) {
           y = INITIAL_Y;
           x = INITIAL_X;
       }
       if (x > B_WIDTH) {
           y = INITIAL_Y;
           x = INITIAL_X;
       }

            repaint();
        }


    @Override
    public void run() {

        long beforeTime, timeDiff, sleep;

        beforeTime = System.currentTimeMillis();

        while (true) {

            playerShip.move();
            updateMissiles();
            updateAliens();
            checkCollisions();
            keyboard.poll();
            processInput();
            repaint();

            if (keyboard.keyDownOnce(KeyEvent.VK_ESCAPE))
                break;

            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0) {
                sleep = 2;
            }

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }

            beforeTime = System.currentTimeMillis();
        }
    }

    protected void processInput(){
        if (!keyboard.keyDown(KeyEvent.VK_DOWN)){
            playerShip.setDy(0);
        }
        if (!keyboard.keyDown(KeyEvent.VK_UP)){
            playerShip.setDy(0);
        }
        if (keyboard.keyDown(KeyEvent.VK_UP)){
            playerShip.setDy(-5);
        }
        if (keyboard.keyDown(KeyEvent.VK_DOWN)){
            playerShip.setDy(5);
        }

        if (!keyboard.keyDown(KeyEvent.VK_LEFT)){
            playerShip.setDx(0);
        }
        if (!keyboard.keyDown(KeyEvent.VK_RIGHT)){
            playerShip.setDx(0);
        }
        if (keyboard.keyDown(KeyEvent.VK_RIGHT)){
            playerShip.setDx(5);
        }
        if (keyboard.keyDown(KeyEvent.VK_LEFT)){
            playerShip.setDx(-5);
        }


        if(playerShip.getX() < 0){
            playerShip.setX(0);
        }
        if(playerShip.getX() >= (B_WIDTH - playerShip.getImageWidth())){
            playerShip.setX(B_WIDTH - playerShip.getImageWidth());
        }
        if(playerShip.getY() < 0){
            playerShip.setY(0);
        }
        if(playerShip.getY() >= (B_HEIGHT - playerShip.getImageHeight())){
            playerShip.setY(B_HEIGHT - playerShip.getImageHeight());
        }

        if(keyboard.keyDown(KeyEvent.VK_SPACE)){
            playerShip.fire();
        }

    }

    private void updateMissiles(){
        ArrayList ms = playerShip.getMissiles();
        for( int i = 0; i < ms.size(); i++){
            Missile m = (Missile)ms.get(i);
            if(m.isVisible()){
                m.move();
            } else {
                ms.remove(i);
            }
        }
    }

    private void updateAliens(){
        for( int i = 0; i < aliens.size(); i++){
            Alien a = (Alien)aliens.get(i);
            if(a.isVisible()){
                a.move();
            } else {
                aliens.remove(i);
            }
        }
    }

    public void checkCollisions(){
        Rectangle r3 = playerShip.getBounds();
        for (int i = 0; i < aliens.size(); i++){
            Alien a = (Alien)aliens.get(i);
            Rectangle r2 = a.getBounds();

            if(r2.intersects(r3)){
                playerShip.setVisible(false);
                a.setVisible(false);
            }
        }
        ArrayList<Missile> ms = playerShip.getMissiles();
        for (Missile m : ms){
            Rectangle r1 = m.getBounds();
            for (int i = 0; i < aliens.size(); i++){
                Alien a = (Alien)aliens.get(i);
                Rectangle r2 = a.getBounds();
                if (r1.intersects(r2)){
                    m.setVisible(false);
                    a.setVisible(false);
                }
            }
        }
    }
}