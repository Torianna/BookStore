# BookStore

This app is able to store book entries and list them using REST API.

##### PREREQUISITES:
- Java 8 or higher
- Spring
- Maven

##### Creation of project environment

Build your Maven project by typing:

            mvn clean
            mvn package

You have to use this command in project's root directory.

Copy .war file from /target/demo.war -> {tomcatPath}/webapps.
Then go to {tomcatpath}\bin\catalina.bat run and run following command.



If everything went properly you should be able to run Spring application.



You can use the app in your browser by going to:

http://127.0.0.1:8080/


You can also use backend api. Endpoints are located in:

http://localhost:8080/demo/bookStore/books for get method

http://localhost:8080/demo/bookStore/books/addBook for post method



Name and surname should both start with a letter 'A'. 

Example of a proper json file for post request to api: 

    {
        "author": "Klaudia Agoralska",
        "title": "Torianna",
        "isbn": "123456789"
    }
