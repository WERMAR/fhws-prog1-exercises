package de.fhws.wermar.prog1.u12.l3.application;

import de.fhws.wermar.prog1.u12.l3.domain.Content;
import de.fhws.wermar.prog1.u12.l3.domain.Node;
import de.fhws.wermar.prog1.u12.l3.interfaces.BinarySearchTree;
import de.fhws.wermar.prog1.u12.l3.interfaces.BinaryTree;
import de.fhws.wermar.prog1.u12.l3.interfaces.NodeVisitor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.Deque;

@Service
@RequiredArgsConstructor
public class TreeHandler implements BinarySearchTree {

    private final BinaryTree tree;

    @Override
    public Node searchNode(Content content) {
        return null;
    }

    @Override
    public void insertNode(Content content) {

    }

    @Override
    public void deleteNode(Content content) {

    }

    @Override
    public void traverseInOrder(NodeVisitor visitor) {
        Node node = this.tree.getRoot();

        Deque<Node> stack = new ArrayDeque<>();
        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.getLeft();
            } else {
                node = stack.pop();
                visitor.visit(node);
                node = node.getRight();
            }
        }
    }

    @Override
    public Node getRoot() {
        return this.tree.getRoot();
    }
}
