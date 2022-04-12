package nlp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

public class Synonym {
    //synonym &  similarto working but not implemented
    //it returns an array of strings
    public static void main(String[] args) throws UnirestException {
         String host = "https://wordsapiv1.p.rapidapi.com/words/";
         String query = "/synonyms";
        String word = "lovely";

//        HttpResponse<String> response = Unirest.get("https://wordsapiv1.p.rapidapi.com/words/off/similarTo")
//                .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
//                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
//                .asString();


        HttpResponse<JsonNode> response2 = Unirest.get(host + word + query)
                .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();
//        String output = response2.getBody();
//        output = output.replace("{\"word\":\"test\",\"synonyms\":[","");
//        output = output.replaceAll(",","");
//        output = output.replaceAll("]}","");
////        System.out.println(output);
//        String[] outputArray = output.split("\"");
//        for (int i = 0; i < outputArray.length; i++){
//            System.out.println(outputArray[i]);
//        }
        Object output= response2.getBody().getObject().get("synonyms");
        String out = output.toString();
        String[] array = out.split(",");
        System.out.println(array[1].replaceAll("[^a-zA-Z0-9\\s]",""));
//        System.out.println(array[].replaceAll("synonyms","").replaceAll("[^a-zA-Z0-9\\s]",""));
    }

    public static String[] similarTo(String text){
        String host = "https://wordsapiv1.p.rapidapi.com/words/";
        String query = "/similarTo";
        String word = "lovely";

        HttpResponse<JsonNode> response = Unirest.get(host + word + query)
                .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("similarto");
        String out = output.toString();
        String[] array = out.split(",");


        return array;
    }

    public static String[] synonyms(String text){
        String host = "https://wordsapiv1.p.rapidapi.com/words/";
        String query = "/synonyms";
        String word = "lovely";
        HttpResponse<JsonNode> response2 = Unirest.get(host + word + query)
                .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();
        Object output= response2.getBody().getObject().get("synonyms");
        String out = output.toString();
        String[] array = out.split(",");

        return array;
    }
}
