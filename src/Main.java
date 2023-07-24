import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        leapYear(2020);
        leapYear(2023);
        leapYear(2024);
        task2(0, 2023);
        task2(1, 2022);

        task3 (95);
        task3 ( 110);
    }

    public static void leapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println( year + " - високосный год");
        } else {
            System.out.println( year + " - не високосный год");
        }
    }

    public static void task2(int mobileOS, int mobileyear) {
        int currentYear = LocalDate.now().getYear();
        String mobileOSName;

        switch (mobileOS) {
            case 0: mobileOSName = "IOS";
            break;
            case 1: mobileOSName = " Android";
            break;
            default: mobileOSName = " Неизвестная ОС";
        }
        if (mobileyear != currentYear) {
            System.out.println(" Для ОС " + mobileOSName + " необходимо установить lite версию");
        } else {
            System.out.println( " Для ОС " + mobileOSName + " необходимо установить обычную версию");
        }
    }

    public static int task1(int distance) {
        if (distance <= 20) {
            return 1;
        } else if ( distance <= 60) {
            return 2;
        } else if ( distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void task3 ( int distance) {
        int days = task1(distance);
        if ( days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}