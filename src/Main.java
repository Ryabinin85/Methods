import java.time.LocalDate;
import java.util.Random;

/**
 * Static methods
 */
public class Main {
    public static void main(String[] args) {
        checkLeapYear(1895);
        checkLeapYear(1896);
        installDeviceOS(0, 2014);
        installDeviceOS(1, LocalDate.now().getYear());
        calculateDeliveryDays(25);
        calculateDeliveryDays(115);
        calculateAverageSalary();
    }

    public static void checkLeapYear(int isLeapYear) {
        if (isLeapYear % 400 == 0 || isLeapYear % 4 == 0 && isLeapYear % 100 != 0) {
            System.out.printf("%d год является високосным\n", isLeapYear);
        }
        else {
            System.out.printf("%d год не является високосным\n", isLeapYear);
        }
    }

    public static void installDeviceOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015)
                System.out.println("Установите версию приложения для iOS по ссылке: 'apple.com'");
            else
                System.out.println("Установите облегченную версию приложения для iOS по ссылке: 'apple.com'");
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015)
                System.out.println("Установите версию приложения для Android по ссылке: 'google.com'");
            else
                System.out.println("Установите облегченную версию приложения для Android по ссылке: 'google.com'");
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance <= 20 ) {
            System.out.printf("Потребуется дней: %d\nРасстояние: %d км.\n", days, deliveryDistance);
        }
        if (deliveryDistance > 20) {
            days = days + (deliveryDistance - 20) / 40 + 1;
            System.out.printf("Потребуется дней: %d\nРасстояние: %d км.\n", days, deliveryDistance);
        }
    }

    public static void calculateAverageSalary () {
        double[] array1 = setRandomArray();
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", averageValue(array1));
    }

    public static double[] setRandomArray() {
        Random random = new Random();
        double[] arr = new double[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static double averageValue(double[] arr) {
        double avgValue;
        double sum = 0;

        for (double j : arr) sum += j;
        avgValue = sum / 30;
        return avgValue;
    }
}