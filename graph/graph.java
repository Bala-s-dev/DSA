package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class graph {
    HashMap<String, ArrayList> graphList = new HashMap<>();

    public void printGraph(){
        System.out.println(graphList);
    }
    public boolean addVertex(String vertex){
        if(graphList.get(vertex) == null){
            graphList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
    public boolean addEdge(String vertex1 , String vertex2){
        if(graphList.get(vertex1) != null && graphList.get(vertex2) != null){

            graphList.get(vertex1).add(vertex2);
            graphList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    public boolean removeEdge(String vertex1 , String vertex2){
        if(graphList.get(vertex1) != null && graphList.get(vertex2) != null){
            graphList.get(vertex1).remove(vertex2);
            graphList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
    public boolean removeVertex(String vertex){
        if(graphList.get(vertex) == null) return false;
        ArrayList<String> vertes = new ArrayList<>();
        vertes = graphList.get(vertex);
        for(String otherVertex : vertes){   // { A: ->get["B","C"]}
            graphList.get(otherVertex).remove(vertex);
        }
        graphList.remove(vertex);
        return true;
    }
}
