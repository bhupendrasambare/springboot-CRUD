# springboot-CRUD
Started the spring boot learning after spring mvc This is the frist spring boot CRUD application i have developed

##Rquirements:

* apache maven 3.8.4

* java jdk 8 or 8+

## Start project

>unzip the project

> locate the folder in cmd/terminal

> run mvn spring-boot:run

###Important linkes:

> http://localhost:8081/h2-console [user:root password:root]

> http://localhost:8081/savestudents //save data 
>>method = "POST" 
>>input type = JSON body 
```json
{
    "age":20,
    "email":"bhupendra@gmail.com",
    "name":"bhupendra",
    "number":"+91 9516138020"
}
```


> http://localhost:8081/students //get data 
>>method = "GET" 

>http://localhost:8081/students/5 //getStudent by id
>>method = "GET" 


>http://localhost:8081/students/5 //Delete Student by id
>>method = "DELETE" 

> http://localhost:8081/students/5 //update data by id
>>method = "PUT" 
>>input type = JSON body value for update variable
```json
{
    "age":20,
    "email":"bhupendra@gmail.com",
    "name":"bhupendra",
    "number":"+91 9516138020"
}
```
