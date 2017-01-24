package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        //напишите тут ваш код
        Cat tomCat = new Cat("Tomas", 5,10, 3);
        Cat buddyCat = new Cat("Buddy", 9, 6, 6);
        Dog fatherDog = new Dog("Big Daddy", 120, 40);
        Dog puppyDog = new Dog("Puppy", 25, 3);
        Mouse ancleMouse = new Mouse("Ancle Mouse", 15, 9);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //добавьте тут ваши классы
    public static class Dog
    {
        String name;
        int height, weight;

        public Dog(String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static class Cat
    {
        String name;
        int weight, speed, loud;

        public Cat(String name, int weight, int speed, int loud){
            this.name = name;
            this.weight = weight;
            this.speed = speed;
            this.loud = loud;
        }
    }

}
