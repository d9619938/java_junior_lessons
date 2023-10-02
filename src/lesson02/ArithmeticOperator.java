package lesson02;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // + - * / %
        // -1   унарный минус (если оператор применяется к одному операнду)
        // 3 - 4 бинарный минус (если оператор применяется к двум операндам)

        int x = 20, y = -1;
        int result = x + y;   // 19

        byte var01 =89, var02 = 11;
        byte byteResult = (byte) (var01 + var02);

        double bill = 500;
        double halfBill = bill / 2;
        System.out.println(halfBill);  // если операнды числа с плавающей точкой, то результат такое же число с плав. точкой

        int number = 101, divisor = 10;
        int withoutLastDigit01 = number / divisor;
        double withoutLastDigit02 = (double) number / divisor;
        System.out.println(withoutLastDigit01); // если операнды целочисленные, то результат целое число, остаток отбрасывается
        System.out.println(withoutLastDigit02); // если один из операндов число с плавающей точкой, то результат будет число с плавающей точкой

        int n = 40;
        long m = 100L;
        long nmResult = n * m; // результат будут в большем контейнере, т.е. long
        System.out.println(nmResult);

        number = 9;
        divisor = 2;
        int evenOrOddResult = number % divisor; // 1
        System.out.println(evenOrOddResult);

        number = 153;
        divisor = 10;
        int LastDigid = number % divisor; // 3
        System.out.println(LastDigid);

        var var1 = 60L;
        var var2 = -20;
        var var3 = 10;
        var varResult = var1 + var2 * var3;
        System.out.println(varResult);


        int num = 10;
        num = num + 10; // работает одинаково
        num += 10;      // работает одинаково
        num -= 10;
        num *= 10;
        num /= 10;
        num %= 10;
        System.out.print(num);
    }
}
