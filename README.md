# Домашнее задание курса [OTUS Java Developer. Basic](https://otus.ru/lessons/java-basic/)

## Обработка ошибок в Java.

---
[![Build](https://github.com/alexey-sidorov-dev/otus-java-exceptions/workflows/Build/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-exceptions/actions)
[![Check](https://github.com/alexey-sidorov-dev/otus-java-exceptions/workflows/Check/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-exceptions/actions)
![Language](https://img.shields.io/github/languages/top/alexey-sidorov-dev/otus-java-exceptions)
[![License](https://img.shields.io/github/license/alexey-sidorov-dev/otus-java-exceptions)](https://github.com/alexey-sidorov-dev/otus-java-exceptions/blob/master/LICENSE)

### Цель

Научиться работать с исключениями в Java.

### Задание

1. Реализовать метод, аргументом которого является двумерный строковый массив размером 4х4. Если
   передан массив другого размера, необходимо бросить исключение _AppArraySizeException_.
2. Метод должен обойти все элементы массива, преобразовать их в int и просуммировать. Если в каком-то
   элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа), должно
   быть брошено исключение _AppArrayDataException_ с детализацией, в какой именно ячейке лежат
   неверные данные.
3. В методе _main_ необходимо вызвать полученный метод, обработать возможные исключения
   _AppArraySizeException_ и _AppArrayDataException_ и вывести результат расчета (сумму элементов,
   при условии, что подали на вход корректный массив).




