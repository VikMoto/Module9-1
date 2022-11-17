package ua.goit.CoreHW6;

/*
Для зручної роботи з такими об'єктами можна використовувати або паттерн Будівельник
(до цього дістанемося пізніше), або ж телескопічний конструктор.
У разі телескопічного конструктора ми створюємо конструктор з усіма параметрами.
Далі створюємо серію конструкторів, у кожного на один параметр менше. Усередині
цих конструкторів використовуємо this для виклику вже описаних конструкторів.
Ось як це виглядає на прикладі класу з двома параметрами:
class MinMaxValidator {
    private int min;
    private int max;
    public MinMaxValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public MinMaxValidator(int min) {
        this(min, 100);
    }
    public MinMaxValidator() {
        this(0, 100);
    }
    public boolean isValid(int value) {
        return value >= min && value <= max;
    }
}
 */
class BFG {
    private int ammo;
    private int damage;
    private String name;

    public BFG(int ammo, int damage, String name){
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int ammo, int damage){
        this(ammo, damage, "BFG");
    }

    public BFG(int ammo) {
        this(ammo, 50, "BFG");
    }

    public BFG() {
        this(1000, 50, "BFG");
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", ammo: " + ammo +", damage: " + damage;
    }
}

class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}