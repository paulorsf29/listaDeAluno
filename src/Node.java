public class Node {
    Aluno aluno;
    Node next;
    Node prev;
    public Node(Aluno aluno, Node next, Node prev) {
        this.aluno = aluno;
        this.next = next;
        this.prev = prev;
    }
    
}
