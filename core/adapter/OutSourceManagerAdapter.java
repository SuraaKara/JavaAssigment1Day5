package javaDay5Assigment1.core.adapter;

import javaDay5Assigment1.core.abstracts.OutSourceService;

public class OutSourceManagerAdapter implements OutSourceService {

	@Override
	public void registerwith() {
		OutSourceManagerAdapter sourceManager= new OutSourceManagerAdapter();
		sourceManager.registerwith();
		
		
	}

	@Override
	public void loginwith() {
		OutSourceManagerAdapter sourceManager= new OutSourceManagerAdapter();
		sourceManager.registerwith();
		
	}

}
