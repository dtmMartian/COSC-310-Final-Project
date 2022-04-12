package nlp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class GoogleMaps {
    public static void main(String[] args) {
        HttpResponse<JsonNode> response = Unirest.get("https://google-maps28.p.rapidapi.com/maps/api/place/nearbysearch/json?location=%2049.882114%2C%20-119.477829&radius=1000&language=en&keyword=phone%20repair")
                .header("X-RapidAPI-Host", "google-maps28.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("results");
        String out = output.toString();
        String[] array = out.split(",");

        System.out.println(array[10]);
        System.out.println(array[28]);
    }

    public static String[] address(){
        HttpResponse<JsonNode> response = Unirest.get("https://google-maps28.p.rapidapi.com/maps/api/place/nearbysearch/json?location=%2049.882114%2C%20-119.477829&radius=1000&language=en&keyword=phone%20repair")
                .header("X-RapidAPI-Host", "google-maps28.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("results");
        String out = output.toString();
        String[] array = out.split(",");
        return array;
    }
}
