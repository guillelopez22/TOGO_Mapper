
package Classes;


public class Dij {

    private List vertices;
    private List relaciones;
    private List nodos_visitados;
    private List nodos_no_visitados;
    private List predecesores;
    private List distancia;

    public Dij(Grafo graph) {
        this.vertices = graph.getVertices();
        this.relaciones = graph.getRelaciones();
    }

    public void execute(Vertice source) {
        nodos_visitados = new List();
        nodos_no_visitados = new List();
        distancia = new List();
        predecesores = new List();
        distancia.insert(new Distancia(source, 0), distancia.size());
        nodos_no_visitados.insert(source, nodos_no_visitados.size());
        while (nodos_no_visitados.size() > 0) {
            Vertice node = getMinimum(nodos_no_visitados);
            nodos_visitados.insert(node, nodos_visitados.size());
            for (int i = 0; i < nodos_visitados.size(); i++) {
                if (node.equals(nodos_no_visitados.get(i))) {
                    nodos_no_visitados.delete(i);
                }
            }
            DistanciasMinimas(node);
        }
    }

    private void DistanciasMinimas(Vertice node) {
        List adjacentNodes = getNeighbors(node);
        for (int i = 0; i < adjacentNodes.size(); i++) {
            if (getMasCorto((Vertice)adjacentNodes.get(i)) > getMasCorto(node)
                    + getDistance(node, (Vertice)adjacentNodes.get(i))) {
                distancia.insert(new Distancia((Vertice)adjacentNodes.get(i), getMasCorto(node)
                        + getDistance(node, (Vertice)adjacentNodes.get(i))), distancia.size());
                predecesores.insert(new Predecesor((Vertice)adjacentNodes.get(i), node), predecesores.size());
                nodos_no_visitados.insert((Vertice)adjacentNodes.get(i), nodos_no_visitados.size());
            }
        }

    }

    private int getDistance(Vertice node, Vertice target) {
        for (int i = 0; i < relaciones.size(); i++) {
            if (((Relacion)relaciones.get(i)).getV1().equals(node)
                    && ((Relacion)relaciones.get(i)).getV2().equals(target)) {
                return ((Relacion)relaciones.get(i)).getLongitud();
            }
        }
        return -1;
    }

    private List getNeighbors(Vertice node) {
        List neighbors = new List();
        for (int i = 0; i < relaciones.size(); i++) {
            if (((Relacion)relaciones.get(i)).getV1().equals(node)
                    && !isSettled(((Relacion)relaciones.get(i)).getV2())) {
                neighbors.insert(((Relacion)relaciones.get(i)).getLongitud(), neighbors.size());
            }
        }
        return neighbors;
    }

    private Vertice getMinimum(List vertexes) {
        Vertice minimum = null;
        for (int i = 0; i < vertexes.size(); i++) {
            if (minimum == null) {
                minimum = (Vertice)vertexes.get(i);
            } else {
                if (getMasCorto((Vertice)vertexes.get(i)) < getMasCorto(minimum)) {
                    minimum = (Vertice)vertexes.get(i);
                }
            }
        }
        return minimum;
    }

    private boolean isSettled(Vertice vertex) {
        boolean settled = false;
        for (int i = 0; i < nodos_visitados.size(); i++) {
            if (vertex.equals(nodos_visitados.get(i))) {
                settled =  true;
            }
        }
        return settled;
    }

    private int getMasCorto(Vertice destination) {
        Integer d = null;
        for (int i = 0; i < distancia.size(); i++) {
            if (destination.equals(((Distancia)distancia.get(i)).getNode())) {
                d = ((Distancia)distancia.get(i)).getDistance();
            }
        }
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    public List getPath(Vertice target) {
        List path = new List();
        Vertice step = target;
        boolean exists = false;
        for (int i = 0; i < predecesores.size(); i++) {
            if (step.equals(((Predecesor)predecesores.get(i)).getNode1()) || step.equals(((Predecesor)predecesores.get(i)).getNode2()) ) {
                exists = true;
            }
        }
        if (!exists) {
            return null;
        }
        path.insert(step, path.size());
        for (int i = 0; i < predecesores.size(); i++) {
            if (step.equals(((Predecesor)predecesores.get(i)).getNode1()))  {
                step = ((Predecesor)predecesores.get(i)).getNode1();
                path.insert(step, path.size());
            }else if (step.equals(((Predecesor)predecesores.get(i)).getNode2())) {
                step = ((Predecesor)predecesores.get(i)).getNode2();
                path.insert(step, path.size());
            }
        }

        return path;
    }

}

