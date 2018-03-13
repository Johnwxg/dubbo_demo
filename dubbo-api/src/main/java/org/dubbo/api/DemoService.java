package org.dubbo.api;

import java.util.List;

/**
 * 接口类
 * @author Admin
 *
 */
public interface DemoService {
	List<String> getPermissions(Long id);
}
