package BehavioralDesignPattern.VisitorDesignPattern;

import java.util.ArrayList;
import java.util.List;

// "You hit the nail right on the head. 
// That is the exact architectural trade-off of the Visitor Pattern, 
// and interviewers love when candidates can articulate it clearly.
// Adding operations (CompressVisitor, EmailVisitor) is a breeze
// —you just add a new visitor class without touching existing elements.   
// Adding new elements (like an Audio document) is painful
// —it forces you to update the IVisitor interface and every single concrete visitor 
// implementation to handle the new applyToFile(Audio a) method.   As you correctly concluded, 
// you only use the Visitor pattern when your element hierarchy (IDocument, Text, Image, Video) is stable and rarely changes,
//  but the behaviors or operations performed on them change and expand frequently." 

public class main {
    public static void main(String[] args) {
        // strategy might sound same right now 
        // Take example of robot -> it has one fly method 
        // this robot can fly in different manners -> here is where I will add new strategy 
        // but let's say that this robot can just have differnt methods 
        // like fly run walk in this case I will use visitor pattern
        Text text = new Text("TextDoc", "2Mb");
        Image image = new Image("ImageDoc", "2Mb");
        Video video = new Video("VideoDoc", "2Mb");
        List<IDocument> docCollection = new ArrayList<>();

        docCollection.add(text);
        docCollection.add(image);
        docCollection.add(video);

        text.accept(new CompressVisitor());
        image.accept(new CompressVisitor());
        video.accept(new CompressVisitor());

        IVisitor ev = new EmailVisitor();

        for(IDocument i : docCollection){
            i.accept(ev);
        }

    }
}
