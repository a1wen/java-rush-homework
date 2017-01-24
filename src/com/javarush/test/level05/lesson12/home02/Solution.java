package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man Petr = new Man("Petr", 33,"Azovskaya, 24, 133fl");
        Man Igor = new Man("Igor", 25, "Kahovka, 23");
        Woman Ira = new Woman("Iruntik", 24,"piter.fm");
        Woman Sveta = new Woman("Svetlana", 30, "Moscow 24");

        //выведи их на экран тут
        System.out.println(Petr.name+" "+Petr.age+" "+Petr.address);
        System.out.println(Igor.name+" "+Igor.age+" "+Igor.address);
        System.out.println(Ira.name+" "+Ira.age+" "+Ira.address);
        System.out.println(Sveta.name+" "+Sveta.age+" "+Sveta.address);
    }

    //добавьте тут ваши классы
    public static class Man
    {
        private String name, address;
        private int age;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        private int age;
        private String name, address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
