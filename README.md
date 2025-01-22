# Домашнее задание по курсу Алгоритмы и структуры данных

## Задание
Реализавать методы бинарного поиска.

Для работы со списками:  
1. static int binarySearch(byte[] a, byte key)  
2. static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key)  
3. static int binarySearch(char[] a, char key)  
4. static int binarySearch(char[] a, int fromIndex, int toIndex, char key)  
5. static int binarySearch(float[] a, int fromIndex, int toIndex, float key)  
6. static int binarySearch(int[] a, int key)  
7. static int binarySearch(int[] a, int fromIndex, int toIndex, int key)  
8. static int binarySearch(long[] a, long key)  
9. static int binarySearch(long[] a, int fromIndex, int toIndex, long key)  
10. static int binarySearch(short[] a, short key)  
11. static int binarySearch(short[] a, int fromIndex, int toIndex, short key)  
12. static int binarySearch(double[] a, double key)  
13. static int binarySearch(double[] a, int fromIndex, int toIndex, double key)  
14. static int binarySearch(float[] a, float key)  
15. static int binarySearch(float[] a, int fromIndex, int toIndex, float key)  
16. static int binarySearch(T[] a, T key, Comparator c)  
17. static int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c)  

Для работы с коллекциями:
18. static int binarySearch(List> list, T key)  
19. static int binarySearch(List list, T key, Comparator c)


## Структура проекта

Для реализации методов бинарного поиска разработаны классы, находящиеся в пакете program
-	***MyArrays***, класс с методами для работы со списками
-	***MyCollections***, класс с методами для работы с коллекциями
-	***ExampleInteger***, вспомогательный класс для реализации поиска с компаратором


```plaintext
binary-search
├─ binary-search.iml                  
├─ README.md
├─ .gitignore
└─ src
   └─  main
      └─ java
         ├─ program
         │  ├─ ExampleInteger
         │  ├─ MyArrays.java
         │  └─ MyCollections.java
         └─ Main.java

```

Результат работы программы приведён в отчёте


## Установка

Для установки программы скачайте архив репозитория по ссылке или склонируйте его
```bash
git clone   
```


# Поддержка
По вопросам использования программы можно обратиться к разработчику по электронной почте <a href="mailto:mail@example.com">a.kozmina31@yandex.ru</a>
