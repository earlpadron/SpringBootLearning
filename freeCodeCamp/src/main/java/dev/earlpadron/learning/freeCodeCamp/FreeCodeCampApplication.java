package dev.earlpadron.learning.freeCodeCamp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class FreeCodeCampApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(FreeCodeCampApplication.class);

		//programmatically set the default application.properties to be used
		//app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev")); //this will use application-dev.properties
		var ctx = app.run(args);

		//SpringApplication.run(FreeCodeCampApplication.class, args);

//		MyFirstClass myFirstClass = ctx.getBean("myBean", MyFirstClass.class);
//		System.out.println(myFirstClass.sayHello());
//
//		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
//		System.out.println(myFirstService.respondWithDependency()); //prints the dependency
//
//		System.out.println(myFirstService.getJavaVersion()); //prints java version 17.0.7
//		System.out.println(myFirstService.getOsName()); // prints Windows 10
//		System.out.println(myFirstService.getDatabaseNameURL()); //retrieves information from the application.properties file, prints jdbc:mysql://localhost:3306/freecodecamp
//		//these two properties below belong to 2 different .properties file, must use @PropertyResources(<@PropertyResources[]>) at the class level in a component
//		System.out.println(myFirstService.getCustomProperty());
//		System.out.println(myFirstService.getCustom2Property());
//
//		System.out.println(myFirstService.getCustomPropertyInDiffFile()); //this value should change based on which profile is set to active



	}

}


































































































































































































































































