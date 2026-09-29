package BehavioralDesignPattern.MediatorPattern;

import java.util.Objects;

public abstract class AbstractUserToShareEqualsandHashcode implements IUser{

    String name;
    IMediator mediator;

    public AbstractUserToShareEqualsandHashcode(String name, IMediator m){
        this.name = name;
        mediator = m;
    }

    public String getName(){
        return this.name;
    }

    // 1. Override equals to compare the 'name' field instead of memory addresses
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractUserToShareEqualsandHashcode user = (AbstractUserToShareEqualsandHashcode) o;
        return Objects.equals(name, user.name);
    }

    // 2. Override hashCode so objects with the same name land in the same hash bucket
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    
}
