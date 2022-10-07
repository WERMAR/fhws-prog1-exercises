package de.fhws.wermar.prog1.u12.l3.interfaces;

import de.fhws.wermar.prog1.u12.l3.domain.Content;
import de.fhws.wermar.prog1.u12.l3.domain.Node;

/**
 * @author wermar
 */
public interface BinarySearchTree extends BinaryTree {

    Node searchNode(Content content);

    void insertNode(Content content);

    void deleteNode(Content content);

    void traverseInOrder(NodeVisitor visitor);
}
