package enumDemo;


public class Test {

    public static void main(String[] args) {

            Pizza testPz = new Pizza();
            testPz.setStatus(Pizza.PizzaStatus.READY);
        System.out.println(testPz.isDeliverable());
    }




}
