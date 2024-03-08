package dev.earlpadron.learning.freeCodeCamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties") //for a singular properties file
@PropertySources({ //use this annotation for several .properties files
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom2.properties")
})
public class MyFirstService {

//   Autowired
//   private MyFirstClass myFirstClass; INSTANCE DEPENDENCY INJECTION, NOT RECOMMENDED unless in test
    private final MyFirstClass myFirstClass;
    private Environment environment; //Environment is a special bean that allows us to access the properties and profiles of the current application.

    @Value(value = "${my.prop}") //@Value will look in a .properties file with the key inside ${<keyForProperty>}
    private String customProperty;

    @Value(value = "${my.prop2}")
    private String custom2Property;


    @Value(value = "${my.custom.property}")
    private String customPropertyInDiffFile;

    //if the bean isn't defined with a custom bean name in ApplicationConfig, the method name can be used by @Qualifier
    public MyFirstService(@Qualifier("myFirstBean") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass; //CONSTRUCTOR DEPENDENCY INJECTION, THIS IS THE RECOMMENDED WAY TO INJECT DEPENDENCIES
    }

    @Autowired
    public void setEnvironment(Environment environment){ //SETTER INJECTION
        this.environment = environment;
    }

//    @Autowired
//    public void injectDependencies(@Qualifier("myFirstBean") MyFirstClass myFirstClass){
//        this.myFirstClass = myFirstClass; //SETTER DEPENDENCY INJECTION
//    }

    public String respondWithDependency(){
        return "This service is responding with MyFirstClass " + myFirstClass.sayHello();
    }

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }

    public String getOsName(){
        return environment.getProperty("os.name");
    }

    public String getDatabaseNameURL(){
        return environment.getProperty("spring.datasource.url");
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public String getCustom2Property() {
        return custom2Property;
    }

    public String getCustomPropertyInDiffFile() {
        return customPropertyInDiffFile;
    }




}
