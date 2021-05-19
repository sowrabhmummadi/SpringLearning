import com.sow.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortuneMessage());

        // close the context
        context.close();
    }
}
