package top.sogrey.springbootservice.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;


@TableName(value = "appuser")
public class AppUser {
	@TableField(value="id")
	private int id;
	@TableField(value="userName")
	private String userName;
	@TableField(value="age")
	private int age;
	
	public AppUser() {
    }
	
	public int getId() {
		return id;
	}
	public AppUser setId(int id) {
		this.id = id;
		return this;
	}
	public String getUserName() {
		return userName;
	}
	public AppUser setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public int getAge() {
		return age;
	}
	public AppUser setAge(int age) {
		this.age = age;
		return this;
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
	
}
