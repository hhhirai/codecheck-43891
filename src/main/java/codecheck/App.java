package codecheck;

import java.util.HashMap;
import java.util.Map;


public class App {
	public static void main(String[] args) {

        Map<String,String> in_map = new HashMap<String,String>();
        int in_size = args.length-1;
        String last = args[in_size];

		for (int i = 0, l = in_size-1; i < l; i++) {

			String[] data = args[i].split(":");
			in_map.put(data[0], data[1]);
		}
        System.out.println(in_map + ":" + String.valueOf(last));

	}

}
