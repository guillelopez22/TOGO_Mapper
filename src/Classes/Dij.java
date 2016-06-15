
package Classes;


   public class Dij {

    private Grafo graph;
    private String initialVertexLabel;
    private HashMap<String, String> predecessors;

    private HashMap<String, Integer> distances;

    private PriorityQueue<Vertex> availableVertices;

    private HashSet<Vertex> visitedVertices;

     

     

    public Dijkstra(Graph graph, String initialVertexLabel){

        this.graph = graph;

        Set<String> vertexKeys = this.graph.vertexKeys();

         

        if(!vertexKeys.contains(initialVertexLabel)){

            throw new IllegalArgumentException("The graph must contain the initial vertex.");

        }

         

        this.initialVertexLabel = initialVertexLabel;

        this.predecessors = new HashMap<String, String>();

        this.distances = new HashMap<String, Integer>();

        this.availableVertices = new PriorityQueue<Vertex>(vertexKeys.size(), new Comparator<Vertex>(){

             

            public int compare(Vertex one, Vertex two){

                int weightOne = Dijkstra.this.distances.get(one.getLabel());

                int weightTwo = Dijkstra.this.distances.get(two.getLabel());

                return weightOne - weightTwo;

            }

        });

         

        this.visitedVertices = new HashSet<Vertex>();
        for(String key: vertexKeys){

            this.predecessors.put(key, null);

            this.distances.put(key, Integer.MAX_VALUE);

        }

         
        this.distances.put(initialVertexLabel, 0);
        Vertex initialVertex = this.graph.getVertex(initialVertexLabel);

        ArrayList<Edge> initialVertexNeighbors = initialVertex.getNeighbors();

        for(Edge e : initialVertexNeighbors){

            Vertex other = e.getNeighbor(initialVertex);

            this.predecessors.put(other.getLabel(), initialVertexLabel);

            this.distances.put(other.getLabel(), e.getWeight());

            this.availableVertices.add(other);

        }
        this.visitedVertices.add(initialVertex);
        processGraph();
    }
    private void processGraph(){
        while(this.availableVertices.size() > 0){
            Vertex next = this.availableVertices.poll();

            int distanceToNext = this.distances.get(next.getLabel());
            List<Edge> nextNeighbors = next.getNeighbors();    
            for(Edge e: nextNeighbors){
                Vertex other = e.getNeighbor(next);
                if(this.visitedVertices.contains(other)){
                    continue;
                }
                int currentWeight = this.distances.get(other.getLabel());
                int newWeight = distanceToNext + e.getWeight();
                 
                if(newWeight < currentWeight){

                    this.predecessors.put(other.getLabel(), next.getLabel());

                    this.distances.put(other.getLabel(), newWeight);

                    this.availableVertices.remove(other);

                    this.availableVertices.add(other);

                }
            }

            this.visitedVertices.add(next);

        }
    }
    public List<Vertex> getPathTo(String destinationLabel){
        LinkedList<Vertex> path = new LinkedList<Vertex>();
        path.add(graph.getVertex(destinationLabel));
        while(!destinationLabel.equals(this.initialVertexLabel)){
            Vertex predecessor = graph.getVertex(this.predecessors.get(destinationLabel));
            destinationLabel = predecessor.getLabel();
            path.add(0, predecessor);
        }
        return path;
    }
    public int getDistanceTo(String destinationLabel){
        return this.distances.get(destinationLabel);
    }
