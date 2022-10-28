import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Figures extends Dessin {
   private List<Dessin> dessins=new ArrayList<Dessin>();
    @Override
    double perimetre() {
        for(int i=0;i<dessins.size();i++)
          for(Dessin d:dessins)
            System.out.println( d.perimetre()+" ");
        return 0;
    }

    @Override
    double surface() {
        for(int i=0;i<dessins.size();i++)
            for(Dessin d:dessins)
                System.out.println( d.surface()+" ");
        return 0;
    }

    @Override
    void update(ParametrageObsarvable po) {

    }
    public void add(Dessin d){
        dessins.add(d);
    }
    public void remove(Dessin d){
        dessins.remove(d);
    }
    public List<Dessin> getChilds(){
        return dessins;
    }
    public void serialise(Dessin d) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("dessin.serial");
            ObjectOutputStream oos= null;
            try {
                oos = new ObjectOutputStream(fos);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.writeObject(d);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println( " l'objet dessin a ete serialise");


        }catch(IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public String toString() {
        return "Figures{" +
                "dessins=" + dessins +
                '}'+"\n";
    }
}
