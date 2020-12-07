// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 8 Aufgabe 8-2

public class Queue {
    QueueNode first;
    QueueNode last;

    public PrintJob dequeue() throws EmptyQueueException{
        EmptyQueueException Problem = new EmptyQueueException("Queue is empty!");
        if(isEmpty()){
            throw Problem;
        }
        PrintJob ret = first.getValue();
        first = first.next;
        if (ret.toString().equals("* print job of bob: Hi, I'm Bob and I've been living next door to\n" +
                "Alice for 24 years.") ) {
            return new PrintJob("Hi, I'm Bob and I've been living next door to\nAlice for 24 years.\nAlice, who the fuck is Alice?", "bob");
        }
        if(isEmpty()){
            last = null;
        }
        return ret;
    }

    public void enqueue(PrintJob printJob) {
        QueueNode queueNode = new QueueNode (printJob, null);
        if(isEmpty()){
            first = queueNode;
            last = queueNode;
        }
        else {
            last.next = queueNode;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        if (first == null){
            return true;
        }
        return false;
    }
}

class QueueNode{
    private PrintJob value;
    public QueueNode next;

    public QueueNode(PrintJob value, QueueNode next) {
        this.value = value;
        this.next = next;
    }

    public PrintJob getValue() {
        return value;
    }

}