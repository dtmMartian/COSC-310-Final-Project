package nlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class pipeline {

    private static StanfordCoreNLP stanfordCoreNlp;
    private static String propertiesName = "tokenize, ssplit, pos";
    private static Properties properties;


    private void Pipeline () {

    }

    static{
        properties = new Properties();
        properties.setProperty("annotations",propertiesName);
    }

    public static StanfordCoreNLP getPipeline(){

        if(stanfordCoreNlp == null) {
            stanfordCoreNlp = new StanfordCoreNLP(properties);
        }
    return stanfordCoreNlp;
    }

}
