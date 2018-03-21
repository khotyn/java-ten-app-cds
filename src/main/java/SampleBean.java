import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleBean {
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(("spring-config.xml"));
        SampleBean sampleBean = applicationContext.getBean("sampleBean", SampleBean.class);
        System.out.println(sampleBean.getHello());
    }
}
