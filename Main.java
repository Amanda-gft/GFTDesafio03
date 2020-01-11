public class Main
{
	public static void main (String[] args)
	{
		
		Veiculo v02 = new Veiculo();
		Carro c02 = new Carro();
		Aviao a02 = new Aviao();
		Caminhao cc02 = new Caminhao();
		
		v02.setLitrosCombustivel(30);
		c02.setLitrosCombustivel(50);
		a02.setLitrosCombustivel(1000);
		cc02.setLitrosCombustivel(500);
		
		v02.Abastecer(15);
		c02.Abastecer(50);
		a02.Abastecer("1200");
		cc02.Abastecer(700f);
		
		System.out.println(v02.getLitrosCombustivel());
		System.out.println(c02.getLitrosCombustivel());
		System.out.println(a02.getLitrosCombustivel());
		System.out.println(cc02.getLitrosCombustivel());
		
	}
	
}