package Model;

public class Message implements Comparable<Message>{
    private Long senderId;
    private String message;

    public Message(Long senderId, String message){
        this.senderId = senderId;
        this.message = message;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int compareTo(Message o) {
        return this.senderId.compareTo(o.getSenderId());
    }
}
