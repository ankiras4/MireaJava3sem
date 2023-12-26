package Tasks.Task20;

public class TvkTest {
    public static void main(String[] args){
        Tvk <String, Animals, Integer> Tvk = new Tvk<String, Animals, Integer>("str",new Animals(),5);
        Tvk.showTypes();
    }
}
