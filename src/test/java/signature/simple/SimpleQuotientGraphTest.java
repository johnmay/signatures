package signature.simple;

import junit.framework.Assert;

import org.junit.Test;

public class SimpleQuotientGraphTest extends AbstractSimpleGraphTest {
    
    public void checkParameters(SimpleQuotientGraph qGraph,
                                int expectedVertexCount, 
                                int expectedEdgeCount, 
                                int expectedLoopEdgeCount) {
        System.out.println(qGraph);
        Assert.assertEquals(expectedVertexCount, qGraph.getVertexCount());
        Assert.assertEquals(expectedEdgeCount, qGraph.getEdgeCount());
        Assert.assertEquals(expectedLoopEdgeCount, qGraph.numberOfLoopEdges());
        
    }
    
    @Test
    public void cubeTest() {
        SimpleGraph cube = AbstractSimpleGraphTest.makeCube();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(cube);
        checkParameters(quotientGraph, 1, 1, 1);
    }
    
    @Test
    public void truncatedTetrahedronTest() {
        SimpleGraph truncatedTetrahedron = 
            AbstractSimpleGraphTest.makeTruncatedTetrahedron();
        SimpleQuotientGraph quotientGraph = 
            new SimpleQuotientGraph(truncatedTetrahedron);
        checkParameters(quotientGraph, 1, 1, 1);
    }

    @Test
    public void adamantaneTest() {
        SimpleGraph adamantane = AbstractSimpleGraphTest.makeAdamantane();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(adamantane);
        checkParameters(quotientGraph, 2, 1, 0);
    }
    
    @Test
    public void cuneaneTest() {
        SimpleGraph cuneane = AbstractSimpleGraphTest.makeCuneane();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(cuneane);
        checkParameters(quotientGraph, 3, 5, 3);
    }
    
    @Test
    public void twistaneTest() {
        SimpleGraph twistane = AbstractSimpleGraphTest.makeTwistane();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(twistane);
        checkParameters(quotientGraph, 3, 4, 2);
    }
    
    @Test
    public void napthaleneTest() {
        SimpleGraph napthalene = AbstractSimpleGraphTest.makeNapthalene();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(napthalene);
        checkParameters(quotientGraph, 3, 4, 2);
    }
    
    @Test
    public void squareQuotientGraphTest() {
        SimpleGraph squareQuotientGraph = 
            AbstractSimpleGraphTest.makeSquareQuotientGraph();
        SimpleQuotientGraph quotientGraph = 
            new SimpleQuotientGraph(squareQuotientGraph);
        checkParameters(quotientGraph, 4, 4, 0);
    }
    
    @Test
    public void doubleBridgedPentagonTest() {
        SimpleGraph g = AbstractSimpleGraphTest.makeDoubleBridgedPentagon();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(g);
        checkParameters(quotientGraph, 4, 5, 1);
    }

    @Test
    public void bowtieaneQuotientGraphTest() {
        SimpleGraph bowtieane = AbstractSimpleGraphTest.makeBowtieane();
        SimpleQuotientGraph quotientGraph = new SimpleQuotientGraph(bowtieane);
        checkParameters(quotientGraph, 4, 5, 2);
    }
    
    @Test
    public void diSpiroOctaneQuotientGraphTest() {
        SimpleGraph diSpiroOctane = AbstractSimpleGraphTest.makeDiSpiroOctane();
        SimpleQuotientGraph quotientGraph = 
            new SimpleQuotientGraph(diSpiroOctane);
        checkParameters(quotientGraph, 5, 6, 1);
    }

}