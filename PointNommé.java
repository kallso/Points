package Points;

public class PointNommé extends Point {
    public String getNom() {
        return nom;
    }

    public void renommer(String nom) {
        this.nom = nom;
    }

    String nom;

    PointNommé(double x, double y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.nom + super.toString();
    }
}
