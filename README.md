## Apache Tomcat. Сервлеты
Данный репозиторий содержит сервлет,
который запускается при помощи Apache Tomcat.

При тестировании приложения использовался Tomcat 9.

### Что такое Tomcat?
Apache Tomcat - ПО с открытым исходным кодом, реализующее набор технологий, которые 
входят в Java Enterprise Edition (EE): Java Servlet, Java Servlet Pages,
Java Expression Language, Java WebSocket.

### Деплой веб-приложения
Развертывание приложения осуществляется либо через веб-интерфейс,
либо c помощью копирования WAR-файла внутрь папки `webapps` установки Tomcat.
Изучим, как развернуть приложение с помощью веб-интерфейса.

1. Распаковать дистрибутив Tomcat и поместить в удобное место.
2. Отредактировать файл **conf/tomcat-users.xml**, добавив внутрь 
секции **tomcat-users** следующие строки:
```html
<role rolename="manager-gui"/>
<role rolename="admin-gui"/>
<user username="your_name" password="your_password" roles="admin-gui, manager-gui"/>
```
3. Собрать WAR-файл приложения, с помощью Maven 
Lifecycle: `clean`, а затем нажать `package`.

Структура Lifecycle:
```
   ├── Lifecycle
   │   ├── clean
   │   ├── validate
   │   ├── compile
   │   ├── test
   │   ├── package
   │   ├── verify
   │   ├── install
   │   ├── site
   │   ├── deploy
   ├── Plugins
   ├── Dependencies
```
4. Запустить Tomcat, выполнив скрипт `startup.bat` (для
Windows) или `startup.sh` (для Linux).

Пример выполнения скрипта.
```
$ ./startup.sh
Using CATALINA_BASE: ...
USing CATALINA_HOME: ...
Using CATALINA_TMPDIR: ...
Using JRE_HOME: ...
Using CLASSPATH: ...
Using CATALINA_OPTS: ...
Tomcat started.
```
5. Запустить браузер, ввести в адресную строку:
`http://localhost:8080/`. 

Должно появиться окно, которое представлено ниже:

![Стартовая страница](images/start-tomcat.png)

6. Выбрать `Manager App`, указать имя пользователя и пароль, которые
были добавлены в файл tomcat-users.xml (см. пункт 2).

Вход в Manager представлен ниже:

![Вход](images/auth.png)

7. Выбрать WAR-файл для развертывания, а затем
нажать кнопку _**"Развернуть"**_.

![Выбор WAR-файла](images/war-file.png)

8. Должно появиться название веб-приложения, его путь:

![/firstServlet](images/firstServlet.png)

9. Нажимаем на `/firstServlet`, должно появиться диалоговое окно:

![hello](images/hello.png)

Ура! Мы развернули веб-приложение, отобразили
содержимое JSP-страницы.

### Работа сервлета
![Работа сервлета](images/work-servlet.png)