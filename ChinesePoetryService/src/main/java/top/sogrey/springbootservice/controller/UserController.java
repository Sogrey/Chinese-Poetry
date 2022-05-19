package top.sogrey.springbootservice.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import top.sogrey.springbootservice.dao.UserMapper;
import top.sogrey.springbootservice.model.AppUser;
import top.sogrey.springbootservice.model.response.BaseResult;
import top.sogrey.springbootservice.model.response.StandardResult;

/**
 * 通过Mybatis Plus查询数据
 * @author Sogrey
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserMapper userMapper;

	/**
	 * 执行插入数据
	 * 
	 * @example http://localhost:10111/user/insert
	 * 
	 * @return
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public BaseResult insert() {
		try {
			AppUser user = new AppUser();
			user.setId(createRandomInt(1000, 9999));
			user.setUserName(createRandomStr(8));
			user.setAge(createRandomInt(10, 120));
			userMapper.insert(user);
			StandardResult<AppUser> result = new StandardResult<AppUser>(0, "insert:操作成功。");
			result.setData(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(1, "操作失败:" + e.getMessage());
		}
	}

	/**
	 * 查询数据
	 * 
	 * @example http://localhost:10111/user/queryById?id=1
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/queryById", method = RequestMethod.GET)
	public BaseResult queryById(@RequestParam("id") int id) {
		try {
			AppUser user = userMapper.selectById(id);

			StandardResult<AppUser> result = new StandardResult<AppUser>(0, "queryById:查询成功。");
			result.setData(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(1, "操作失败:" + e.getMessage());
		}
	}

	/**
	 * 查询所有数据
	 * 
	 * @example http://localhost:10111/user/queryAll
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	public BaseResult queryAll() {
		try {
			List<AppUser> allUsers = userMapper.selectList(null);
			StandardResult<AppUser> result = new StandardResult<AppUser>(0, "queryAll:查询成功。");
			result.setDatas(allUsers);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return new BaseResult(1, "操作失败:" + e.getMessage());
		}
	}

	/**
	 * 生成随机字符串
	 *
	 * @return
	 */
	private static String createRandomStr(int length) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(str.length());
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 生成随机整数
	 * 
	 * @param min 最大值
	 * @param max 最小值
	 * @return
	 */
	private static int createRandomInt(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}
}
