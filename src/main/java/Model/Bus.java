package Model;

import java.util.*;

public class Bus {
    private List<Message> listaMesaje;
    private Integer pas;

    public Bus(){
        listaMesaje = new ArrayList<Message>();
        pas = 0;
    }

    protected void arbitrate(){
        Collections.sort(listaMesaje);
    }

    public void sendMessage(Message message){
        listaMesaje.add(message);
        arbitrate();
    }

    public List<Message> getListaMesaje(){
        return listaMesaje;
    }

}
