package com.JavaGuru1.lv.lesson8.mathOperations;

public class MathOperationDemo {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();

        MathOperation[] ops = {
                new AdditionOperation(),
                new SubtractionOperation()
        };

        executor.execute(ops, 5, 3); //8, 2
    }
}
