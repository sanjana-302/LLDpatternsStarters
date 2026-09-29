package StructuralDesignPatterns.adapterDesign;


public class main {
    public static void main(String[] args) {
        CommonInterfaceMusic c = new musicApp(new ThirdPartyComplexLibMusic());
        c.playMusic("mp4");
        c.playMusic("mp5");
        c.playMusic("blah");
    }
}
