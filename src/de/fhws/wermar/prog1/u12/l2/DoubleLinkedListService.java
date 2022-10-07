package de.fhws.wermar.prog1.u12.l2;

import java.util.NoSuchElementException;
import java.util.Random;

/**
 * @author wermar
 */
public class DoubleLinkedListService {


    public static void main(String[] args) {
        Liste liste = new Liste();
        for (int i = 0; i < 5; i++) {
            liste.save(createRandomPersonenknoten());
        }

        boolean hasNext = liste.getEntryPoint().hasNext(false);
        Personenknoten lastRecord = liste.getEntryPoint();
        while (hasNext) {
            System.out.println("Record: { " + " " + lastRecord.getNachname() + " : " + lastRecord.getAlter() + " }");
            hasNext = lastRecord.hasNext(false);
            if (hasNext) {
                lastRecord = lastRecord.getAfterwards();
            }
        }
        hasNext = true;
        System.out.println("-----------------------");
        while (hasNext) {
            System.out.println("Record: { " + " " + lastRecord.getNachname() + " : " + lastRecord.getAlter() + " }");
            hasNext = lastRecord.hasNext(true);
            if (hasNext) {
                lastRecord = lastRecord.getPrevious();
            }
        }


        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        String searchedNamed = "Bauer";
        Personenknoten findNode = liste.search(searchedNamed, liste.getEntryPoint());
        if (findNode == null) {
            System.err.println("Node of Personenknoten with Name: " + searchedNamed + " find");
            throw new NoSuchElementException("Node of Personenknoten with Name: " + searchedNamed + " find");
        } else {
            System.out.println("Founded Node: " + findNode.getAlter() + " | " + findNode.getNachname());
        }
    }

    private static Personenknoten createRandomPersonenknoten() {
        Random random = new Random();
        int randomize = random.nextInt(99);
        Personenknoten personenknoten = new Personenknoten(20, "");
        personenknoten.setAlter(randomize);
        personenknoten.setNachname(getRandomName(randomize));
        return personenknoten;
    }

    private static String getRandomName(int randomize) {
        if (randomize <= 25) {
            return randomize >= 20 ? "Peter" : "Hans";
        } else if (randomize <= 40) {
            return randomize >= 35 ? "Herbert" : "Müller";
        } else if (randomize <= 60) {
            return randomize >= 52 ? "Gerhard" : "Siebert";
        } else {
            return randomize >= 70 ? "Bauer" : "Ludwig";
        }
    }
}
