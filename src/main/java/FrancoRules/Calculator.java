package FrancoRules;

import java.util.List;

public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Can not divide by zero");
        }
        return (a*1.0)/(b);
    }

    public int addAll(List<Integer> numbers) {
        if (numbers.size() == 0){
            throw new ArithmeticException("not valid list");
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum = numbers.get(i) + sum;
        }
        return sum;
    }

    public int max(int[] numbers) {
        if (numbers.length == 0){
            throw new ArithmeticException("cannot reach the number in an array with a length 0");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
