public class Rectangle extends Dessin {
    private Point coinGauche;
    private double largeur;
    private double hauteur;

    @Override
    double perimetre() {
        return (hauteur+largeur)*2;
    }

    @Override
    double surface() {
        return largeur*hauteur;
    }

    @Override
    void update(ParametrageObsarvable po) {

        System.out.println("les paramètres ont changé");
    }

    public Rectangle(Point coinGauche, double largeur, double hauteur) {
        this.coinGauche = coinGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle() {
    }

    public Point getCoinGauche() {
        return coinGauche;
    }

    public void setCoinGauche(Point coinGauche) {
        this.coinGauche = coinGauche;
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "coinGauche=" + coinGauche +
                ", largeur=" + largeur +
                ", hauteur=" + hauteur +
                '}';
    }
}
