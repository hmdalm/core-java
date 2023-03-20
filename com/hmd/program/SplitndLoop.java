package com.hmd.program;

public class SplitndLoop {
	String data1 ="there was a farmer long time ago";
	String data2 ="farmer there was ago but it went wrong";
	public void datasp() {
		int count=0;
		String [] d1 =data1.split(" ");
		String [] d2 =data2.split(" ");
for(int i=0;i<d1.length;i++) {
	for (int x=0;x<d2.length;x++) {
		if(d2[x].equals(d1[i])) {
			count=count+1;
		}
		}
}
System.out.println(count);

	}

}
