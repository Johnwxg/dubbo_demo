package org.dubbo.consumer;

import java.io.IOException;
import java.util.List;

import org.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DemoService demoService = (DemoService)context.getBean(DemoService.class);
		System.out.println("consumer");
		List<String> list = demoService.getPermissions(1L);
		System.out.println(list.toString());
		if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }  
}
