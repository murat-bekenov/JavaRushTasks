package com.javarush.task.task27.task2712;

/*

Пришло время описать функционал класса AdvertisementManager.
Но для начала нам понадобятся некоторые методы в классе Advertisement.

1. В классе Advertisement создай поле long amountPerOneDisplaying.
Оно должно равняться стоимости одного показа рекламного объявления в копейках (initialAmount/hits).
Присвой значение полю в конструкторе.

2. В классе Advertisement создай геттеры для полей name, duration и amountPerOneDisplaying.

3. Определим необходимые данные для объекта AdvertisementManager — это время выполнения заказа поваром.
Т.к. продолжительность видео у нас хранится в секундах,
то и и время выполнения заказа тоже будем принимать в секундах.
В классе AdvertisementManager создай конструктор, который принимает один параметр — int timeSeconds.
Создай соответствующее поле и сохраните это значение в него.

4. AdvertisementManager выполняет только одно единственное действие — обрабатывает рекламное видео.
Поэтому создайте единственный публичный метод void processVideos(), его функционал опишем в следующем задании.
А пока выведем в консоль «calling processVideos method»

5. Чтобы тестировать данную функциональность, нужно добавить вызов processVideos метода у AdvertisementManager.
Очевидно, что этот метод должен вызываться во время создания заказа, а точнее — в параллельном режиме.
Заказ готовится в то время, как видео смотрится.
Добавьте вызов метода processVideos() в нужное место.

P.S. Не забудь что время приготовления заказа считается в минутах, а время показа рекламы в секундах!

* */

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        Cook amigo = new Cook("Amigo");
        amigo.addObserver(new Waiter());
        tablet.addObserver(amigo);
        tablet.createOrder();
    }
}
