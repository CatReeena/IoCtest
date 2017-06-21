package theymademe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

/**
 * Created by Shera on 18.05.2017.
 */
@Component
public class TestSpring {


    private  Animal animal;

   public  Animal getSomeAnimal()
   {
       return animal;
   }
    @Autowired
   public void  setAnimal(Animal animalToSet)
   {
       animal = animalToSet;
   }
}
