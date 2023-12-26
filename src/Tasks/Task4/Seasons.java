package Tasks.Task4;

public enum Seasons {
    WINTER(-20),
    SPRING(+5),
    SUMMER(+19),
    AUTUMN(+3);

    private final double degrees;
    private Seasons(int degrees){
        this.degrees = degrees;
    }

    public String getDescription() {
        String str = "";
        switch (this){
            case WINTER -> str = "\n Зима это холодное время года с средней температурой " + this.degrees + ". Включает в себя Декабрь, Январь и Февраль.";
            case SPRING -> str = "\n Весна это достаточно тёплое время года с средней температурой " + this.degrees + ". Включает в себя Март, Апрель и Май.";
            case SUMMER -> str = "\n Лето это жаркое время года с средней температурой " + this.degrees + ". Включает в себя Июнь, Июль и Август.";
            case AUTUMN -> str = "\n Осень это достаточно тёплое время года с средней температурой " + this.degrees + ". Включает в себя Сентябрь, Октябрь и Ноябрь.";
        }
        return str;
    }
}
