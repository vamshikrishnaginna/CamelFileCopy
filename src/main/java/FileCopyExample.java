import org.apache.camel.builder.RouteBuilder;

public class FileCopyExample extends RouteBuilder {
    public void configure() throws Exception {
        from("file:C:\\data\\source?move=C:\\data\\Archive")
                .to("file:C:\\data\\target")
                .log("Processing File is ${file:name}");
    }
}
