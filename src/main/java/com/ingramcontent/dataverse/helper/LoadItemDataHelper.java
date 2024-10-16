package com.ingramcontent.dataverse.helper;

import java.util.Map;
import java.util.HashMap;

import com.ingramcontent.dataverse.model.Producer;
import com.ingramcontent.dataverse.model.DataFilter;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LoadItemDataHelper implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public LoadItemDataHelper() {
    }

    
	public static void filterData(DataFilter dataFilter, Producer producer) {
	     if(dataFilter == null || dataFilter.getInput() == null) {
			 return;
		 }
	    
		 Map<String, String> input = dataFilter.getInput();
		 Map<String, String> filter = new HashMap<>();
		
		 for(String key:input.keySet()) {
			if(input.get(key) != null) {
				filter.put(key, input.get(key));
			}
		 }
		
		 producer.setDataFilter(filter);
	}
}