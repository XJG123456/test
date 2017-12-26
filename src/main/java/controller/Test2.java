package controller;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<Integer, String> sMap=new HashMap<>();
		long star=System.currentTimeMillis();
		for(int i=0;i<500;i++){
		sMap.put(1, "o");
		sMap.put(2, "p");
		sMap.put(3, "w");
		}
		for(Map.Entry<Integer, String> entry:sMap.entrySet()){
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
		}
		System.out.println(System.currentTimeMillis()-star);
	}
}
