package br.com.somejava8examples.commons.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.somejava8examples.commons.entities.DisplayFeatures;
import br.com.somejava8examples.commons.entities.DisplayFeatures2;
import br.com.somejava8examples.commons.entities.Mobile;
import br.com.somejava8examples.commons.entities.Mobile2;
import br.com.somejava8examples.commons.entities.ScreenResolution;

@Service
public class MobileService {

    public int getMobileScreenWidth(Mobile mobile) {
        if (mobile != null) {
            DisplayFeatures dfeatures = mobile.getDisplayFeatures();
            if (dfeatures != null) {
                ScreenResolution resolution = dfeatures.getResolution();
                if (resolution != null) {
                    return resolution.getWidth();
                }
            }
        }
        return 0;
    }

    public Integer getMobileScreenWidth(Optional<Mobile2> mobile) {
        return mobile.flatMap(Mobile2::getDisplayFeatures2).flatMap(DisplayFeatures2::getResolution)
                .map(ScreenResolution::getWidth).orElse(0);
    }

}
