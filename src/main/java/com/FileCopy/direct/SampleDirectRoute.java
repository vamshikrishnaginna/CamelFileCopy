package com.FileCopy.direct;

import org.apache.camel.builder.RouteBuilder;

public class SampleDirectRoute extends RouteBuilder
{
    public void configure() throws Exception {

        from("file:data\\input?move=D:\\data1\\archive")//create an archive directory on your local drive
                .log("Received Message is ${body} and Headers are ${headers}")
                .to("file:data\\output");
    }
}


