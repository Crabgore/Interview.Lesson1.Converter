package ru.crabgore.interviewlesson1converter;

// Реализация интерфейса ConvertTo.
// Перевод в м/с из км/ч.
public class ConvertToMS implements ConvertTo{
    @Override
    public float Do(float sourceValue) {
        return (sourceValue * 1000) / 3600;   // Вычисление Цельсия
    }
}
