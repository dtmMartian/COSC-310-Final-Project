package nlp;

import User.solution;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class GoogleTranslate {
//    static String language="es";

    //This is a test to learn and understand the api
    public static void main(String[] args) {

        String text = "Switching to spanish";
        HttpResponse<JsonNode> response = Unirest.post("https://google-translate1.p.rapidapi.com/language/translate/v2")
                .header("content-type", "application/x-www-form-urlencoded")
                .header("Accept-Encoding", "application/gzip")
                .header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .body("q=" + text +"&target=es&source=en")
                .asJson();

        Object output= response.getBody().getObject().get("data");
        String out = output.toString();
        String[] array = out.split(",");


//        System.out.println(out);
        System.out.println(array[0].substring(36, array[0].length()-4));
    }


//    public static String chooselanguage(String lang){
////      language = solution.Findsol(lang);
//
//        if(lang.equals("Chatbot:switching to french")) {
//            return language="fr";
//        }
//        if(lang.equals("Chatbot:switching to spanish")) {
//            return language="es";
//        }
//        if (lang.equals("Chatbot:switching to english")){
//            return null;
//        }
//
//    return null;}

//    this is a method implementing the google translate api
    public static String translate(String text, String language){
        HttpResponse<JsonNode> response = Unirest.post("https://google-translate1.p.rapidapi.com/language/translate/v2")
                .header("content-type", "application/x-www-form-urlencoded")
                .header("Accept-Encoding", "application/gzip")
                .header("X-RapidAPI-Host", "google-translate1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .body("q=" +text +"&target="+language+"&source=en")
                .asJson();

//        HttpResponse<JsonNode> response = Unirest.post("https://google-translate20.p.rapidapi.com/translate")
//                .header("content-type", "application/x-www-form-urlencoded")
//                .header("X-RapidAPI-Host", "google-translate20.p.rapidapi.com")
//                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
//                .body("text="+text+"&tl=es&sl="+language)
//                .asJson();

        Object output= response.getBody().getObject().get("data");
        String out = output.toString();
        String[] array = out.split(",");
        return array[0].substring(36, array[0].length()-4);

    }
}
