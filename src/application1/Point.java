/**
 * 
 */
package application1;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * @author lenovo
 *
 */
public class Point {
	private char nom;
	private double abscisse;
	private double ordonnee;
	private static int nbrPoint ;
	
	public char getnom(){
		return nom;
	}
	public void setnom(char nom){
		this.nom=nom;
	}
	public void setabscisse(double abscisse){
		this.abscisse=abscisse;
	}
	public double getabscisse(){
		return abscisse;
	}
	public void setordonnee(double ordonnee){
		this.ordonnee=ordonnee;
	}
	public double getordonnee(){
		return ordonnee;
	}
	public void  getnbrPoint(){
		System.out.println(nbrPoint);
	}
	
	public Point(char nom,double abscisse,double ordonnee ){
		this.nom=nom;
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
		nbrPoint++;
	}
	
	public void affiche(){
		System.out.println("le point "+nom+" a pour abscisse "+abscisse+" et pour ordonnee "+ordonnee);
		
	}
	//constructeur par defaut
	public Point(){
		this('O',0,0);
	}
	
	public void translate(double b){
		this.abscisse+=b;
	}
	public void translate(double a,double c){
		this.abscisse+=a;
		this.ordonnee+=c;
	}
	public void calculerDistance(Point x1,Point x2)
	{
		System.out.println("la distance entre les points "+x1.nom+" et "+x2.nom+" est "+sqrt(pow(x2.abscisse-x1.abscisse,2)+pow(x2.ordonnee-x1.ordonnee,2)));
		
	}
	
}
