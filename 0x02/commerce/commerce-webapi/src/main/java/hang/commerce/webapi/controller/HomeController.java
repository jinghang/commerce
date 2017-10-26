package hang.commerce.webapi.controller;

import hang.commerce.common.ApiResult;
import hang.commerce.common.ApiResultCode;
import hang.commerce.repo.User;
import hang.commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/home")
@RestController
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public ApiResult<User> get(){
		User user = userService.get();
		ApiResult<User> result = new ApiResult<>();
		result.setCode(ApiResultCode.OK);
		result.setMessage("获取成功");
		result.setData(user);

		return result;
	}
}
