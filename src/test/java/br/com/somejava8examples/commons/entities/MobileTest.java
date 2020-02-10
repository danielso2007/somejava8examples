package br.com.somejava8examples.commons.entities;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class MobileTest {

	private Mobile mobile2;
	
	@BeforeEach
	void setUp() throws Exception {
		mobile2 = new Mobile();
		mobile2.setBrand("ASLJDK");
		mobile2.setId(133L);
		mobile2.setName("ASLKDJLASJD");
		mobile2.setDisplayFeatures(new DisplayFeatures());
	}

	@Test
	void testHashCode() {
		assertNotNull(mobile2.hashCode());
	}

	@Test
	void testGetId() {
		assertNotNull(mobile2.getId());
	}

	@Test
	void testSetId() {
		mobile2.setId(3332L);
		assertNotNull(mobile2.getId());
	}

	@Test
	void testGetBrand() {
		assertNotNull(mobile2.getBrand());
	}

	@Test
	void testSetBrand() {
		mobile2.setBrand("HHH#%@LKJ");
		assertNotNull(mobile2.getBrand());
	}

	@Test
	void testGetName() {
		assertNotNull(mobile2.getName());
	}

	@Test
	void testSetName() {
		mobile2.setName("ALSKHDASKLJD");
		assertNotNull(mobile2.getName());
	}

	@Test
	void testGetDisplayFeatures2() {
		assertNotNull(mobile2.getDisplayFeatures());
	}

	@Test
	void testSetDisplayFeatures2() {
		mobile2.setDisplayFeatures(new DisplayFeatures());
		assertNotNull(mobile2.getDisplayFeatures());
	}

	@Test
	void testEqualsObject() {
		assertTrue(!mobile2.equals(null));
	}
	
	@Test
	void testEqualsNewObject() {
		assertTrue(!mobile2.equals(new Object()));
	}
	
	@Test
	void testEqualsMobile() {
		Mobile mobileNew = new Mobile();
		mobileNew.setBrand("ASLJDDDDDK");
		mobileNew.setId(13344L);
		mobileNew.setName("AXXXXDJLASJD");
		assertTrue(!mobile2.equals(mobileNew));
	}

	@Test
	void testToString() {
		assertNotNull(mobile2.toString());
	}

}
