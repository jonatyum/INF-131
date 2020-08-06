import java.util.Scanner;


public class ColaSimple {
	public int max,ini,fin,v[];
	public ColaSimple() {
		max=50;
		v=new int[max];
		ini=fin=0;
	}
	public boolean esvacia(){
		if(ini==0 && fin==0)return true;
		return false;
	}
	public boolean esllena(){
		if(fin==max-1)return true;
		return false;
	}
	public int nroelem(){
		return fin-ini;
	}
	public void adicionar(int elem){
		if(!esllena()){
			fin++;
			v[fin]=elem;
		}
		else System.out.println("Cola Simple llena");
	}
	public int eliminar(){
		int z=0;
		if(!esvacia()){
			ini++;
			z=v[ini];
			if(ini==fin)fin=ini=0;
		}
		else System.out.println("Cola Simple vacia");
		return z;
	}
	/*
	public void mostrar(){
		int n=nroelem();
		int z;
		for (int i = 0; i < nroelem(); i++) {
			z=eliminar();
			adicionar(z);
			System.out.print(" "+z);
		}
		System.out.println();
	}
	*/
	public void mostrar(){
		int elem;
		if(!esvacia()){
			ColaSimple aux=new ColaSimple();
			while(!esvacia()){
				elem=eliminar();
				aux.adicionar(elem);
				System.out.print(" "+elem);
			}
			System.out.println();
			vaciar(aux);
		}
		else System.out.println("Cola Simple vacia");
	}
	public void llenar(int n){
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			adicionar(sc.nextInt());
		}
	}
	public void vaciar(ColaSimple z){
		while(!z.esvacia()){
			adicionar(z.eliminar());
		}
	}
}
