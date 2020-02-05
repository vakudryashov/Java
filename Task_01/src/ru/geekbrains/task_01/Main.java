package ru.geekbrains.task_01;

public class Main {

    public static void main(String[] args) {
        // есть массив целых чисел
        int[] numbers = new int[] { 1, -1, 2, 5, -3, -8, 4, 10, -2, 3, 0, 7, -5 };

        System.out.println("1. найти все тройки чисел, которые в сумме дают ноль");
        int N = numbers.length;
        for (int i=0; i<N-2; i++){
            for (int j = i+1; j<N-1; j++){
                for (int k = j+1; k<N; k++){
                    if (numbers[i] + numbers[j] + numbers[k] == 0){
                        System.out.println("["+i+"] + ["+j+"] + ["+k+"] = "+numbers[i]+" + "+numbers[j]+" + "+numbers[k]+" = 0");
                    }
                }
            }
        } // Сложность алгоритма: O(n^3)

        System.out.println("\n2. Найти два наибольших значения в массиве");
        int max1 = numbers[0], max2 = numbers[0];
        for (int i = 1; i<N-1; i++){
            if (numbers[i]>max1) max1 = numbers[i];
            else if (numbers[i]>max2) max2 = numbers[i];
        } // Сложность алгоритма : О(n)
        System.out.println(max1+", "+max2);
    }
}
