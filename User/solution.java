package User;

//import User.Device;

import nlp.GoogleSearch;
import nlp.GoogleTranslate;
import nlp.SearchYoutube;
import nlp.Synonym;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class solution {
    static Device d1;
    private static String keyword;
    static Device apple = new Apple();
    static Device android = new Android();
   static Boolean dev;
   static String userText;
    public solution() {
        d1 = apple;
        dev = true;


    }



    public static String Findsol(String Q) {//takes in Sting
        userText = Q;
//        String[] P = Synonym.synonyms(Q);
//        String[] S= Synonym.similarTo(Q);

        Q = Q.toLowerCase(Locale.ROOT);//convert to lowercase
        Boolean ex = false;
        if(Q.equals("exit")||Q.equals("done"))//check if user entered an exit phrase
            return("exit");







        for (int i = 0; i < d1.master.size(); i++) {//double for loop to search each list in master list for keywords
            if(ex)//break controler
                break;
            List<String> L1 = d1.master.get(i);
            for (int j = 0; j < L1.size(); j++) {
                if (Q.contains(L1.get(j))) {
                    keyword = (L1.get(j));
                    ex = true;
                    break;
                } else {
                    keyword = "not found";
                }
            }
        }
            Q = "";
        if (keyword.equals("not found")) {//match keyword to its list and find User.solution that acompanies key vale
            ArrayList<String> setResponses = new ArrayList<String>();
            setResponses.add("Chatbot: Rephrase your problem. I couldn't understand that");
            setResponses.add("Chatbot: Check your spelling. My programming is key-sensitive!");
            setResponses.add("Chatbot: Answer in a one to two word manner. Example: data, power off, damage, etc..");
            setResponses.add("Chatbot: Get better at spelling because I cannot follow.");
            setResponses.add("Chatbot: Go back to school..\n Maybe read a book or two, \n eventually learn how to spell, and return with good grammar. ");

            String[] googleSearch = GoogleSearch.googleSearch(userText);
            String[] youtube = SearchYoutube.search(userText);

            String youtubeTitle = youtube[12];
            String youtubeURL = youtube[15];

            String googleTitle = googleSearch[0].replaceAll("\\[","").replaceAll("\\{", "").replaceAll("title:","");
            String googleWebsite = googleSearch[1].replaceAll("link:","");


            return (setResponses.get((int) (Math.random()*5)) ) + "\n" + "\n" + "But this is the top related result on Google: \n" + googleTitle +
                    "\n" + googleWebsite + "\n" + "\n" +"And this is the top related video on YouTube:\n"+ youtubeTitle + "\n" + youtubeURL+
                    "\n \n";
        }
        if(keyword.equals("apple")&&!dev) {
            d1 = apple;
            dev=true;
            return"Chatbot:switching to apple";


        }
        if(keyword.equals("french")) {
//            GoogleTranslate.chooselanguage(keyword);
            return ("Chatbot:switching to french");
        }
        if(keyword.equals("spanish")) {
//            GoogleTranslate.chooselanguage(keyword);
            return ("Chatbot:switching to spanish");
        }
        if (keyword.equals("english")){
//            GoogleTranslate.chooselanguage(keyword);
            return "Chatbot:switching to english";
        }


        if(keyword.equals("android")&&dev) {
            d1 = android;
            dev = false;
            return "Chatbot:switching to Android";
        }

        for (int i = 0; i < d1.master.size(); i++) {
            for (int j = 0; j < d1.master.get(i).size(); j++) {
                if (d1.master.get(i).get(j).equals(keyword)) {
                    //System.out.println(d1.problems.get(d1.master.get(i)));
                    return d1.problems.get(d1.master.get(i));
                }
            }
        }

        return ("an error has occurred");//if nothing is found an error has occured
    }
}

