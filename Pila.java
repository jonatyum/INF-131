import java.util.Scanner;


public class Pila {
	public int max,tope,v[];
	public Pila() {
		max=50;
		tope=0;
		v=new int[max];
	}
	public boolean esvacia(){
		if(tope==0)return true;
		return false;
	}
	public boolean esllena(){
		if(tope==max-1)return true;
		return false;
	}
	public int nroelem(){
		return tope;
	}
	public void adicionar(int x){
		if(!esllena()){
			tope++;
			v[tope]=x;
		}
		else System.out.println("Pila llena");
	}
	public int eliminar(){
		int r=0;
		if(!esvacia()){
			r=v[tope];
			tope--;
		}
		else System.out.println("Pila vacia");
		return r;
	}
	public void mostrar(){
		if(!esvacia()){
			Pila z=new Pila();
			int x=0;
			while(!esvacia()){
				x=eliminar();
				z.adicionar(x);
				System.out.println(x);
			}
			while(!z.esvacia())adicionar(z.eliminar());
		}
		else System.out.println("pila vacia");
	}
	public void llenar(int n){
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < n; i++)adicionar(sc.nextInt());
	}
	public void vaciar(Pila z){
		while(!z.esvacia())adicionar(z.eliminar());
	}
	//************************************************************************************************************************
	public void interc(Pila a, Pila b){
		while(!a.esvacia() && !b.esvacia()){
			adicionar(a.eliminar());
			adicionar(b.eliminar());
		}
		if(!a.esvacia())
			while(!a.esvacia())adicionar(a.eliminar());
		if(!b.esvacia())
			while(!b.esvacia())adicionar(b.eliminar());
		mostrar();
	}
}
