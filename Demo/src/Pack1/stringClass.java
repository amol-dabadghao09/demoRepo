package Pack1;
import java.lang.*;

public class stringClass {
	
	public static void main(String[] args) {
		
		String a = "Java-18";
		String b = "Java-18";
		String c = new String("Java-18");
		String d = new String("Java-18");
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		b = "version";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		b = "Java-18";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println("===================");
		
		
		boolean r = a.equals(c);
		System.out.println(r);
		
		r = a.equals(d);
		r = c.equals(b);
		System.out.println(r);
		
		String q = a.toUpperCase();
		System.out.println(q);
		
		String t = a.toLowerCase();
		System.out.println(t);
		
		
		char w = a.charAt(2);
		System.out.println(w);
		
		int size = a.length();
		System.out.println(size);
		
		String s = a.concat(" Class");
		System.out.println(s);
		
		String x = a+ " version";
		System.out.println(x);
		
		String v = a.replace('a','M');
		System.out.println(v);
		
		int index = c.indexOf('v');		
		System.out.println(index);
		
		int index1 = c.lastIndexOf('a');		
		System.out.println(index1);
		
		System.out.println("====================");
		
		char [] y = c.toCharArray();
		for (int i=0; i<y.length; i++)
		{
			System.out.println(y[i] + ",");
		}
		
		String u = c.substring(2);
		System.out.println(u);
		
		String o = c.substring(1,6);
		System.out.println(o);
		
		String g = "Java#support#primitive#dataType";
		
		String [] n = g.split("#");
		
		for (int j=0; j<n.length; j++)
		{
		System.out.println(n[j]);
		}
		
		System.out.println("====================");
		
		StringBuffer str = new StringBuffer("Hello");
		str.append(" World");
		System.out.println(str);
		
		StringBuilder stt = new StringBuilder("Hello");
		stt.append("--World");
		System.out.println(stt);
		
		
		
	}

}
