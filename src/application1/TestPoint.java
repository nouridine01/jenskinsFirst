/**
 * 
 */
package application1;


/**
 * @author lenovo
 *
 */
public class TestPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Point p1 = new Point('a',5,8);
		Point p2 = new Point('b',7,9);
		p1.affiche();
		p2.affiche();
		p1.translate(4,5);
		p2.translate(8,9);
		p1.affiche();
		p2.affiche();
		p1.calculerDistance(p1,p2);
		p1.getnbrPoint();
	}

}
