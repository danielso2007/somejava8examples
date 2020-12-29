package br.com.somejava8examples.commons.entities;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffPublicTest {

    private StaffPublic staffPublic; 
    
    @BeforeEach
    void setUp() throws Exception {
        staffPublic = new StaffPublic();
        staffPublic.setAge(12);
        staffPublic.setExtra("EXTRA");
        staffPublic.setName("ASHDKASJD");
    }

    @Test
    void testHashCode() {
        assertNotNull(staffPublic.hashCode());
    }

    @Test
    void testStaffPublic() {
        assertNotNull(new StaffPublic("NAME", 30, "EXTRA"));
    }

    @Test
    void testGetName() {
        assertNotNull(staffPublic.getName());
    }

    @Test
    void testSetName() {
        staffPublic.setName("NAME2");
        assertNotNull(staffPublic.getName());
    }

    @Test
    void testGetAge() {
        assertNotNull(staffPublic.getAge());
    }

    @Test
    void testSetAge() {
        staffPublic.setAge(50);
        assertNotNull(staffPublic.getAge());
    }

    @Test
    void testGetExtra() {
        assertNotNull(staffPublic.getExtra());
    }

    @Test
    void testSetExtra() {
        staffPublic.setExtra("ASJKDHKASJ");
        assertNotNull(staffPublic.getExtra());
    }

    @Test
    void testEqualsObject() {
        assertNotNull(staffPublic.equals(null));
    }
    
    @Test
    void testEqualsNewObject() {
        assertNotNull(staffPublic.equals(new Object()));
    }
    
    @Test
    void testEqualsNew() {
        assertNotNull(staffPublic.equals(new StaffPublic()));
    }

    @Test
    void testToString() {
        assertNotNull(staffPublic.toString());
    }

}
