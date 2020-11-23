package pac;

import java.util.Scanner;

public class Test1123 {
public static void main(String[] args) {
	while (true) {
		Scanner scanner=new Scanner(System.in);
		int user_num=scanner.nextInt();
		if(user_num==1) {
		System.out.println("R"+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
	}
	}
}
}
