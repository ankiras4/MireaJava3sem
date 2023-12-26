package Tasks.Task6;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.print("Движение точки вверх()");

    }

    @Override
    public void moveDown() {
        System.out.print("Движение точки вверх()");
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}

class MovableCircle implements Movable{
    private int radius;

    private MovablePoint movablepoint;

    public MovableCircle(int radius, MovablePoint movablepoint) {
        this.radius = radius;
        this.movablepoint = movablepoint;
    }

    @Override
    public void moveUp() {
        movablepoint.y++;
    }

    @Override
    public void moveDown() {
        movablepoint.y--;
    }

    @Override
    public void moveLeft() {
        movablepoint.x--;
    }

    @Override
    public void moveRight() {
        movablepoint.x++;
    }
}