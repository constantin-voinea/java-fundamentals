package servlets;

import java.util.Locale;

/**
 * @author cvoinea
 */
public class HelloHelper {

    public String getGreeting(Locale locale) {

        String languageTag = locale.toLanguageTag().substring(0, 2);

        String greeting;
        switch (languageTag) {
            case "fr": {
                greeting = "Bonjour, ";
                break;
            }
            case "de": {
                greeting = "Guten Tag, ";
                break;
            }
            case "en": {
                greeting = "Hello, ";
                break;
            }
            default: {
                greeting = "Salut, ";
            }
        }
        return greeting;
    }
}
