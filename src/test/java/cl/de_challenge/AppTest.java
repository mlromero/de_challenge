package cl.de_challenge;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.values.PCollection;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void readData(){

        EPL epl = new EPL();
        PipelineOptions pipelineOptions = PipelineOptionsFactory.create();
        epl.readEPL(null, Pipeline.create(pipelineOptions));



    }


}
