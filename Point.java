package Points;

public class Point {
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point autre) {
        return Math.sqrt(Math.pow(this.x - autre.getX(), 2) + Math.pow(this.y - autre.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
}
