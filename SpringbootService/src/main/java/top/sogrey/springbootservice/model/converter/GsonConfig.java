package top.sogrey.springbootservice.model.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

//@Configuration
public class GsonConfig {
	@Bean
	public GsonHttpMessageConverter gsonHttpMessageConverter() {
		GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
		GsonBuilder builder = new GsonBuilder();
		builder.setDateFormat("yyyy-MM-dd HH:mm:ss");//设置了Gson解析日期的转化格式
		builder.excludeFieldsWithModifiers(Modifier.PROTECTED);//设置Gson解析时修饰符为protected的字段被过滤掉。
		Gson gson = builder.create();
		converter.setGson(gson);
		return converter;
	}
}
