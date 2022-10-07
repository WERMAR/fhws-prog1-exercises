package de.fhws.wermar.prog1.u2.l1;

/**
 * @author wermar
 */
public class CircleBullet {

    public static void main(String[] args) {
        var radius = 2;
        var circularArea = Math.PI * Math.pow(radius, 2);
        var circumference = 2 * Math.PI * radius;
        var bulletVolume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Used Radius: " + radius);
        System.out.println("Circular Area: " + circularArea);
        System.out.println("Circumference: " + circumference);
        System.out.println("Volume Bullet: " + bulletVolume);
    }
}
