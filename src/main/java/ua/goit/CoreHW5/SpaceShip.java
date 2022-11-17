package ua.goit.CoreHW5;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }
/*
Створи приватне поле serialNumber рядкового типу. Зроби геттер та сеттер для цього поля.
Зверни увагу, що структура серійного коду наступна - дві літери SN, і шість будь-яких
символів після літер (всього 8 символів, наприклад SNAX65G8).Напиши сеттер так, щоб якщо
 хтось намагається встановити неправильний серійний номер, то ця спроба ігнорувалась.
 */
    public void setSerialNumber(String serialNumber) {
        if (!serialNumber.startsWith("SN")) {return;}
        if (serialNumber.length() > 8) {return;}
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }
    /* Давай запобігмо цьому. Допиши setter для поля name так, щоб якщо хтось
    намагається задати полю name порожнє значення, або значення більше 100 символів,
     то цей виклик сеттера ігнорувався, і в полі name залишалося б старе значення.
     !!!!!!!!!!!!!!!!
      public void setName(String name) {
        if (name.isBlank() || name.length() > 100) { return; }
        this.name = name;
    }     */

    public void setName(String name) {
        if (name.equals("")) {return;}
        if (name.length() > 100) {return;}
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name is " + getName() + ", serial number is " + getSerialNumber());
    }

}
