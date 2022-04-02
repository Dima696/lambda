import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = ( x, y ) -> x + y;
    BinaryOperator<Integer> minus = ( x, y ) -> x - y;
    BinaryOperator<Integer> multiply = ( x, y ) -> x * y;
    BinaryOperator<Integer> division = ( x, y ) -> x == 0 || y == 0 ? 0 : x / y;  // если х или у равно 0 то возвращай 0 , или же х/у .
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;


    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}

