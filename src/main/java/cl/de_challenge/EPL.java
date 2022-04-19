package cl.de_challenge;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.values.PCollection;

public class EPL {



    public void readEPL(Options options, Pipeline p){

        String originPath = options.getOriginPath();
        PCollection<String> data;
        data = p.apply(TextIO.read().from(options.getOriginPath()));




    }



}
