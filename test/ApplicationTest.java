import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import java.util.ArrayList;

import models.Event;

import org.junit.Test;

import play.mvc.Content;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    @Test 
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }
    
    @Test
    public void renderTemplate() {
    	ArrayList<Event> list = new ArrayList<Event>();
    	Event a = new Event("t","bb", "IMPRO NIGHT!");
    	list.add(a);
        Content html = views.html.index.render(list);
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains(a.getName());
    }
  
   
}
