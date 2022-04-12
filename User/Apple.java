package User;

import java.util.*;

public class Apple extends Device {

    //List<List<String>> master = new ArrayList<>();
    //Map<List<String>, String> problems = new HashMap<>();

    public Apple() {

//each problem has a list of keywords associated with it
        List<String> P1 = new ArrayList<>();
        P1.add("power");
        P1.add("turn on");
        P1.add("blank screen");
        List<String> P2 = new ArrayList<>();
        P2.add("bright");
        P2.add("too dim");
        List<String> P3 = new ArrayList<>();
        P3.add("ringtone");
        List<String> P4 = new ArrayList<>();
        P4.add("dies ");
        P4.add("dies");
        List<String> P5 = new ArrayList<>();
        P5.add("slow");
        List<String> P6 = new ArrayList<>();
        P6.add("bluetooth");
        List<String> P7 = new ArrayList<>();

        P7.add("icloud");
        List<String> P8 = new ArrayList<>();
        P8.add("touch screen stopped working");
        List<String> P9 = new ArrayList<>();
        P9.add("web");
        P9.add("google");
        P9.add("safari");
        List<String> P10 = new ArrayList<>();
        P10.add("cellular");
        P10.add("data");
        P10.add("coverage");
        P10.add("sim");
        List<String> P11 = new ArrayList<>();
        P11.add("wifi");
        List<String> P12 = new ArrayList<>();
        P12.add("planning");
        P12.add("calendar");
        P12.add("routine");
        List<String> P13 = new ArrayList<>();
        P13.add("pay");
        P13.add("wallet");
        P13.add("card");
        List<String> P14 = new ArrayList<>();
        P14.add("language");
        List<String> P15 = new ArrayList<>();
        P15.add("volume");
        List<String> P16 = new ArrayList<>();
        P16.add("scratch");
        P16.add("dent");
        P16.add("damage");
        P16.add("protector");
        P16.add("broken");
        List<String> P17 = new ArrayList<>();
        P17.add("hello");
        List<String> P18 = new ArrayList<>();
        P18.add("see you tomorrow");
        List<String> P19 = new ArrayList<>();
        P19.add("android");
        List<String> P20 = new ArrayList<>();
        P20.add("apple");
        List<String> P21 = new ArrayList<>();
        P21.add("english");
        List<String> P22 = new ArrayList<>();
        P22.add("spanish");
        List<String> P23 = new ArrayList<>();
        P23.add("french");
        List<String> P24 = new ArrayList<>();
        List<String> P25 = new ArrayList<>();
        List<String> P26 = new ArrayList<>();
        List<String> P27 = new ArrayList<>();
        List<String> P28 = new ArrayList<>();
        List<String> P29 = new ArrayList<>();
        List<String> P30 = new ArrayList<>();
        //all keyword lists compliled to one place

        master = (Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P18, P19, P20,P21,P22,P23));

        //each problem has a User.solution
        String S1 = "Chatbot: on your apple, you should try to plug it into power";
        String S2 = "Chatbot: on your apple, you should try access setting>display>brightness";
        String S3 = "Chatbot: on your apple, you should try turn on the ringer";
        String S4 = "Chatbot: You should try to get a new Android";
        String S5 = "Chatbot: on your apple, you should try to close some apps";
        String S6 = "Chatbot: on your apple, you should try to make sure the device you want to pair with is in pairing mode,then check your settings";
        String S7 = "Chatbot: on your apple, you should try to access setting and pay for more Icloud storage";
        String S8 = "Chatbot: on your apple, you should try to touch it software";
        String S9 = "Chatbot: on your apple, you should try to tap the safari icon";
        String S10 ="Chatbot: For more information on your cell phone provider, please contact them";
        String S11 ="Chatbot: Go to your home router,then settings and select the given name and then enter password";
        String S12 = "Chatbot: on your apple, you should try to use the calendar tool that comes with your model";
        String S13 = "Chatbot: on your apple, you should try to go to wallet app, press add card, add card details";
        String S14 = "Chatbot: on your apple, you should try to go to setting > accessibility > preferred > language";
        String S15 = "Chatbot: on your apple, you should try to use the side button to adjust volume up or down";
        String S16 = "Chatbot: you should take your apple device to the shop and be more careful";
        String S17 = "Chatbot: How can I help you";
        String S18 = "Chatbot: See you tomorrow";
        String S19 = "Chatbot: you are already in apple support. ";
        String S20 = "Chatbot: You are already in apple support";
        String S21 = "Chatbot: You are already in English";
        String S22 = "Chatbot: You are already in Spanish";
        String S23 = "Chatbot: You are already in French";
        String S24 = "abc";
        String S25 = "abc";
        String S26 = "abc";
        String S27 = "abc";
        String S28 = "abc";
        String S29 = "abc";
        String S30 = "abc";
        //problems and solutions paired in hashset
        problems.put(P1, S1);
        problems.put(P2, S2);
        problems.put(P3, S3);
        problems.put(P4, S4);
        problems.put(P5, S5);
        problems.put(P6, S6);
        problems.put(P7, S7);
        problems.put(P8, S8);
        problems.put(P9, S9);
        problems.put(P10, S10);
        problems.put(P11, S11);
        problems.put(P12, S12);
        problems.put(P13, S13);
        problems.put(P14, S14);
        problems.put(P15, S15);
        problems.put(P16, S16);
        problems.put(P17, S17);
        problems.put(P18, S18);
        problems.put(P19, S19);
        problems.put(P20, S20);
        problems.put(P21,S21);
        problems.put(P22,S22);
        problems.put(P23,S23);

    }




    public List GetMaster() {
        return master;
    }
}
//key word lists