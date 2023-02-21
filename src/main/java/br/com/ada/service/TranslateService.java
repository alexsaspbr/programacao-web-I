package br.com.ada.service;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class TranslateService {

    public String getMessage(String language) {
        String result = "";
        switch (language) {
            case "fr" : result = "Bonjour"; break;
            case "de" : result = "Willkommen"; break;
            case "en" : result = "Good Morning"; break;
        }

        return result;
    }

}
