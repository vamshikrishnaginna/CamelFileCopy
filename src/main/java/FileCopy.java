import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spring.javaconfig.CamelConfiguration;

public class FileCopy {

    public static void main(String args[])
    {

        CamelContext context =new DefaultCamelContext();
        try {
            context.addRoutes(new FileCopyExample());
            context.start();
            Thread.sleep(100000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
