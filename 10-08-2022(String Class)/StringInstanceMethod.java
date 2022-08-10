class StringInstanceMethod{
	
	public static void main(String[] args){
		
		String str = new String();
		String s = str.concat("deepti");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("deepti");
		boolean b = str.contentEquals(sb);
		System.out.println(b);
		
		boolean b1 = str.endsWith("MR");
		System.out.println(b1);
		
		byte[] by = str.getBytes();
		System.out.println(by);
		
		int i = str.hashCode();
		System.out.println(i);

		int var = str.indexOf(101);
		System.out.println(var);
		
		int val = str.indexOf(394,34);
		System.out.println(val);
		
		int arg = str.indexOf("deepti",2);
		System.out.println(arg);
		
		String st = str.intern();
		System.out.println(st);
		
		boolean bl = str.isEmpty();
		System.out.println(bl);
		
		int as = str.lastIndexOf(2453);
		System.out.println(as);

		int cv = str.length();
		System.out.println(cv);

		boolean bv = str.matches("deepti");
		System.out.println(bv);
		
		boolean nb = str.regionMatches(true,2,"gasdgfsa",3,4);
		System.out.println(nb);
		
		String strr = str.replace('w','z');
		System.out.println(strr);

		

	}
}