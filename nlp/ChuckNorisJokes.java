package nlp;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class ChuckNorisJokes {


    //test for api
    public static void main(String[] args) {
        HttpResponse<JsonNode> response = Unirest.get("https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/random")
                .header("accept", "application/json")
                .header("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("value");
        String out = output.toString();
        String[] array = out.split(",");


        System.out.println(array[0]);
    }


    //method that returns a random Chuck Norris joke
    public static String jokes(){
        HttpResponse<JsonNode> response = Unirest.get("https://matchilling-chuck-norris-jokes-v1.p.rapidapi.com/jokes/random")
                .header("accept", "application/json")
                .header("X-RapidAPI-Host", "matchilling-chuck-norris-jokes-v1.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("value");
        String out = output.toString();
        String[] array = out.split(",");

        return out;
    }

}
