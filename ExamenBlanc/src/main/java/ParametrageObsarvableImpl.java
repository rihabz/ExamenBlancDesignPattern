import java.util.ArrayList;
import java.util.List;

public class ParametrageObsarvableImpl implements ParametrageObsarvable {
    public int borderSize;
    public int borderColor;
    public int colorFill;
    private List<Dessin> observers=new ArrayList<>();
    @Override
    public void addObserver(Dessin d) {
        observers.add(d);
    }

    @Override
    public void removeObserver(Dessin d) {
        observers.remove(d);
    }

    @Override
    public void notifyObservers() {
        for(Dessin d:observers){
            d.update(this);
        }
    }

    public ParametrageObsarvableImpl() {
    }


    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
        notifyObservers();
    }

    public int getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(int borderColor) {
        this.borderColor = borderColor;
        notifyObservers();
    }

    public int getColorFill() {
        return colorFill;
    }

    public void setColorFill(int colorFill) {
        this.colorFill = colorFill;
        notifyObservers();
    }
}
