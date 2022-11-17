package ua.goit.CoreHW5;
/*
Космопорт, з якого злітають космічні кораблі, бере спеціальну плату за зліт. Ця плата залежить
від кількості пасажирів на кораблі. Чим пасажирів більше, тим дорожче зліт, бо за страховки
пасажирів відповідає саме космопорт.
Кожен космопорт має свій алгоритм розрахунку вартості зльоту.
Поточні формули розрахунку виглядають так:
космопорт JupiterStar бере фіксовану плату у 500 одиниць і додатково по 2 одиниці за кожного пасажира;
космопорт MercuryBeat не бере фіксованої плати за зліт, але бере по 15 одиниць за кожного пасажира;
космопорт SunHeaven бере лише фіксовану плату у 2000 одиниць, але кількість пасажирів при цьому
необмежена.
Потрібно написати програму, яка приймає космопорт, кількість пасажирів та повертає вартість польоту.
Оскільки кількість космопортів може розширюватися, обійтися одним методом з if...else не вийде,
робити потрібно розширювано.

Тому потрібно піти шляхом використання патерну Стратегія.
У нас буде клас LaunchCalculator, у якого буде метод int calculateTotalPrice(Spaceport spaceport,
 int passengerCount). Він приймає два параметри - Spaceport (космопорт, з якого злітаємо),
 та passengerCount - кількість пасажирів.
Але LaunchCalculator сам нічого не рахує. Він просто переадресовує всю роботу об'єкту типу Spaceport,
 який і робить всю роботу.
За такого підходу, якщо у нас з'являться нові космопорти зі складною логікою розрахунку вартості,
 достатньо буде дописати новий наслідник від класу Spaceport. Решта програми не зміниться.
Класи LaunchCalculator та абстрактний клас Spaceport вже написані. Тобі треба написати класи
JupiterStar, MercuryBeat та SunHeaven, в яких буде зашито логіку розрахунку вартості зльоту ракети.
 */
public class LaunchCalculator {
    public int calculateTotalPrice(Spaceport spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }
}

abstract class Spaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}

class JupiterStar extends Spaceport {
    public int calculateTotalPrice(int passengerCount) {
        return 500 + 2 * passengerCount;
    }
}

class MercuryBeat extends Spaceport {
    public int calculateTotalPrice(int passengerCount) {
        return 15 * passengerCount;
    }
}

class SunHeaven extends Spaceport {
    public int calculateTotalPrice(int passengerCount) {
        return 2000;
    }
}