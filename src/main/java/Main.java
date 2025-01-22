import program.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\nМассивы\n\n");

        test(1);
        test(2);
        test(5);
        test(10);
        test(20);
        test(50);
        test(100);
        test(1000);
        test(10000);
        test(100000);
        test(1000000);

        System.out.println("\n\nКомпараторы\n\n");

        testObjects(5);
        testObjects(50);
        testObjects(500);
        testObjects(5000);
        testObjects(50000);
        testObjects(500000);
    }

    private static void testObjects(int arraySize) {
        System.out.println("List<ExampleObject> size: " + arraySize);
        List<ExampleInteger> list = createExampleIntegerList(arraySize);
        Random random = new Random();
        ArrayList<Long> timesList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            int randomInt = random.nextInt(list.size());
            long startTime = System.nanoTime();
            int searchIndex  = MyCollections.binarySearch(list, new ExampleInteger(randomInt));
            long endTime = System.nanoTime();
            timesList.add(endTime - startTime);
        }
        long sum = 0;
        for (Long time : timesList) {
            sum += time;
        }
        System.out.println("Среднее время бинарного поиска: " + sum / timesList.size() + " наносекунд");
    }

    private static void test(int arraySize) {
        int[] array = createIntArray(arraySize);
        System.out.println("Размер массива: " + arraySize);
        long simpleTime = testSearcher(array, SearchType.SIMPLE, arraySize);
        System.out.println("Среднее время обычного поиска: " + simpleTime + " наносекунд");
        long binaryTime = testSearcher(array, SearchType.BINARY, arraySize);
        System.out.println("Среднее время бинарного поиска: " + binaryTime + " наносекунд");
    }

    private static long testSearcher(int[] array, SearchType searchType, int arraySize) {
        Random random = new Random();
        ArrayList<Long> timesList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            int randomInt = random.nextInt(array.length);
            long startTime = System.nanoTime();
            int searchIndex;
            switch (searchType) {
                case BINARY -> {
                    searchIndex = MyArrays.binarySearch(array, randomInt);
                }
                case SIMPLE -> {
                    searchIndex = simpleSearch(array, randomInt);
                }
            }
            long endTime = System.nanoTime();
            timesList.add(endTime - startTime);
        }
        long sum = 0;
        for (Long time : timesList) {
            sum += time;
        }
        return sum / timesList.size();
    }

    enum SearchType {
        SIMPLE, BINARY
    }

    private static int[] createIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }


    private static List<ExampleInteger> createExampleIntegerList(int size) {
        List<ExampleInteger> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(new ExampleInteger(i));
        }
        return list;
    }

    public static int simpleSearch(int[] a, int key) {
        int result = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                result = i;
                break;
            }
        }
        return result;
    }
}