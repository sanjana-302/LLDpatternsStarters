package BehavioralDesignPattern.MediatorPattern;

public class Bot extends AbstractUserToShareEqualsandHashcode{
    
    public Bot(String name,IMediator m) {
            super(name,m);
        }
    
    @Override
    public void sendMessage(String message, String reciever) {
        mediator.sendP2Pmessage(message,this.name,reciever);
    }

    @Override
    public void getMessage(String message, String userID) {
        System.out.println("Recieved message is :" + message + " from user " + userID);
    }

    @Override
    public void sendBroadCastMessage(String message) {
        mediator.sendBroadCastMessage(message,this.name);
    }
}
