package Tasks.Task4_1;

public class TestPhone {
    public static void main(String[] args){
        // 1 экземпляр
        Phone phone1 = new Phone("89134758907","xiaomi",181.54);
        // 2 экземпляр
        Phone phone2 = new Phone("89067893564", "sumsung");
        phone2.setWeight(165.38);
        // 3 экземпляр
        Phone phone3 = new Phone();
        phone3.setNumber("89642349810");
        phone3.setModel("aplle");
        phone3.setWeight(191.54);

        System.out.print(phone1.getNumber());
        System.out.print("\n" + phone1.getModel());
        System.out.print("\n" + phone1.getWeight());

        System.out.print("\n" + phone2.getNumber());
        System.out.print("\n" + phone2.getNumber());
        System.out.print("\n" + phone2.getWeight());

        System.out.print("\n" + phone3.getNumber());
        System.out.print("\n" + phone3.getModel());
        System.out.print("\n" + phone3.getWeight());


        phone1.reciveCall("Катя");
        phone2.reciveCall("Лена");
        phone3.reciveCall("Саша", "89056783425");

    }
}
