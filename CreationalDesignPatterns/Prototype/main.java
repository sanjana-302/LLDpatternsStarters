package CreationalDesignPatterns.Prototype;

import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        System.out.println(LocalTime.now() + " - NPC created!");
        NonPlayerComponent n1 = new NonPlayerComponent("a", "female", "green");
        System.out.println(LocalTime.now() + " - NPC created!");
        NonPlayerComponent n2 = new NonPlayerComponent("b", "female", "green");
        System.out.println(LocalTime.now() + " - NPC created!");
        NPCFactory factory = new NPCFactory();
        NonPlayerComponent n3 = factory.createNonPlayerComponent("c", "male", "yellow");
        System.out.println(LocalTime.now() + " - NPC 1 created from factory!");
        try {
            NonPlayerComponent n4 = factory.alterColorOnly("green");
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(LocalTime.now() + " - NPC 2 created from factory!");
    }
}
