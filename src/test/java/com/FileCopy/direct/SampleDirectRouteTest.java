package com.FileCopy.direct;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.File;

public class SampleDirectRouteTest extends CamelTestSupport {
    @Override
    protected RouteBuilder createRouteBuilder(){
        return new SampleDirectRoute();

    }

    @Test
    public void sampleRouteTest() throws InterruptedException {

        Thread.sleep(5000);
//
     File file= new File("data/output");
        assertTrue(file.isDirectory());



    }
}
