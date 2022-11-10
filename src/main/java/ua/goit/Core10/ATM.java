package Core10;
/*
Банк встановлює у всьому місті банкомати, які видають гроші паперовими купюрами.
 У банкоматі завжди в достатній кількості є купюри номіналом в 500, 200, 100, 50, 20, 10, 5, 2 и 1 доларів
 Нептуна. Напиши програму, на вхід якої дається сума, яку має видати банкомат. Програма має повернути
 мінімальну кількість купюр, якими можна видати цю суму.
Важливо. Збережи текст цієї програми, він знадобиться тобі в наступному завданні.
Напиши клас ATM. У цьому класі створи метод public int countBanknotes(int sum). Він приймає один
параметр sum - кількість грошей, яку потрібно видати, та повертає мінімальну кількість банкнот,
якими можна видати цю суму.


 */
public class ATM {
    public static int countBanknotes(int sum) {
        int[] denomination = new int[] {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int inc = 0;
        while (inc < 9) {
            result += sum / denomination[inc];
            sum = sum % denomination[inc];
            inc++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countBanknotes(735));
    }
}
