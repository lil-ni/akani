package pac;

public class Text231 {
public static void main(String[] args) throws InterruptedException {
	int arr[][]={
		{6,6},
		{600,900},
		{777,888},
		{6,0},
	};
	while (true) {
		Thread.sleep(1000);
		System.out.println("一秒已经过去了！");
		int rdm=(int)(Math.random()*10%4);
		System.out.println(arr[rdm][0]+","+arr[rdm][1]);
	}
}
}
