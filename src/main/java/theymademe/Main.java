package theymademe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class Main {



    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

      Animal animal =  ctx.getBean(TestSpring.class).getSomeAnimal();
      animal.test();

    }

}
