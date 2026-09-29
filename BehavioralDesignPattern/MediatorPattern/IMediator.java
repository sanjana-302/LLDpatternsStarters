package BehavioralDesignPattern.MediatorPattern;

public interface IMediator {
    public void sendBroadCastMessage(String message,String userID);
    public void sendP2Pmessage(String message,String sender,String reciever);
}
