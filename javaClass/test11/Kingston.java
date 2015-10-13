package test11;

public class Kingston implements Cache {

	//金士顿厂商，做内存产品
	//   符合内存接口标准
	
	@Override
	public void canCache() {
		System.out.println("Kingston is caching");
	}
	
}
