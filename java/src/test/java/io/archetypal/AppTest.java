package io.archetypal;


import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Test;

import io.archetypal.HelloWorld;

/**
 * Unit test.
 */
public class AppTest {

    /**
     * Simply run hello world.
     */
    public void testApp() {
        new HelloWorld().run();
    }
    
    @Test
    public void testKafka() throws InterruptedException, ExecutionException {
    	Properties props = new Properties();
    	 props.put("bootstrap.servers", "192.168.99.100:9092");
    	 props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    	 props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
         props.put("request.required.acks", "1");
         
    	 try (Producer<String, String> producer = new KafkaProducer<>(props)) {
	    	 for(int i = 0; i < 10; i++) {
	    	     producer.send(new ProducerRecord<String, String>("test", Integer.toString(i), Integer.toString(i)));
	    	 }
    	 }
    }

}
