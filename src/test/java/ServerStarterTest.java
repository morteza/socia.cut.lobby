import org.junit.Test;

import social.cut.lobby.ServerStarter;

import static org.junit.Assert.*;

public class ServerStarterTest {
    @Test public void testServerStarterStartMethod() {
      ServerStarter classUnderTest = new ServerStarter();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.start());
    }
}
