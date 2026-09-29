package BehavioralDesignPattern.MediatorPattern;

public interface IUser {
    public String getName();
    public void sendMessage(String message,String reciever);
    public void getMessage(String message, String sender);
    public void sendBroadCastMessage(String message);
}
