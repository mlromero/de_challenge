package cl.de_challenge;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;


public class App {
    public static void main(String[] args){
        PipelineOptionsFactory.register(Options.class);
        PipelineOptions pipelineOptions = PipelineOptionsFactory.create();
        //@TODO: Agregar opciones
        Pipeline pipeline = Pipeline.create(pipelineOptions);
        //@TODO: Agregar pipeline a seguir
        pipeline.run().waitUntilFinish();

    }

}