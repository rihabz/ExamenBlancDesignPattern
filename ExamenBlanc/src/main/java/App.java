import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Point p1=new Point(3,2);
        Point p2=new Point(1,2);
//Test Composite
        Figures root=new Figures();
        Figures figure=new Figures();

        root.add(figure);

        figure.add(new Cercle(p1,3));
        figure.add(new Rectangle(p1,4,3));

        root.add(new Cercle(p2,5));
        root.add(new Cercle(p2,2));
        System.out.println(root.getChilds());

        /*Cercle c1=new Cercle(p2,2);
        root.serialise(c1);

        System.out.println("La surface de cercle: "+c1.perimetre());
        System.out.println("La surface de cercle: "+c1.surface());

        Rectangle r1=new Rectangle(p1,4,3);
        System.out.println("Le perimetre du rect: "+r1.perimetre());
        System.out.println("La surface du rect: "+r1.surface());*/

//Test Observer

        /* ParametrageObsarvableImpl observable= new ParametrageObsarvableImpl();
        Cercle c1=new Cercle(p2,2);
        Rectangle r1=new Rectangle(p1,4,3);
        System.out.println("--------Changement d'état------");
        observable.setBorderColor(654772515 );
        observable.addObserver(c1);
        observable.addObserver(r1);
        observable.setBorderSize(12);*/

//Test Strategy

        Point p3=new Point(0,1);
        Dessin dessin=new Cercle(p3,2);
        dessin.setTraiter(new ITraitementImpl1());
        dessin.appliquerTraiter();
        dessin.setTraiter(new ITraitementImpl2());
        dessin.appliquerTraiter();
    }

}
