package nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;


import java.util.List;

public class POS {
    public POS(){

    }

    //String text;
    public static void lstring(String txt) {


        StanfordCoreNLP stanfordCoreNLP = pipeline.getPipeline();

        //String text = "Hi! My name is Logan. I don't know what I am doing.";

        CoreDocument coreDocument = new CoreDocument(txt);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel>coreLabelList=coreDocument.tokens();
        for (CoreLabel corelabel: coreLabelList) {

            String pos = corelabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println( corelabel.originalText()+" = "+pos);

        }

    }

//    //public void settext(String text){
//        this.text=text;
//    }

}
