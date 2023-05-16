import java.util.Scanner;

public class TextCalculator {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите уравнение в кавычках. Первым аргументом выражения должна быть строка.");
        System.out.println("Умножение и деление строки на строку не производится.");
        System.out.println("Калькулятор принимает на вход числа от 1 до 10 включительно, не более.");
        String exp = scn.nextLine();
        char action;
        String[] data;
        String result = "";
        int index = 0;
        int divider = 0;
        if (exp.contains(" + ")) {
            data = exp.split(" \\+ ");
            action = '+';
        } else if (exp.contains(" - ")) {
            data = exp.split(" - ");
            action = '-';
        } else if (exp.contains(" * ")) {
            data = exp.split(" \\* ");
            action = '*';
        } else if (exp.contains(" / ")) {
            data = exp.split(" / ");
            action = '/';
        }else{
            throw new Exception("Некорректный ввод данных");
        }
        switch (data[0]) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> throw new Exception("Некорректный ввод данных");
        }
        if (action == '*' || action == '/') {
            if (data[1].contains("\"")) throw new Exception("Некорректный ввод данных");
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replace("\"", "");
        }

        switch (action) {
            case '+' -> output(data[0] + data[1]);
            case '*' -> {
                int numberOf = Integer.parseInt(data[1]);
                for (int i = 0; i < numberOf; i++) {
                    result += data[0];}
                output(result);}
            case '-' -> {
                index = data[0].indexOf(data[1]);
                if (index == -1) {output(data[0]);}
                else {
                    result = data[0].substring(0, index);
                    output(result);}}
            case '/' -> {
                divider = data[0].length()/Integer.parseInt(data[1]);
                result = data[0].substring(0, divider);
                output(result);}
        }
    }
    static void output(String text){
        System.out.println("\""+text+"\"");
    }
}
