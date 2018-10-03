package templateMethod;
public class Cha extends Bebida {

	@Override
	void preparar() {
		System.out.println("Misturando cha na agua");
	}

	@Override
	void adicionarCondimentos() {
		System.out.println("Adicionando limao");
	}
	
}
