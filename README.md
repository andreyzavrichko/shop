# Итоговый проект Иннополис
## :cherry_blossom:	Содержание
> ➠ [Используемые технологии](#Используемые-технологии)
>
> ➠ [Описание проекта](#Описание-проекта)
>
> ➠ [Список проверок](#список-проверок-реализованных-в-автотестах)
>
> ➠ [Пример ручного выполнения тестов с помощью Postman](#Пример-ручного-выполнения-тестов-с-помощью-Postman)
>
> ➠ [Структура проекта](#Структура-проекта)
>
> ➠ [Запуск автотестов выполняется на сервере Jenkins](#Запуск-автотестов-выполняется-на-сервере-Jenkins)
>
> ➠ [Отчёты о результатах сборок в Allure TestOps](#отчёты-о-результатах-сборок-списки-тесткейсов-аналитические-dashboards-хранятся-в-allure-testops)
>

## Используемые технологии
![This is an image](/design/icons/Java.png)![This is an image](/design/icons/Gradle.png)![This is an image](/design/icons/Rest-Assured.png)![This is an image](/design/icons/Intelij_IDEA.png)![This is an image](/design/icons/JUnit5.png)![This is an image](/design/icons/Allure_Report.png)
## Описание проекта
Дипломный проект реализации автотестирования **Rest Api**.<br/>
>В качестве объекта тестирования выбран проект https://github.com/npolyakova/shop <br/>

![This is an image](/design/site.jpg)

Сайт позволяет получать информацию о магазинах, создавать магазины, а также удалять их.

#### Особенности реализации тестового проекта
- Модели получаемых данных описаны с помощью библиотеки Lombok.
- Использованы спецификации
- Использованы шаблоны форматирования логов запросов.
- Использованы кастомные шаблоны запросов и ответов
- UI, API и UNIT тесты реализованы в одном репозитории

## Список проверок, реализованных в автотестах
- [x] Получение всех магазинов
- [x] Получение несуществующего магазина
- [x] Получение существующего магазина
- [x] Создание магазина с именем - 256 символов
- [x] Создание магазина с именем - 6 символов
- [x] Создание магазина с именем - 7 символов
- [x] Создание магазина с именем - нижний регистр
- [x] Создание магазина с именем - разные спец символы
- [x] Удаление несуществующего магазина
- [x] Проверка кнопки refresh
- [x] Проверка кнопки Telegram
- [x] Проверка кнопки VK
- [x] Проверка кнопки Все магазины
- [x] Проверка кнопки Создать магазин
- [x] Проверка кнопки Удалить магазин
- [x] Проверка кнопки Создать магазин - публичный
- [x] Проверка отображения главного меню
- [x] Проверка отображения логотипа и главного заголовка
- [x] Проверка отображения ошибки при некорректном названии магазина
- [x] Проверка отображения ошибки при удалении магазина без ID

## Пример ручного выполнения тестов с помощью Postman
![This is an image](/design/postman.jpg)

## Структура проекта
- [x] data - генерирование тестовых данных
- [x] helpers - подключение кастомных шаблонов для Allure Report
- [x] models - модели данных для тестов
- [x] spec - спецификации, необходимые для тестов
- [x] resources - кастомные шаблоны для Allure Report
- [x] api - пакет api тестов
- [x] ui - пакет ui тестов
- [x] pages - описание страниц POM
- [x] unit - пакет unit тестов

![This is an image](/design/structure.jpg)

#### Пример запуска из командной строки
```bash
gradle clean test
```



### Итоговые dashboards в Allure Report
![This is an image](/design/summary.jpg)
![This is an image](/design/status.jpg)
### Список тест-кейсов в Allure Report
![This is an image](/design/suites.jpg)
![This is an image](/design/feature.jpg)
### Графики Dashboards в Allure Report
![This is an image](/design/severity.jpg)

