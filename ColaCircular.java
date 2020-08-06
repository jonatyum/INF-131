import java.util.Scanner;


public class ColaCircular {
	public int max,ini,fin;
	public Fraccion v[];
	public ColaCircular() {
		max=50;
		ini=fin=0;
		v=new Fraccion[max];
	}
	public boolean esvacia(){
		return nroelem()==0?true:false;
	}
	public boolean esllena(){
		return nroelem()==max-1?true:false;
	}
	public int nroelem(){
		return (max+fin-ini)%max;
	}
	public void adicionar(Fraccion a){
		if(!esllena()){
			fin=(fin+1)%max;
			v[fin]=a;
		}
		else System.out.println("Cola Circular llena");
	}
	public Fraccion eliminar(){
		Fraccion a=new Fraccion();
		if(!esvacia()){
			ini=(ini+1)%max;
			a=v[ini];
			if(nroelem()==0)ini=fin=0;
		}
		else System.out.println("Cola Circular vacia");
		return a;
	}
	public void mostrar(){
		Fraccion a=new Fraccion();
		if(!esvacia()){
			ColaCircular aux=new ColaCircular();
			while(!esvacia()){
				a=eliminar();
				a.mostrar();
				aux.adicionar(a);
			}
		}
		else System.out.println("Cola Circular vacia");
	}
	public void llenar(int n){
		for (int i = 0; i < n; i++) {
			Fraccion a=new Fraccion();
			a.leer();
			adicionar(a);
		}
	}
	public void vaciar(ColaCircular z){
		while(!z.esvacia()){
			adicionar(z.eliminar());
		}
	}
}
