Spring Boot Web application with Spring MVC

technologies : java 11, Gradle, Spring boot, JSP, Spring MVC

--Navigate to application location on command prompt:
Run "gradle clean eclipse" if you face any dependencies issues with tomcat-jasper jar

--application.properties under src/main/java takes care of views (JSP)

--Run the application and access on browser 
	
	i) http://localhost:8080/sample-req?input=SpringMVC
	
	ii) http://localhost:8080/product/show-product-details?pId=Moto1Pwr&pName=MotoOnePower&description=motorolaonepowermobile&price=15000
	
	