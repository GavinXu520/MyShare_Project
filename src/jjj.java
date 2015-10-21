
public class jjj {
	
	private Integer no;
	private int age;
	private String name;
	

	public jjj() {
		super();
	}


	public jjj(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public Integer getNo() {
		return no;
	}


	public void setNo(Integer no) {
		this.no = no;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		jjj j1 =new jjj(1,"xing");
		jjj j2 =new jjj(1,"xing");
		System.out.println(j1==j2);
		System.out.println(j1.equals(j2));
		
		jjj j3 =new jjj();
		System.out.println(j3.getAge()+"  "+j3.getNo());
		
		
	}

}
