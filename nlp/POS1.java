package nlp;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;


import java.util.List;

public class POS1 {
    private static String nouns="";
    private static String adj="";
    private static String verbs="";
    private static String text;
    static tokenisation tok = new tokenisation();
    public POS1(){

    }

    //String text;
    public static String lstring(String txt) {

    text=txt;
        StanfordCoreNLP stanfordCoreNLP = pipeline.getPipeline();

        //String text = "Hi! My name is Logan. I don't know what I am doing.";

        CoreDocument coreDocument = new CoreDocument(txt);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel>coreLabelList=coreDocument.tokens();
        for (CoreLabel corelabel: coreLabelList) {

            String pos = corelabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println( corelabel.originalText()+" = "+pos);

            if(!pos.contains("NN")&&!pos.contains("JJ")&&!pos.contains("IN")&&!pos.contains("VB"))
                text=text.replace(corelabel.originalText()+" ","" );
                //nouns=nouns.concat(corelabel.originalText()+" ");
            //if (pos.contains("JJ")||pos.contains("IN"))
                //adj=adj.concat(corelabel.originalText()+" ");
            //if(pos.contains("VB"))
                //verbs=verbs.concat(corelabel.originalText()+" ");

        }
       String S1=nouns+" "+adj+" "+verbs;
        String S2=("nouns: "+nouns+" adj: "+adj+" verbs: "+verbs);
       // System.out.println(S2);
    verbs="";
    adj="";
    nouns="";
    text=tok.run(text);
        System.out.println(text);
    return text;
    }

//    //public void settext(String text){
//        this.text=text;
//    }

}

