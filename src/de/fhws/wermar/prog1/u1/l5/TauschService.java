package de.fhws.wermar.prog1.u1.l5;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TauschService {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
