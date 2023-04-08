package clientserver;



public class Server extends Thread{

    String youtubeIPAddress = "142.250.186.110";
    String twitterIPAddress = "104.244.42.129";
    String hs_niederrheinIPAddress = "194.94.120.88";

    ClientQueue clients = new ClientQueue();


    public synchronized void receiveRequest(Client client){
        clients.enqueue(client);

    }


    private void sendResponse(){

    }


}
