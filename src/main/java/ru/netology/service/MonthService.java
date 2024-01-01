package ru.netology.service;

public class MonthService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // денег на счету изначально
        int count = 0; // месяцев отдыха изначально

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // если достаточно средств для отдыха
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // отдыхаем, вычитаем обязательные платежи и ещё уменьшаем в три раза
            } else {
                money = money + income - expenses; // активно работаем и получаем доход, вычитаем обязательные платежи
            }
        }
        return count;
    }

}
