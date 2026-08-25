package Tag9_ErstesSpiel;
import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

//Добавить логику хождения в квадрате (ограничение по квадрату)
//Обработчик сбора денег или врезаний

public class SchlangeSpiel {
    public static void main(String[] args){
        //Запуск игры и начало действия | Статус: Активно
        boolean SpielStatus = true;
        boolean IstGold = false;

        //Генерация поля и позиций
        Point[] heroes = SpielHeroes();
        //Tuer 2 Shlange 3
        String HauptSpielFeld = SpielFeld(heroes[0], heroes[1], heroes[2], heroes[3], IstGold);

        clearScreen();
        System.out.println(HauptSpielFeld);

        Scanner scan = new Scanner(System.in);
        while (SpielStatus){
            //Чтение ввода
            String input = scan.nextLine();

            clearScreen();
            //Вывод поля
            System.out.println(SpielFeld(SpielLogik(input, heroes[0]), heroes[1], heroes[2], heroes[3], IstGold));


            if (heroes[0].equals(heroes[1])) {
                IstGold = true;
                System.out.println("Пользователь собрал монету!");
            } else if (heroes[0].equals(heroes[2])) {
                SpielStatus = false;
                System.out.println("Пользователь нашел дверь!");
            } else if (heroes[0].equals(heroes[3])) {
                SpielStatus = false;
                System.out.println("Пользователь заразился и был укушен змеей!");
            }
        }
        System.out.println("Игра окончена!");
    }

    private static Point SpielLogik(String input, Point SpielerPoint) {
        if (input.equals("w")) {
            if (SpielerPoint.y > 0) {
                SpielerPoint.y--;
            } else {
                System.out.println("Вы уперлись в верхнюю границу!");
            }
        } else if (input.equals("s")) {
            if (SpielerPoint.y < 4) {
                SpielerPoint.y++;
            } else {
                System.out.println("Вы уперлись в нижнюю границу!");
            }
        } else if (input.equals("a")) {
            if (SpielerPoint.x > 0) {
                SpielerPoint.x--;
            } else {
                System.out.println("Вы уперлись в левую границу!");
            }
        } else if (input.equals("d")) {
            if (SpielerPoint.x < 9) {
                SpielerPoint.x++;
            } else {
                System.out.println("Вы уперлись в правую границу!");
            }
        } else {
            System.out.println("Wrong Input");
        }

        return SpielerPoint;
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static Point[] SpielHeroes() {

        boolean GenStatus;

        Random random = new Random();

        //Генерация точек
        Point SpielerPoint = new Point(random.nextInt(10),random.nextInt(5));
        Point GoldPoint = new Point(random.nextInt(10),random.nextInt(5));
        Point TuerPoint = new Point(random.nextInt(10),random.nextInt(5));
        Point SchlangePoint = new Point(random.nextInt(10),random.nextInt(5));


        //Проверка правильности создания точек
        if (!(TuerPoint.x == SchlangePoint.x && TuerPoint.y == SchlangePoint.y) && !(GoldPoint.x == SchlangePoint.x && GoldPoint.y == SchlangePoint.y) && !(SpielerPoint.x == SchlangePoint.x && SpielerPoint.y == SchlangePoint.y) && !(GoldPoint.x == TuerPoint.x && GoldPoint.y == TuerPoint.y)){
            GenStatus = true;
            //System.out.println("Heroes sind generiert");
            //System.out.println("Positionen sind: \n" + SpielerPoint.x + " " + SpielerPoint.y + " für Spieler \n"+ GoldPoint.x + " " + GoldPoint.y + " für Gold \n"+ TuerPoint.x + " " + TuerPoint.y + " für Tür \n" + SchlangePoint.x  + " " + SchlangePoint.y + " für Schlange");
            return new Point[]{SpielerPoint, GoldPoint, TuerPoint, SchlangePoint};
        } else {
            GenStatus = false;
            System.out.println("Es gibt ein Fehler");
            return SpielHeroes();
        }
    }

    public static String SpielFeld(Point SpielerPoint, Point GoldPoint, Point TuerPoint, Point SchlangePoint, boolean IstGold){
        //Создания поля 10x5
        String SpielFeld = "";
        if (IstGold == false){
            for (int y=0; y<5; y++){
                for (int x=0; x<10; x++){
                    Point currentPoint = new Point(x,y);
                    //Расстановка наших игроков и самого поля
                    if (currentPoint.equals(SpielerPoint)){
                        SpielFeld += "\uD83D\uDEB6";
                    } else if (currentPoint.equals(GoldPoint)){
                        SpielFeld += "\uD83D\uDCB0";
                    } else if (currentPoint.equals(TuerPoint)){
                        SpielFeld += "\uD83D\uDEAA";
                    } else if (currentPoint.equals(SchlangePoint)){
                        SpielFeld += "\uD83D\uDC0D";
                    } else {
                        SpielFeld += "\u2B1B";
                    }
                }
                SpielFeld += "\n";
            }
        } else {
            for (int y=0; y<5; y++){
                for (int x=0; x<10; x++){
                    Point currentPoint = new Point(x,y);

                    //Расстановка наших игроков и самого поля
                    if (currentPoint.equals(SpielerPoint)){
                        SpielFeld += "\uD83D\uDEB6";
                    } else if (currentPoint.equals(GoldPoint)){
                        SpielFeld += "\u2B1B";
                    } else if (currentPoint.equals(TuerPoint)){
                        SpielFeld += "\uD83D\uDEAA";
                    } else if (currentPoint.equals(SchlangePoint)){
                        SpielFeld += "\uD83D\uDC0D";
                    } else {
                        SpielFeld += "\u2B1B";
                    }
                }
                SpielFeld += "\n";
            }
        }

        return SpielFeld;
        //System.out.println("Spielfeld ist generiert");


    }

}
