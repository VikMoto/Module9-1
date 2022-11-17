package ua.goit.CoreHW7;

import java.nio.charset.StandardCharsets;
/*
Напиши клас StringByteWorker. У цьому класі створи метод public String process(byte[] bytes).
Метод приймає на вхід масив байт, робить з цього масиву рядок, наводить його в нижній регістр,
і повертає цей рядок.
 */
class StringByteWorker {
    public String process(byte[] bytes) {
        String input = new String(bytes, StandardCharsets.UTF_8);
        return input.toLowerCase();
    }
}


class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}