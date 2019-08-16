package by.htp.part01.block1;

/*
 * 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
если в каждом большом бидоне на 12 л. больше, чем в малом?
 */
public class Ex06 {

	public static void main(String[] args) {
		int n = 10;
		int m = 12;

		int v = ((80 / n) + 12) * m;

		System.out.println(v);
		
	}
}
