package hang.commerce.repo;

import org.springframework.stereotype.Component;

/**
 * 用户类
 */
@Component
public class User {

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 最后登录时间
	 */
	private String lastLoginTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
}
