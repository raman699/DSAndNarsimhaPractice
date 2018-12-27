package com.hello.hit;

import java.util.ArrayList;

public class test {
	static ArrayList results = new ArrayList();
	static int current;
	static int pageSize, page, oldResultSize;;

	public static void main(String... s) {

		//test();
		long l= 1<<31;
		System.out.println(l);

	}

	static Object test() {
//1000,450,900,560,989,1000,999
		//0,0,
		//1000,999
		
		if (results == null || current >= pageSize || current >= results.size())

		{
			
			
			if(results!=null)
				oldResultSize  = results.size();
			results = getNextPageForReporting();

			page++;

			if (current >= pageSize || current >= oldResultSize)

			{
				current = 0;
			}
			if (!results.isEmpty() || (current == 0 && page == 0))

			{
				String[] messageParams = { Integer.toString(results.size()) };
			}

		}

		int next = current++;

		if (next < results.size())

		{
			return results.get(next);
		}

		else

		{

			return null;

		}
	}

	static ArrayList getNextPageForReporting() {
		return null;
	}
}