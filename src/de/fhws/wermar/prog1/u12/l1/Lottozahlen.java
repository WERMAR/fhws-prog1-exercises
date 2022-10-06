package de.fhws.wermar.prog1.u12.l1;

/**
 * @author wermar
 */
public class Lottozahlen {

    private Lottozahl startNumber;

    public void init() {
        Lottozahl lastInsertNum = null;
        for (int i = 0; i < 49; i++) {
            var numberVal = new Lottozahl(i + 1);
            if (i == 0) {
                startNumber = numberVal;
            } else {
                lastInsertNum.setFollowingNumber(numberVal);
            }
            lastInsertNum = numberVal;
        }
    }

    public Lottozahl drawNumber() {
        var randomNum = (int) (Math.random() * 48);
        Lottozahl searchedNum = null;
        var previous = new Lottozahl();
        var lastNum = startNumber;
        for (int i = 0; i < randomNum; i++) {
            previous = lastNum;
            lastNum = lastNum.getFollowingNumber();
        }
        searchedNum = lastNum;
        previous.setFollowingNumber(searchedNum.getFollowingNumber());
        return searchedNum;
    }

    public void print() {
        var lastNumber = startNumber;
        var hasNext = true;
        while (hasNext) {
            System.out.print(lastNumber.getVal() + (hasNext(lastNumber) ? " | " : ""));
            hasNext = this.hasNext(lastNumber);
            lastNumber = lastNumber.getFollowingNumber();
        }
        System.out.println("--------------------");
    }

    private boolean hasNext(Lottozahl number) {
        return number.getFollowingNumber() != null;
    }
}
