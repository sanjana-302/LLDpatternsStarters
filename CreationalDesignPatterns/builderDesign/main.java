package CreationalDesignPatterns.builderDesign;

public class main {
    public static void main(String[] args) {
        BusinessObject bo1 = new BusinessObject.Builder(10, 20).setProp3(90).setProp4(11).setProp5(2).build();
        System.out.println(bo1.toString());
    }
}
