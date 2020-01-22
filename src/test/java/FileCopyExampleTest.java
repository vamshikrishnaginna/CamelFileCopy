import com.FileCopy.direct.SampleDirectRoute;
import org.apache.camel.Consume;
import org.apache.camel.Consumer;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

public class FileCopyExampleTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception{
        return new SampleDirectRoute();
    }

    @Test
    public void checkFileExitsInOutputDirectory() throws InterruptedException
    {
        Thread.sleep(5000);
        File file = new File("data/output");
        assertTrue(file.isDirectory());

        Exchange exchange=consumer.receive("file:sampleOutput");
        assertEquals("output.txt", exchange.getIn().getHeader("CamleFileName"));


    }





}
