package JavaRush.Level_4.Lecture_4;

/*
Переходим дорогу вслепую

Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
!!! Вещественные числа — это числа, у которых есть дробная часть
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_4___Task_9 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое число от нуля до 60: ");
        double t = Double.parseDouble(bfReader.readLine());
        double z = t % 5;
        if (z < 3){
            System.out.println("Зелёный");
        }else if(z < 4){
            System.out.println("Жёлтый");
        }else if(z < 5){
            System.out.println("Красный");
        }else {
            System.out.println("Введённое число не входит в промежуток от 0 до 60 !");
        }
    }
}