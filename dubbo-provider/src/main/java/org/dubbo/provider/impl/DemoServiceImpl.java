package org.dubbo.provider.impl;

import java.util.ArrayList;
import java.util.List;

import org.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public List<String> getPermissions(Long id) {
		List<String> demo = new ArrayList<String>();
		demo.add(String.format("Permission_%d", id - 1));  
        demo.add(String.format("Permission_%d", id));  
        demo.add(String.format("Permission_%d", id + 1));  
        return demo;
	}

}
