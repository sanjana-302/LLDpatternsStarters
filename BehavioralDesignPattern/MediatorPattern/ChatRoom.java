package BehavioralDesignPattern.MediatorPattern;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom implements IMediator{

    Set<IUser> userMapping;

    public ChatRoom(){
        userMapping = new HashSet<>();
    }

    public void addUser(IUser u){
        userMapping.add(u);
    }

    public void removeUser(IUser u){
        userMapping.remove(u);
    }

    @Override
    public void sendBroadCastMessage(String message, String sender) {
        for(IUser u : userMapping){
            u.getMessage(message, sender);
        }
    }

    @Override
    public void sendP2Pmessage(String message,String sender,String reciever) {
        for(IUser u : userMapping){
            if(u.getName().equals(reciever)){
                u.getMessage(message, sender);
            }
        }
    }
    
}
