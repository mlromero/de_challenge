package cl.de_challenge;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.transforms.GroupByKey;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.PCollectionTuple;
import org.apache.beam.sdk.values.TupleTagList;

public class EPL {



    public void readEPL(Options options, Pipeline p){

        String originPath = options.getOriginPath();
        PCollection<String> data;
        data = p.apply(TextIO.read().from("data/*"));

        //data = p.apply(TextIO.read().from(options.getOriginPath()));

        PCollectionTuple dataSchemaValidated = data
                .apply(ParDo //GroupByKey
                        .of(new ETL())
                        .withOutputTags(ETL.result, null));

    }



}
