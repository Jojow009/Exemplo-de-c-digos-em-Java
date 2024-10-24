package Carros;

public class Ferrari extends Carro implements Esportivo, CarroLuxo {

    private boolean ligarAr;
    private boolean ligarTurbo = true;

    private int potenciaTurbo = 50; // Quantidade adicional de potência com turbo
    private int potenciaNormal = 20; // Potência normal sem turbo

    public Ferrari() {
        super(350); 
    }

    @Override
    public void ligarAr() {
        ligarAr = true; 
    }

    @Override
    public void desligarAr() {
        ligarAr = false; 
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true; 
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false; 
    }

    @Override
    public void acelerar() {
        // Define a potência dependendo se o turbo está ligado ou não
        int potenciaAtual = ligarTurbo ? potenciaTurbo : potenciaNormal;
        
        velocidade += potenciaAtual;

        if (velocidade > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        }

        if (estaParado) {
            estaParado = false;
        }
    }

    @Override
    public void frear() {
        if (velocidade > 15) {
            velocidade -= 15;
        } else {
            velocidade = 0; 
        }
    }

	@Override
	public void LigarAr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesligarAr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LigarTurbo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesligarTurbo() {
		// TODO Auto-generated method stub
		
	}
}