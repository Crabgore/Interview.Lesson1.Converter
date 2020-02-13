package ru.crabgore.interviewlesson1converter;

// Интерфейс преобразования значений
// Чтобы сделать новое преобразование, достаточно реализовать этот интерфейс
interface ConvertTo {
    float Do(float sourceValue);    // Преобразовать
}