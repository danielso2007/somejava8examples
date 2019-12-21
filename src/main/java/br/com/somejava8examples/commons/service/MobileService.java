package br.com.somejava8examples.commons.service;

import br.com.somejava8examples.commons.entities.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        return mobile.flatMap(Mobile2::getDisplayFeatures2)
                .flatMap(DisplayFeatures2::getResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);

    }

}
