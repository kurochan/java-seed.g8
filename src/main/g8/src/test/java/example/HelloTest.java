import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import example.Hello;

public class HelloTest {
    @Test
    public void testEcho() {
        assertThat(Hello.echo("Hello World!!"), is("Hello World!!"));
    }

    @Test
    public void testJoin() {
        assertThat(Hello.join("Hello", " World!!"), is("Hello World!!"));
    }
}
