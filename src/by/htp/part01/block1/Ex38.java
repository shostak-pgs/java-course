package by.htp.part01.block1;

/*
 *  Для  данных  областей  составить  линейную  программу,  которая  печатает  true,
 *  если  точка  с  координатами  (х,  у) принадлежит закрашенной области, и
 *   false — в противном случае;
 */
public class Ex38 {
	public static void main(String[] args) {
	int ax = 3;
	int ay = 1;
	String code = "b";
	boolean answer;
	
	    switch (code) {
		    case("a"):
	            answer = (ay == 4 - Math.abs(ax) && ax <=4);
		        System.out.println(answer);
		        break;
		    case("b"):
			    answer = (ay <= 4 && Math.abs(ax) <= 2 && ay >=0 ) || (ay >= -4 && Math.abs(ax) <= 4 && ay <= 0 );
	            System.out.println(answer);
	            break;
		    case("с"):
			    answer = ((((ay * ay) + (ax * ax)) == 4 *4) && ax <= 4 && ax >=0 && ay <= 4 && ay >=0) || ((((ay * ay) + (ax * ax)) == 5 *5) && ax <= 5 && ax >=0 && ay <= 5 && ay <=0);
	           System.out.println(answer);
	            break;
	    }
	
	}
}
