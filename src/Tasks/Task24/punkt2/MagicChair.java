package Tasks.Task24.punkt2;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("'Авада - кедавра!' - выкрикивает стул и Вы падаете с него");
    }

    @Override
    public String toString() {
        return "Magic Chair";
    }
}
