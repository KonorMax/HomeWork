package HomeWorkStep;

import java.io.IOException;

public class MenuHomeWork {
    public static void main(String[] args) throws IOException {
        char selection;
        do{
            System.out.println(" Информация по меню ");
            System.out.println(" 1. Пельмени");
            System.out.println(" 2. Яичница");
            System.out.println(" 3. Уха");
            System.out.println(" 4. Паста");
            System.out.println(" 5. Блины");
            System.out.println(" 6. Борщ");
            System.out.println(" 7. Пирожки");
            System.out.println(" 8. Рыба");
            System.out.println(" 9. Овощное рагу");
            System.out.println(" Выберите пункт:  ");
            selection = (char) System.in.read();
        }while (selection <'1'|| selection >'9');
        System.out.println("\n--------------------");

        switch (selection){
            case '1':
                System.out.println("Пельмени: \n");
                System.out.println("Готовим тесто для пельменей");
                System.out.println("Готовим начинку для пельменей");
                System.out.println("Начинку ложим в тесто");
                System.out.println("Варим пелмени");
                break;
            case '2':
                System.out.println("Яичница: \n");
                System.out.println("Берем яйца");
                System.out.println("Разбеваем яйца и вылеваем их на сковороду");
                System.out.println("Жарим яйца");
                break;
            case '3':
                System.out.println("Уха: \n");
                System.out.println("Готовим ингредиенты для ухи");
                System.out.println("Ставим воду");
                System.out.println("Варим рыбу и добовляем ингредиенты");
                System.out.println("Уха готова");
                break;
            case '4':
                System.out.println("Паста: \n");
                System.out.println("Готовим ингредиенты для пасты");
                System.out.println("Ставим воду");
                System.out.println("Варим пасту и добовляем ингредиенты и после сливаем воду");
                System.out.println("Паста готова");
                break;
            case '5':
                System.out.println("Блины: \n");
                System.out.println("Готовим тесто для блинов");
                System.out.println("Готовим начинку для блинов");
                System.out.println("Жарим блины на сковороде ");
                System.out.println("Блины  готовы");
                break;
            case '6':
                System.out.println("Борщ: \n");
                System.out.println("Готовим ингредиенты для борща");
                System.out.println("Ставим воду");
                System.out.println("Варим картофель и добовляем ингредиенты");
                System.out.println("Борщ готов");
                break;
            case '7':
                System.out.println("Пирожки: \n");
                System.out.println("Готовим тесто для пирожков");
                System.out.println("Готовим начинку для пирожков");
                System.out.println("Жарим пирожки на сковороде");
                System.out.println("Пирожки  готовы");
                break;
            case '8':
                System.out.println("Рыыба: \n");
                System.out.println("Берем рыбу и ингредиенты");
                System.out.println("Нарезаем порционно рыбу");
                System.out.println("Запекаем рыбу");
                System.out.println("Рыба готова");
                break;
            case '9':
                System.out.println("Овощное рагу: \n");
                System.out.println("Берем овощи");
                System.out.println("Нарезаем порционно");
                System.out.println("Тушим овощи");
                System.out.println("Овощи готовы");
                break;
        }
    }
}
