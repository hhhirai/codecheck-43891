package codecheck;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class App {
	public static void main(String[] args) {

        Map<Integer,String> in_map = new HashMap<Integer,String>();
        int in_size = args.length-1;
        int m = Integer.parseInt(args[in_size]);

		for (int i = 0, l = in_size; i < l; i++) {

			String[] data = args[i].split(":");
			int key = Integer.parseInt(data[0]);

			in_map.put(key, data[1]);
		}

		Object[] mapkey = in_map.keySet().toArray();
        Arrays.sort(mapkey);

        System.out.println(in_map);

	}

}
