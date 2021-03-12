package api.lang.sys;

public class sysex {
	public static void main(String[] args) {
		
		long start = (System.currentTimeMillis());
		long sum =0;
		for(long i=1;i<99999L; i++)
		{
			sum +=i;
		}
		long end  = System.currentTimeMillis();
		
		System.out.println((end - start)*0.001);
	}

}
