
public class User {
	/**
	 * 用户名
	 */
	private String name;

	/**  
	 * 获取用户名  
	 * @return name 用户名  
	 */
	public String getName() {
		return name;
	}

	/**  
	 * 设置用户名  
	 * @param name 用户名  
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{\"name\":\"" + name + "\"}";
	}
	
}
