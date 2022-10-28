import java.io.Serializable;

public abstract class Dessin implements Serializable {
    protected ITraitement it;
    abstract double perimetre();
    abstract double surface();
    //observer
    abstract void update(ParametrageObsarvable po);

    public void appliquerTraiter(){
        it.traiter();
    }
    public void setTraiter(ITraitement t){
        this.it=t;
    }
}
