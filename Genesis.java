import java.util.*;
public class Genesis{
    Node genesis ;    
public class Node {
    
    Date timestamp = new Date("DD//MM//YYYY");
    String data ;
    int nodeNumber ; 
    String nodeId;
    Node referenceNodeId;
    
    Node childReferenceNodeId;
    
     Scanner scn = new Scanner(System.in);
    
    
    // Constructor to initialize the code
    public  Node(int nodeNumber){
        this.data = data;
        this.nodeNumber = nodeNumber;
        this.nodeId = nodeId;
        this.referenceNodeId = null;
        this.childReferenceNodeId = null;
        
    }
    }
    
public  Genesis(){
    this.genesis = null;
}   

public void  childNode(int nodeNumber) {
    Node nn == new Node(nodeNumber);
    if(genesis == null)
    genesis = nn;
    nn.data = "A";
    nn.nodeId = "0000"; 
    return genesis;
}
else
{
    if(nn.nodeNumber < genesis.nodeNumber){
        Node temp = childNode(genesis.childReferenceNodeId);
        temp.referenceNodeId = nn ;
        return genesis;
    }
    else{
        return genesis;
    }
    
}

public void childNode(){
    genesis = childNode(genesis);
}

public void leftChain(Node genesis) {
    if(genesis == null)
        return ;
    else {
        System.out.print(genesis.data + " ");
        leftchain(genesis.childReferenceNodeId);
      
    }
}

public void longestChain(Node genesis) {
    if(genesis == null){
        return ;
    }else{
        System.out.print(genesis.data);
        longestChain(genesis.childReferenceNodeId);
        longestChain(genesis.referenceNodeId);
    }    
}

    
}
    
}    
    
    