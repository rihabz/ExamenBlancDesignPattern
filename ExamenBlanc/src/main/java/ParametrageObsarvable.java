public interface ParametrageObsarvable {
    public void addObserver(Dessin d);
    public void removeObserver(Dessin d);
    public void notifyObservers();
}
