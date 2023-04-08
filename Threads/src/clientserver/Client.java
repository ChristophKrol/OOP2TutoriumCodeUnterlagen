package clientserver;

public class Client extends Thread{

    String address;
    Server server;

    public Client(String url, Server server) {
        this.address = url;
        this.server = server;
    }

    public synchronized void sendRequest() throws InterruptedException {
        this.server.receiveRequest(this);
        wait();


    }

    public void run(){
        this.server.receiveRequest(this);
    }
}
