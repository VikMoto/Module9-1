package ua.goit.CoreHW6;


import java.util.Objects;
/*
Напиши клас Rectangle, у якого є конструктор public Rectangle(int a, int b). Він приймає два
параметри – сторони прямокутника.
Напиши метод public boolean canPlaceInto(Rectangle anotherRect). Він приймає інший прямокутник
 і повертає true, якщо поточний прямокутник можна вписати у прямокутник anotherRect,
та false в іншому випадку.
 */
class Rectangle {
    private int a;
    private int b;
    private int squear;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.squear = a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return squear == rectangle.squear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(squear);
    }

    public boolean equalRect(Rectangle anotherRect) {
        boolean equalRect = new Rectangle(a,b).equals(anotherRect);
        return  equalRect;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        boolean canPlaceIn;
        Rectangle presentRect = new Rectangle(a,b);
        if (presentRect.a <= anotherRect.a && presentRect.b <= anotherRect.b ) { canPlaceIn = true;}
        else if (presentRect.a == anotherRect.b && presentRect.b == anotherRect.a) { canPlaceIn = true;}
        else   {canPlaceIn = false;}
        return canPlaceIn;
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(270, 306);
        Rectangle r2 = new Rectangle(45, 1836);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}