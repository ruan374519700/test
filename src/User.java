
public class User {
	/**
	 * �û���
	 */
	private String name;

	/**  
	 * ��ȡ�û���  
	 * @return name �û���  
	 */
	public String getName() {
		return name;
	}

	/**  
	 * �����û���  
	 * @param name �û���  
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
