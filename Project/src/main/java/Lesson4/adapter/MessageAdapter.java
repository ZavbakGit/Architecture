package Lesson4.adapter;

public class MessageAdapter extends Message {
    MyMessage myMessage;

    public MessageAdapter(MyMessage myMessage) {
        super(null);
        this.myMessage = myMessage;
    }

    @Override
    public String getMessage() {
        return myMessage.getDescription();
    }
}
