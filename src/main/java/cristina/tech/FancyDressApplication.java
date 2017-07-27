package cristina.tech;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Start class or Spring Boot Runnable JAR for Event-driven Stream Processing.
 * <p></p>Typically, a streaming data pipeline includes consuming
 * events from external systems, data processing, and polyglot persistence.</p>
 * <p>These phases are commonly referred to as Source, Processor, and Sink in Spring Cloud
 * Stream terminology. </p>
 * <p>When using @EnableBinding(Source.class), Spring Cloud Stream automatically
 * creates a message channel with the name output which is used by the @InboundChannelAdapter.
 * Also see: spring.cloud.stream.bindings.output.destination in application.yml
 * </p>
 * <p>
 * The application has only a sink (consumer) and the source (producer) is the Python
 * script, see <code>/src/main/resources/producer.py</code> and is run a separate
 * process.
 */
@SpringBootApplication
public class FancyDressApplication {

    public static void main(String[] args) {
        SpringApplication.run(FancyDressApplication.class, args);
    }
}
