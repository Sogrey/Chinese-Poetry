package top.sogrey.springbootservice.model.response;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准响应
 * @author Sogrey
 *
 * @param <T>
 */
public class StandardResult<T> extends BaseResult {

	private List<T> datas = new ArrayList<T>();

	public StandardResult(int code, String message) {
		super(code, message);
	}

	public List<T> getDatas() {
		return datas;
	}

	public StandardResult<T> setDatas(List<T> datas) {
		this.datas = datas;
		return this;
	}
	
	public StandardResult<T> addDatas(List<T> datas) {
		this.datas.addAll(datas);
		return this;
	}
	
	public StandardResult<T> setData(T data) {
		this.datas.clear();
		this.datas.add(data);
		return this;
	}
	
	public StandardResult<T> addData(T data) {
		this.datas.add(data);
		return this;
	}

	@Override
	public String toString() {
		return "StandardResult [datas=" + datas + "]";
	}

}
