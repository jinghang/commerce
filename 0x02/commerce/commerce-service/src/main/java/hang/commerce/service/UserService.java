package hang.commerce.service;

import hang.commerce.repo.User;
import hang.commerce.util.DateTimeTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

	@Autowired
	private User user;

	public User get(){
		user.setName("Hello");
		user.setLastLoginTime(DateTimeTool.format(new Date()));
		return user;
	}

}
