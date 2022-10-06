package de.fhws.wermar.prog1.u12.l1;

import java.util.Arrays;
import java.util.List;

/**
 * @author wermar
 */
public class LottozahlenService {

    public static Lottozahl[] drawedNumber = new Lottozahl[6];

    public static void main(String[] args) {
        System.out.println("@@@@@ Game is will start");
        var game = new Lottozahlen();
        game.init();
        System.out.println("@@@@@ Game is initialized");
        game.print();
        for (int i = 0; i < drawedNumber.length; i++) {
            drawedNumber[i] = game.drawNumber();
        }
        List<Lottozahl> collect = Arrays.stream(drawedNumber).sorted(Lottozahl::compareTo).toList();
        for (Lottozahl lottozahl : collect) {
            System.out.print(lottozahl.getVal() + " ");
        }
    }
}
