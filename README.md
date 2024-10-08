# A web api to read csv file

build a web application based on spring-boot and easyexcel to read csv file

## Describe

* Firstly, build a spring-boot program with maven,add dependencies such like spring-boot-web (which can initialize a web application fast)、lombok(which makes code clean)、easyexcel(which read excel or csv file easily) and add a plugin named spring-boot-maven-plugin which can package a complete jar to run.

* Then, write the codes:
1. com.sam.francisco.DataFetchMain.java to start the program 
2. com.sam.francisco.entity.MobileFoodFacility to copy the csv titles to a entity 
3. com.sam.francisco.web.DataFetchController to make it possible to read the csv file to rows and transfer them to a api

* Lastly,clean and package this program, we would get a san_francisco_data_challenge.jar. I put it into the direction named runtime under the resources(absolute path is src/main/resources/runtime/san_francisco_data_challenge.jar), you can use the terminal code ``` java -jar san_francisco_data_challenge.jar```, then visit a browser or postman with address [click here](http://localhost:8080/fetch_francisco_data), after that, you can watch whole csv data on the screen.
