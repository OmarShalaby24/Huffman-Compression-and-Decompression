public class Node {
    char data;
    int freq;
    Node left;
    Node right;


    public static void printNode(Node x){
        System.out.println("["+x.data+","+x.freq+"]");
    }
}
