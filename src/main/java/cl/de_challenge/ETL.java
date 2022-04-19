package cl.de_challenge;

import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.values.TupleTag;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ETL extends DoFn<String, String> {

    private final static Logger LOGGER = LoggerFactory.getLogger(ETL.class);

    public static final TupleTag<String> result = new TupleTag<String>(){};

    public ETL(){
    }

    @ProcessElement
    public void processElement(ProcessContext context){

        try {
            String row = context.element();
            JSONObject jsonObject = new JSONObject(row);


        }catch(JSONException e){
            LOGGER.error(e.getMessage());
        }


    }


}
