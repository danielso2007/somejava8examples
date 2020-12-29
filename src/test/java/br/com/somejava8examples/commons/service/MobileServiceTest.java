package br.com.somejava8examples.commons.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.somejava8examples.commons.entities.DisplayFeatures;
import br.com.somejava8examples.commons.entities.Mobile;
import br.com.somejava8examples.commons.entities.ScreenResolution;

@SpringBootTest
@ActiveProfiles("test")
public class MobileServiceTest {

    @Autowired
    private MobileService service;

    private Mobile mobile;

    @BeforeEach
    void setUp() throws Exception {
        this.mobile = new Mobile();
        mobile.setId(12323L);
        mobile.setBrand("ASDASD");
        mobile.setName("AKJDHASKD");
    }

    @Test
    void getMobileScreenWidthDisplayFeaturesNullTest() {
        assertEquals(0, service.getMobileScreenWidth(this.mobile));
    }

    @Test
    void getMobileScreenWidthDisplayFeaturesScreenResolutionNullTest() {
        DisplayFeatures displayFeatures = new DisplayFeatures();
        displayFeatures.setSize("123px");
        this.mobile.setDisplayFeatures(displayFeatures);
        assertEquals(0, service.getMobileScreenWidth(this.mobile));
    }

    @Test
    void getMobileScreenWidthDisplayFeaturesScreenResolutionTest() {
        DisplayFeatures displayFeatures = new DisplayFeatures();
        displayFeatures.setSize("123px");
        ScreenResolution resolution = new ScreenResolution();
        resolution.setHeight(123);
        resolution.setWidth(344);
        displayFeatures.setResolution(resolution);
        this.mobile.setDisplayFeatures(displayFeatures);
        assertEquals(344, service.getMobileScreenWidth(this.mobile));
    }

}
