package dev.earlpadron.learning.freeCodeCamp;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile(<dev/test/etc.>) can also be placed here on the class level to indicate all beans will be available in that environment only
public class ApplicationConfig {
    /**
     *  @Bean(value = "myBean") if not provided a value, Spring will automatically create a bean with the name "myFirstClass"
     *  @Primary and @Qualifier are used if several beans exist of the same class, allowing Spring to distinguish which bean to inject
     *                   @Qualifier can also be used in the class that uses this as a dependency to mark which bean to use
     */



    @Bean
    // @Profile("dev") //this bean will only be available in the dev environment
    // @Qualifier("bean1")
    //@Primary this bean with the highest priority to be injected first
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("firstBean");
    }

    //@Bean(value = "mySecondBean")
    @Bean
    //@Qualifier("bean2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("secondBean");
    }

}
