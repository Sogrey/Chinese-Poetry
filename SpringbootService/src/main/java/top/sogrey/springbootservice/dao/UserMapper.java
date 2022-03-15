package top.sogrey.springbootservice.dao;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import top.sogrey.springbootservice.model.AppUser;

import org.apache.ibatis.annotations.Mapper;
/**
 * @author Sogrey
 * @data 2022/3/12
 */
@Mapper
public interface UserMapper extends BaseMapper<AppUser>{

}
