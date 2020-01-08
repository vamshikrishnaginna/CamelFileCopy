import org.apache.camel.builder.RouteBuilder;

public class FileCopyExample extends RouteBuilder {
    public void configure() throws Exception {
        from("file:C:\\data\\source?noop=true").to("file:C:\\data\\target");
    }
}
