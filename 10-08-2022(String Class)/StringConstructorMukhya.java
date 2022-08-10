class StringConstructorMukhya{
	
	public static void main(String[] agrs){
		
		String str = new String();
		System.out.println(str);
		
		byte[] bt = {12,76,97,67};
		String str1 = new String(bt);
		System.out.println(str1);
		
		/*byte[] bt1 = {55,78,87};
		String str2 = new String(bt1,'}');*/
		
		byte[] bt2 = {67,87,37,76};
		String str3 = new String(bt2,1,2);
		System.out.println(str3);
		
		/*byte[] bt3 ={45,87,35,87};
		String str4 = new String(bt3,3,4,"XYZ");
		System.out.println(str4);
		
		byte[] bt4 ={45,87,35,87};
		String str5 = new String(bt4,"ABC");
		System.out.println(str5);*/
		
		char[] value = {'a','y','t','s'};
		String str6 = new String(value);
		System.out.println(str6);
		
		char[] val = {'a','y','t','s'};
		String str7 = new String(val,0,1);
		System.out.println(str7);
		
		int[] cp = {132,675,865,976};
		String str8 = new String(cp,1,2);
		System.out.println(str8);
	
		String str9 = new String("deepti");
		System.out.println(str9);
		
		StringBuffer sb = new StringBuffer("deepti");
		String str10 = new String(sb);
		System.out.println(str10);

		StringBuilder builder = new StringBuilder("XYZ");
		String str11 = new String(builder);
		System.out.println(str11);

	}
	
}