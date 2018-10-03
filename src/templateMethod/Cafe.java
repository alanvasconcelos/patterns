package templateMethod;
public class Cafe extends Bebida {

	@Override
	void preparar() {
		System.out.println("Misturando cafe na agua");
	}

	@Override
	void adicionarCondimentos() {
		System.out.println("Adicionando acucar e leite");
	}

}
