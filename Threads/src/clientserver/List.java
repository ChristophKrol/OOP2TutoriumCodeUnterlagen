package clientserver;

public class List {
    Client client;
    List next;

    public List(){}

    public List(Client client){
        this.client = client;
    }



    public void add(Client client){
        if (this.client == null){
            this.client = client;
        }
        else if (this.next == null){
            this.next = new List(client);
        }
        else {
            this.next.add(client);
        }
    }
}
