package nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class tokenisation {

     static SpellCheck spellCheck = new SpellCheck();

    private static String Rtext;
    String text;
//String Rtext="";
   // public static void main(String txt) {
   public static void main(String[] args) {
       run("thiss iss Sparta");
   }
   public static String run(String text){
       Rtext = "";
    StanfordCoreNLP stanfordCoreNLP= pipeline.getPipeline();


//text=txt;
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();
        String word;


        for(CoreLabel coreLabel:coreLabelList){
            word = coreLabel.originalText();
           word= spellCheck.correct(word);
            Rtext=Rtext+word+" ";

        }

       System.out.println(Rtext);
        return Rtext;
    }
}
