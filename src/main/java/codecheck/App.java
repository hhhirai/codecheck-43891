package codecheck;



public class App {
	public static void main(String[] args) {

        int in_size = args.length-1;
        int m = Integer.parseInt(args[in_size]);
        String out_str = "";

		for (int i = 0, l = in_size; i < l; i++) {

			String[] data = args[i].split(":");
			int in_num = Integer.parseInt(data[0]);
			String in_str = data[1];

			if(m % in_num == 0){
				out_str += in_str;
			}
		}

		if(out_str != ""){
			System.out.println(m);
		}else{
	        System.out.println(out_str);
		}
	}
}
