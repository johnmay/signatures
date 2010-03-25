package signature.simple;

import signature.AbstractQuotientGraph;

public class SimpleQuotientGraph extends AbstractQuotientGraph {
    
    private SimpleGraph graph;
    
    public SimpleQuotientGraph(SimpleGraph graph) {
        super();
        this.graph = graph;
        
        SimpleGraphSignature graphSignature = new SimpleGraphSignature(graph);
        super.construct(graphSignature.getSymmetryClasses());
    }

    public boolean isConnected(int i, int j) {
        return graph.isConnected(i, j);
    }

}
