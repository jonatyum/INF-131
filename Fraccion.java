import java.util.Scanner;


public class Fraccion {
	public int num;
	public int den;
	public Scanner Sc=new Scanner(System.in);
	public Fraccion() {
		
	}
	public void leer(){
		num=Sc.nextInt();
		den=Sc.nextInt();
	}
	public void mostrar(){
		System.out.println("\n "+num+"/"+den);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}
}
