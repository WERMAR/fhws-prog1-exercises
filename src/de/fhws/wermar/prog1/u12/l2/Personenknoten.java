package de.fhws.wermar.prog1.u12.l2;

/**
 * @author wermar
 */
public class Personenknoten {

    private int alter;
    private String nachname;

    public Personenknoten(int alter, String nachname) {
        this.alter = alter;
        this.nachname = nachname;
    }

    private Personenknoten previous;

    private Personenknoten afterwards;

    public Personenknoten getPrevious() {
        return previous;
    }

    public void setPrevious(Personenknoten previous) {
        this.previous = previous;
    }

    public Personenknoten getAfterwards() {
        return afterwards;
    }

    public void setAfterwards(Personenknoten afterwards) {
        this.afterwards = afterwards;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public boolean hasNext(boolean previous) {
        return previous ? this.previous != null : this.afterwards != null;
    }
}
