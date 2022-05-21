package HomeWorkStep;

public class SwitchMonthHomeWork {
    public static void main(String[] args) {
        String month = "Август";
        String season;
        switch (month){
            case "Декабрь":
            case "Январь":
            case "Февраль":
                season = "Зимы";
                break;
            case "Март":
            case "Апрель":
            case "Май":
                season = "Весны";
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                season = "Лета";
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                season = "Осени";
                break;
            default:
                season = "Неизвестного сезона";

        }
        System.out.println(month + " месяц - " + season);
    }
}
