package br.com.somejava8examples.commons.entities;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class StaffTest {

    private Staff staff;
    
    @BeforeEach
    void setUp() throws Exception {
        staff = new Staff("KASHDKJS", 34, new BigDecimal(12333));
    }

    @Test
    void testHashCode() {
        assertNotNull(staff.hashCode());
    }

    @Test
    void testStaff() {
        assertNotNull(new Staff("WWWWWS", 54, new BigDecimal(3344)));
    }

    @Test
    void testGetName() {
        assertNotNull(staff.getName());
    }

    @Test
    void testSetName() {
        staff.setName("JJJS");
        assertNotNull(staff.getName());
    }

    @Test
    void testGetAge() {
        assertNotNull(staff.getAge());
    }

    @Test
    void testSetAge() {
        staff.setAge(36);
        assertNotNull(staff.getAge());
    }

    @Test
    void testGetSalary() {
        assertNotNull(staff.getSalary());
    }

    @Test
    void testSetSalary() {
        staff.setSalary(new BigDecimal(999));
        assertNotNull(staff.getSalary());
    }

    @Test
    void testEqualsObject() {
        assertTrue(!staff.equals(null));
    }
    
    @Test
    void testEqualsNew() {
        assertTrue(!staff.equals(new Staff("ASKLJD", 78, new BigDecimal(333))));
    }
    
    @Test
    void testEqualsNewObject() {
        assertTrue(!staff.equals(new Object()));
    }

    @Test
    void testToString() {
        assertNotNull(staff.toString());
    }

}
