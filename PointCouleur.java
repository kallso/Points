package Points;

public class PointCouleur extends Point {
    public String getNom() {
        return couleur;
    }

    public void renommer(String couleur) {
        this.couleur = couleur;
    }

    String couleur;

    PointCouleur(double x, double y, String couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return this.couleur + super.toString();
    }
}
