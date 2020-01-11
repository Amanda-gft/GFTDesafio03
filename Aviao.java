
public class Aviao extends Veiculo{
//	• Acelerar(): Antes de acelerar, verificar se o carro está ligado, se estiver ligado acelera(20 km/h) e consome 1 L de gasolina, 
//	se estiver desligado informa o usuário que não é possível acelerar com o carro desligado;
	public void Acelerar()
	{
		if(getIsLigado() == true)
		{
			setVelocidade(getVelocidade() + 20);
			setLitrosCombustivel(getLitrosCombustivel() - 1);
		}
		else
		{
			System.out.println("Não é possível acelerar com o carro desligado");
		}
	}
	
//	• Abastecer(int qtdLitros): abastece o atributo litrosCombustivel do objeto, fazer verificações para o atributo litrosCombustivel 
//	não exceder 100L;
	public void Abastecer(String qtdLitros)
	{
		
		if(getLitrosCombustivel() + Integer.parseInt(qtdLitros) <= 3000)
		{
			setLitrosCombustivel(getLitrosCombustivel() + Integer.parseInt(qtdLitros));
		}
	}
}
