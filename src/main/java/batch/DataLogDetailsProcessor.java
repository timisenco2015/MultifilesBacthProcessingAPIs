package batch;

import org.springframework.batch.item.ItemProcessor;
import dto.DataLogDetails;


public class DataLogDetailsProcessor implements ItemProcessor<DataLogDetails, DataLogDetails> 
{

    @Override
    public DataLogDetails process(DataLogDetails dataLogDetails) throws Exception 
    {
    	
        return dataLogDetails;
    }
}