package restwithspringjpdravila;

public class Greeting {

    private final long id;
    private final String contens;

    public Greeting(long id, String contens) {
        this.id = id;
        this.contens = contens;
    }

    public long getId() {
        return id;
    }

    public String getContens() {
        return contens;
    }
}
