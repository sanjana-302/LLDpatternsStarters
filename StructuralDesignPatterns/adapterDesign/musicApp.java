package StructuralDesignPatterns.adapterDesign;

// all music players need to implement common interface
public class musicApp implements CommonInterfaceMusic{
    ThirdPartyComplexLibMusic integrateMe;

    public musicApp(ThirdPartyComplexLibMusic t){
        integrateMe = t;
    }
    @Override
    public void playMusic(String type) {
        // we use this library conditionally
        if(type=="mp4"){
            integrateMe.complexMethodOne();
        }else if(type=="mp5"){
            integrateMe.complexMethodTwo();
        }else{
            System.out.println("Unsupported music extension!!!!");
        }
    }
    
}