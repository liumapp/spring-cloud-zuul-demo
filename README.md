# spring-cloud-zuul-demo
A simple Spring Cloud Zuul demo . 

![DemoPic](https://github.com/liumapp/spring-cloud-zuul-demo/blob/master/pic/enterPoint.jpg)

## how to use 

* first of all , start eureka .

* next , start client a , client b and gateway .

* now , let's take a look at Eureka pannal , it should be like this : 
 
![eureka](https://github.com/liumapp/spring-cloud-zuul-demo/blob/master/pic/eureka.jpg)

* Client A provides a simple function : 

![clienta](https://github.com/liumapp/spring-cloud-zuul-demo/blob/master/pic/clienta.jpg)

* And Client B also provides a simple function : 

![clientb](https://github.com/liumapp/spring-cloud-zuul-demo/blob/master/pic/clientb.jpg)

* But Gateway (zuul itself) is much complex : 

    * visit Client B by Zuul without Token : 
    
    ![withoutToken](https://github.com/liumapp/spring-cloud-zuul-demo/blob/master/pic/visitzuulwithouttoken.jpg)
    
    * visit Client B by Zuul with a token :
    
    ![withToken](https://github.com/liumapp/spring-cloud-zuul-demo/blob/master/pic/visitzuulwithtoken.jpg)
    
    * if you want  try to visits Client A , just simply visit http://localhost:2333/demo-client-a?accessToken=token on your browser . 
    
    