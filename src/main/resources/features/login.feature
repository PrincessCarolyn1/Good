@LoginProfile
Feature: Тестируем страницу авторизации
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Scenario: Успешная авторизация
    Given Я нахожусь на домашней странице
    Then Я нажимаю ссылку signIn
    When Ввожу логин 'oleg.kh81@gmail.com'
    And Ввожу пароль '123qwerty'
    And нажимаю отправить
    Then Я ожидаю увидеть 'OLEG AFANASIEV' link
    Then Нажимаю logout