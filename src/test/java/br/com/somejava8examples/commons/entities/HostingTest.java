package br.com.somejava8examples.commons.entities;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class HostingTest {

    private Hosting hosting;
    
    @BeforeEach
    void setUp() throws Exception {
        hosting = new Hosting(12, "NAME", 23323L);
    }

    @Test
    void testHashCode() {
        assertNotNull(hosting.hashCode());
    }

    @Test
    void testHosting() {
        assertNotNull(new Hosting(44, "LASKÇDLSAK", 888L));
    }

    @Test
    void testGetId() {
        assertNotNull(hosting.getId());
    }

    @Test
    void testSetId() {
        hosting.setId(7938);
        assertNotNull(hosting.getId());
    }

    @Test
    void testGetName() {
        assertNotNull(hosting.getName());
    }

    @Test
    void testSetName() {
        hosting.setName("KKKJSJJS");
        assertNotNull(hosting.getName());
    }

    @Test
    void testGetWebsites() {
        assertNotNull(hosting.getWebsites());
    }

    @Test
    void testSetWebsites() {
        hosting.setWebsites(9999L);
        assertNotNull(hosting.getWebsites());
    }

    @Test
    void testEqualsObject() {
        assertTrue(!hosting.equals(null));
    }
    
    @Test
    void testEqualsNewObject() {
        assertTrue(!hosting.equals(new Object()));
    }
    
    @Test
    void testEqualsNew() {
        assertTrue(!hosting.equals(new Hosting(33, "OOOI", 22299L)));
    }

    @Test
    void testToString() {
        assertNotNull(hosting.toString());
    }

}
