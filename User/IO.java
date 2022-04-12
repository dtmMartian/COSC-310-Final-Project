package User;

import nlp.*;


public class IO {

    boolean sts;
    String usertext;
    String Lusertext;
    googleistrans http = new googleistrans();

    GUI1 gui;
    Boolean exit = false;
    int excount=0;
    Survey survey;
    nlp.POS1 pos = new POS1();
    Server server = new Server();
    Apple apple;
    public String state;
    int lang = 0;

    public IO(GUI1 gui){

        this.gui=gui;
        apple = new Apple();
        solution sol = new solution();
    gui.reply("Hello! I am Team 30's Virtual Product Assistant"+"\n" + "\n" +"At anytime enter apple or android to switch to advice for the specified device\n"+
            "I am set to default to apple products\n"+"\n"+"In order to exit the program enter exit or done\n" + "\n"  + ChuckNorisJokes.jokes() +"\n"
            + "\n" + "Chatbot: How can I help you today?\n");
    }
    public IO(ClientGUI gui){

        this.gui=gui;
        apple = new Apple();
        solution sol = new solution();
        gui.reply("Hello! I am Team 30's Virtual Product Assistant"+"\n" +"at anytime enter apple or android to switch to advice for the specified device\n"+
                "I am set to default to apple products\n"+"in order to exit the program enter exit or done\n"+
                "Chatbot: How can I help you today?\n");
    }
    void button(String txt){
        gui.screenout("Client: " + txt + "\n");//user input is added to text area
        gui.field.setText("");//reset input box
   usertext=txt;
   // receive rahman's text here.
    }

    void solfind(String txt) throws Exception {
        txt = SpellCheck.correct(txt);
        txt = pos.lstring(txt);
        String ans= solution.Findsol(txt);
        if(ans.equals("Chatbot:switching to spanish")) {
            state = "Chatbot:switching to spanish";
        }
        if(ans.equals("Chatbot:switching to french")){
            state = "Chatbot:switching to french";
        }
        if(ans.equals("Chatbot:switching to english")){
            state = "Chatbot:switching to english";
        }
//        checkState();
       if(exit){
           exit();
       }
       else if (ans.equals("exit")){
            gui.screenout("Chatbot: please complete our survey\nplease answer the following questions by entering a score from 1-10\n" +
                    "1-not at all. 10-totaly agree\npress RETURN to contiue\n");
           survey = new Survey();
            exit();
        }
//       else if (sts) {
//           if (state.equals("Chatbot:switching to spanish")) {
//               gui.screenout(GoogleTranslate.translate(ans, "es") + "\n" + GoogleTranslate.translate("Chatbot:What else can I help you with?\n \n", "es"));
//           }
//           else if(state.equals("Chatbot:switching to french")){
//               gui.screenout(GoogleTranslate.translate(ans, "fr") + "\n" + GoogleTranslate.translate("Chatbot:What else can I help you with?\n \n", "fr"));
//
//           }
               if(ans.equals("Chatbot: you should take your apple device to the shop and be more careful")) {
                   String[] address = GoogleMaps.address();
                   String placeName = address[10];
                   String placeAddress = address[28];
                   //pos.lstring(txt);
                   gui.screenout(ans + "\n \n" + "Your closest repair shop is:" + "\n" + placeName + "\n" + placeAddress + "\n \n Chatbot:What else can I help you with?" + "\n \n");
                   // add the bot's answer here, send to rahman
               }

       else  {
           if (state.equals("Chatbot:switching to spanish")) {
               gui.screenout(http.callUrlAndParseResult("en","es" ,ans + "\n Chatbot:What else can I help you with?\n \n"));
           }
           else if(state.equals("Chatbot:switching to french")){
               gui.screenout(http.callUrlAndParseResult("en","fr" ,ans + "\n Chatbot:What else can I help you with? \n \n"));

           }
           else{
               gui.screenout(ans + "\nChatbot:What else can I help you with?\n \n");

           }
       }

        }




    private void exit() {
        exit = true;

            gui.screenout("ChatBot: "+survey.SurveyQuestions.get(excount)+"\n");
            Lusertext=usertext;
            if(excount>=1)
            survey.writer(survey.SurveyQuestions.get(excount-1)+": "+Lusertext);
        excount+=1;
        if(excount>=survey.SurveyQuestions.size())
        gui.close();
    }



}




