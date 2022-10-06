package de.fhws.wermar.prog1.u12.l3.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wermar
 */
@Getter
@Setter
public class Node {

    private Node left;
    private Node right;
    private Node parent;
    private Content[] content;

}
