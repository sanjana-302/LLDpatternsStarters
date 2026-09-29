package BehavioralDesignPattern.MediatorPattern;

public class main {
    // Decoupled Users: Users should not maintain direct references to other users. A user should only know about the central chat room (the mediator).

    // Broadcast Messaging: When a user sends a message, it should automatically be broadcast to all other users in the room through the mediator.

    // Private Messaging (Bonus/Extension): A user should be able to send a message targeted specifically to another individual user via the mediator.

    // Joining/Leaving: Users can join or leave the chat room at any time, and the system should handle registrations dynamically.
    public static void main(String[] args) {
        // 1. Create the central mediator (Chat Room) once
        ChatRoom room = new ChatRoom();

        // 2. Create users and inject the shared chat room into them
        IUser alice = new User("Alice", room);
        IUser bob = new User("User", room); // or Bob
        IUser bot = new Bot("AutoModBot", room);

        // 3. Register them to the room
        room.addUser(alice);
        room.addUser(bob);
        room.addUser(bot);

        // 4. Test Broadcast
        System.out.println("--- Testing Broadcast ---");
        alice.sendBroadCastMessage("Hello everyone in the room!");
        alice.sendMessage("Hello in private, because I like you!", "AutoModBot");
    }
}
