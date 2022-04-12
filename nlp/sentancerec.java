package nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class sentancerec {
    public static <list> void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP= pipeline.getPipeline();

         String text= " Hey! I am Logan Gilroy. I do not know what I am doing. ";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();
        for (CoreSentence sentence:sentences) {

            System.out.println(sentence.toString());
        }
        //I have contributed...


    }
}
