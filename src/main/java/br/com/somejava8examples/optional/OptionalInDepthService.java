package br.com.somejava8examples.optional;

import br.com.somejava8examples.commons.entities.*;
import br.com.somejava8examples.commons.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OptionalInDepthService {

    @Autowired
    private MobileService mService;

    public Optional<String> optionalBasicExample() {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

        return gender;
    }

    public Optional<String> optionalmapandflatMap() {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

        return nonEmptyGender;
    }

    public Optional<String> optionalFilter() {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        //Filter on Optional
        System.out.println(gender.filter(g -> g.equals("male"))); //Optional.empty
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional[MALE]
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); //Optional.empty

        return gender;
    }

    public Optional<String> optionalIsPresentAndIfPresent() {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        //condition failed, no output print
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));

        return emptyGender;
    }

    public Optional<String> optionalOrElseMethods() {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.orElse("<N/A>")); //MALE
        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

        System.out.println(gender.orElseGet(() -> "<N/A>")); //MALE
        System.out.println(emptyGender.orElseGet(() -> "<N/A>")); //<N/A>

        return gender;
    }

    public Mobile withoutJava8Optional() {
        ScreenResolution resolution = new ScreenResolution(750,1334);
        DisplayFeatures dfeatures = new DisplayFeatures("4.7", resolution);
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures);

        int mobileWidth = mService.getMobileScreenWidth(mobile);
        System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth);

        ScreenResolution resolution2 = new ScreenResolution(0,0);
        DisplayFeatures dfeatures2 = new DisplayFeatures("0", resolution2);
        Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures2);
        int mobileWidth2 = mService.getMobileScreenWidth(mobile2);
        System.out.println("Apple iPhone 16s Screen Width = " + mobileWidth2);

        return mobile2;
    }

    public Mobile2 withJava8Optional() {
        ScreenResolution resolution = new ScreenResolution(750,1334);
        DisplayFeatures2 dfeatures = new DisplayFeatures2("4.7", Optional.of(resolution));
        Mobile2 mobile = new Mobile2(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));

        MobileService mService = new MobileService();

        int width = mService.getMobileScreenWidth(Optional.of(mobile));
        System.out.println("Apple iPhone 6s Screen Width = " + width);

        Mobile2 mobile2 = new Mobile2(2015001, "Apple", "iPhone 6s", Optional.empty());
        int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
        System.out.println("Apple iPhone 16s Screen Width = " + width2);

        return mobile2;
    }
}
