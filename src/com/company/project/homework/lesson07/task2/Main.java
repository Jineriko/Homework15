package com.company.project.homework.lesson07.task2;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 2. Список разрешенных продуктов

        Класс Продукт:
            Свойства: название продукта / белки / жиры / углеводы / калории
            Минимум 4 конструктора
            Реализовать необходимые проверки входящих данных
            Создать не менее 4 экземпляров данного класса
        Класс МоиРазрешенныеПродукты:
            Свойства: максимальное количество белков / максимальное количество жиров / максимальное количество углеводов / максимальное количество калорий
            Реализовать метод, который принимает на Продукт и проверяет его. Если характеристики продукта не соответствуют заявленным разрешениям
            (например, слишком большое содержание калорий), метод должен вывести в консоль информацию о несоответствии и вернуть false.
            Если характеристики продукта полностью соответствуют заявленным разрешениям, метод должен вернуть true.

        При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
        */
        Food apple = new Food("Яблоко", 50, 70, 30, 150);
        Food cheese = new Food("Сыр", 150, 10, 20, 300);
        Food chicken = new Food("Курица", 99, 140);
        Food candy = new Food("Конфеты", 10, 160, 400);

        MyApprovedProducts myApprovedProducts = new MyApprovedProducts();
        myApprovedProducts.checkFood(apple);
        myApprovedProducts.checkFood(cheese);
        myApprovedProducts.checkFood(chicken);
        myApprovedProducts.checkFood(candy);
    }
}
