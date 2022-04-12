package nlp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;


//This is a test to learn and understand the api
public class GoogleSearch {
    public static void main(String[] args) {
        HttpResponse<JsonNode> response = Unirest.get("https://google-search3.p.rapidapi.com/api/v1/search/q=screen is craked")
                .header("X-User-Agent", "desktop")
                .header("X-Proxy-Location", "CA")
                .header("X-RapidAPI-Host", "google-search3.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("results");
        String out = output.toString();
        String[] array = out.split(",");


//        System.out.println(out);
        System.out.println(array[0]);
        System.out.println(array[1]);


    }

    public static String[] googleSearch(String string){
//        String txt=string.replace(" ","+");
        HttpResponse<JsonNode> response = Unirest.get("https://google-search3.p.rapidapi.com/api/v1/search/q="+string)
                .header("X-User-Agent", "desktop")
                .header("X-Proxy-Location", "CA")
                .header("X-RapidAPI-Host", "google-search3.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("results");
        String out = output.toString();
        String[] array = out.split(",");

        return array;

    }
}
