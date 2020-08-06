# Проект автоматизации тестирования главного сайта Geekbrains

Это учебный проект созданный в рамках курса "ООП в Java"

Автотесты написаны на сайт https://geekbrains.ru/

## Используемые библиотеки

  - [Selenium Java » 3.141.59](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59)
  - [JUnit Jupiter (Aggregator) » 5.6.2](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.6.2)
  - [Hamcrest » 2.2](https://mvnrepository.com/artifact/org.hamcrest/hamcrest/2.2)
  - [Allure JUnit 5 Integration » 2.13.5](https://mvnrepository.com/artifact/io.qameta.allure/allure-junit5/2.13.5)
  - [WebDriverManager » 4.1.0](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.1.0)
  - [Project Lombok » 1.18.12](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.12)

## Установленные плагины

 - [Allure Maven » 2.10.0](https://mvnrepository.com/artifact/io.qameta.allure/allure-maven/2.10.0)
 - [Maven Surefire Plugin » 2.22.2](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin/2.22.2)
 - [AspectJ Weaver » 1.9.4](https://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.9.4)

### Запуск тестов

    mvn clean test allure:serve

### Реализованы тесты

- AuthorizationWebTest (успешная авторизация, проверка названия страницы Главная)
- CourseWebTest         (Страница "Курсы", раздел "Курсы", чек-бокс "Бесплатные" и "Тестирование", 
                        отображаются курсы "Тестирование ПО. Уровень 1" и "Тестирование ПО. Уровень 2")
- LeftNavigationWebTest (проверка элементов левого бокового меню)
- PostWebTest (Проверка отображения элементов меню страницы Блог:
                                "Маркетинг",
                               "Дизайн",
                               "Управление",
                               "Истории студентов",
                               "GeekUniversity" )
- SearchWebTest (проверка количества отоброжаемого контента по поисковому запросу "java")
- TestWebTests (Проверка отображения элементов меню страницы Тест:
                               "Основы программирования",
                               "Факультет DevOps",
                               "GU: SEO-оптимизация",
                               "Факультет дизайна")
                               


## Автор

  - **Игорь Трибуль** - *студент факультета Geek University Тестирования* [GEEKBRAINS](https://geekbrains.ru/)

