import org.apache.camel.builder.RouteBuilder;

public class FileCopyExample extends RouteBuilder {
    public void configure()  {
              from("file:data/input?noop=true")
                      .log("The Processed file name is: ${file:name}")
                      .to("file:data/output");

//        from("file:C:\\data\\source?move=C:\\data\\Archive")
//                .choice()
//                .when(header(("{$file:ext}")).isEqualTo("html"))
//                .to("file:C:\\data\\html")
//                .log("file extension"+header("$file:ext").toString())
//                .when(header("foo").isEqualTo("cheese"))
//                .to("file:C:\\data\\target")
//                .otherwise()
//                .to("file:C:\\data\\backup");




     }
}
