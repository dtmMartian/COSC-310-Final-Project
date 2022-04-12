package nlp;



import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import kong.unirest.HttpResponse;
import java.util.Arrays;
import java.util.List;



public class SpellCheck {
    static String str = "IamtheSmarrtesmanalive";
    static String host = "https://spellcheck-tokenization-wordbreak.p.rapidapi.com/v1/spellcheck?str=";

//test fot the functionality of the spellcheck api and how to process it's output
    public static void main(String[] args) throws UnirestException {

       String fix = str.replace(" ","");
        System.out.println(fix);
        HttpResponse<JsonNode> response = Unirest.get(host + fix)
                .header("X-RapidAPI-Host", "spellcheck-tokenization-wordbreak.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

        Object output= response.getBody().getObject().get("data");
        String out = output.toString();
        String[] array = out.split(",");

//        output=output.substring(166+(2*str.length()),output.length() - 39);
        System.out.println(array[1].replaceAll("spellchecked","").replaceAll("[^a-zA-Z0-9\\s]",""));
        String correctedword;
        }

    //SpellCheck implemented and working
    //It takes a misspelled string and returns a corrected string
    public static String correct(String string) throws UnirestException {
        String txt=string.replace(" ","");
        System.out.println(txt);
        HttpResponse<JsonNode> response = Unirest.get(host + txt)
                .header("X-RapidAPI-Host", "spellcheck-tokenization-wordbreak.p.rapidapi.com")
                .header("X-RapidAPI-Key", "0ed8cf5c0dmsha7fcae6f8ed1076p10cd87jsn35150723b6cc")
                .asJson();

//        System.out.println(response.getHeaders().get("suggestions"));
//        String output=response.getBody();
//        output=output.substring(166+(2*txt.length()),output.length() - 39);
        Object output= response.getBody().getObject().get("data");
        String out = output.toString();
        String[] array = out.split(",");
        return(array[1].replaceAll("spellchecked","").replaceAll("[^a-zA-Z0-9\\s]",""));

    }
    }

