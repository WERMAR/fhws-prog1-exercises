package de.fhws.wermar.prog1.u12.l1;

/**
 * @author wermar
 */
public class Lottozahl implements Comparable {
    private int val;
    private Lottozahl followingNumber;

    public Lottozahl() {
        this.val = -1;
        this.followingNumber = null;
    }

    public Lottozahl(int val) {
        this.val = val;
        this.followingNumber = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Lottozahl getFollowingNumber() {
        return followingNumber;
    }

    public void setFollowingNumber(Lottozahl followingNumber) {
        this.followingNumber = followingNumber;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Lottozahl) {
            return this.getVal() < ((Lottozahl) o).getVal() ? -1 : +1;
        }
        throw new RuntimeException("Object was not compareable because it was not equal to the expected Type");
    }
}
