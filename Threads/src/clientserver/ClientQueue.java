package clientserver;

public class ClientQueue {

    List list = new List();

    public void enqueue(Client client){
        this.list.add(client);
    }

    public void dequeue(){
        this.list = this.list.next;
    }



}
