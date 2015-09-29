import com.iteso.observer.Observer;
import com.iteso.observer.Subject;
import com.iteso.observer.impl.JamaiconMobileApp;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

/**
 * Created by Sacrp on 9/29/15.
 */
public class JamaiconMobileAppTest {

    private Subject subject;
    private JamaiconMobileApp app;



    @Before
    void setup()
    {
        subject = mock(com.iteso.observer.Subject.class);
        app = new JamaiconMobileApp(subject, "Sujeto 1");
    }

    @Test
    void testTeamName()
    {
        assertEq

    }






    }
}
