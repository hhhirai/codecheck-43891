package codecheck;

import java.util.HashMap;
import java.util.Map;


public class App {
	public static void main(String[] args) {

        Map<String,String> in_map = new HashMap<String,String>();

		for (int i = 0, l = args.length; i < l; i++) {

			String[] data = args[i].split(":");
			in_map.put(data[0], data[1]);
		}
        System.out.println(in_map);
	}

}
