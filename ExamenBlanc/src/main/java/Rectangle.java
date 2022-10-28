public class Rectangle extends Dessin{
    private Point pointSupérieur;
    private double largeur;
    private double hauteur;

    public Rectangle(Point pointSupérieur, double largeur, double hauteur) {
        this.pointSupérieur = pointSupérieur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Point getPointSupérieur() {
        return pointSupérieur;
    }

    public void setPointSupérieur(Point pointSupérieur) {
        this.pointSupérieur = pointSupérieur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

}
