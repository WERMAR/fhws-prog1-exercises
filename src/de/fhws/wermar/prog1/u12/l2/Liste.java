package de.fhws.wermar.prog1.u12.l2;

/**
 * @author wermar
 */
public class Liste {

    private Personenknoten entryPoint;

    public Personenknoten save(Personenknoten data) {
        if (this.entryPoint == null) {
            this.entryPoint = data;
            return data;
        } else {
            if (data.getAlter() < entryPoint.getAlter()) {
                data.setAfterwards(entryPoint);
                entryPoint.setPrevious(data);
                this.entryPoint = data;
                return data;
            } else {
                return this.insert(data, entryPoint);
            }
        }
    }

    public Personenknoten search(String name, Personenknoten currentNode) {
        if (currentNode.getNachname().equals(name)) {
            return currentNode;
        }
        if (currentNode.hasNext(false)) {
            return search(name, currentNode.getAfterwards());
        }
        return null;
    }

    private Personenknoten insert(Personenknoten data, Personenknoten currentNode) {
        if (data.getAlter() < currentNode.getAlter()) {
            data.setPrevious(currentNode.getPrevious());
            currentNode.getPrevious().setAfterwards(data);
            data.setAfterwards(currentNode);
            currentNode.setPrevious(data);
            return data;
        } else if (!currentNode.hasNext(false)) {
            if (data.getAlter() < currentNode.getAlter()) {
                data.setPrevious(currentNode.getPrevious());
                data.setAfterwards(currentNode);
                currentNode.getPrevious().setAfterwards(data);
                currentNode.setPrevious(data);
            } else {
                data.setPrevious(currentNode);
                currentNode.setAfterwards(data);
            }
            return data;
        } else {
            return this.insert(data, currentNode.getAfterwards());
        }
    }

    public Personenknoten getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(Personenknoten entryPoint) {
        this.entryPoint = entryPoint;
    }


}
