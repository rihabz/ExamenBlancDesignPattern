public class Cercle extends Dessin{
   private Point center;
   private double rayon;
    @Override
    double perimetre() {
        return 2*(this.rayon)*Math.PI;
    }

    @Override
    double surface() {
        return Math.pow(this.rayon,2)*Math.PI;
    }

    @Override
    void update(ParametrageObsarvable po) {
        System.out.println("l'etat est changée");
    }

    public Cercle(Point center, double rayon) {
        this.center = center;
        this.rayon = rayon;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "center=" + center +
                ", rayon=" + rayon +
                '}';
    }
}
