package de.fhws.wermar.prog1.u12.l3.application;

import de.fhws.wermar.prog1.u12.l3.domain.Node;
import de.fhws.wermar.prog1.u12.l3.interfaces.BinaryTree;

/**
 * @author wermar
 */
public class BaseBinaryTree implements BinaryTree {

    private Node node;

    @Override
    public Node getRoot() {
        return node;
    }
}
