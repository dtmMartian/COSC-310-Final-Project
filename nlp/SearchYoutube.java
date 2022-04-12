package nlp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class SearchYoutube {

    public static void main(String[] args) {
        String text ="how to fix a phone";
        HttpResponse<JsonNode> response = Unirest.get("https://simple-youtube-search.p.rapidapi.com/search?query="+text+"&safesearch=false")
                .header("X-RapidAPI-Host", "simple-youtube-search.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("results");
        String out = output.toString();
        String[] array = out.split(",");

        System.out.println(array[12]);
        System.out.println(array[15]);
        System.out.println(array[33]);
        System.out.println(array[36]);
    }

    public static String[] search(String text){
        HttpResponse<JsonNode> response = Unirest.get("https://simple-youtube-search.p.rapidapi.com/search?query="+text+"&safesearch=false")
                .header("X-RapidAPI-Host", "simple-youtube-search.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("results");
        String out = output.toString();
        String[] array = out.split(",");

        return array;
    }
}
