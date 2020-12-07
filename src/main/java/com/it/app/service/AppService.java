package com.it.app.service;

import com.it.app.domain.App;

public interface AppService {
	public boolean saveApp(App app);
	public boolean checkCitizenState(String ssn);
}
