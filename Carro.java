package Carros;

public class Carro {
   protected  final int VELOCIDADE_MAXIMA;
   protected   boolean estaParado;
   protected double acelerar = 5;
   protected   double frear = 5;
   protected int velocidade = 0;
   

    // Construtor que inicializa a velocidade máxima
     protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
        estaParado = true;
	
    }

    // Construtor padrão com uma velocidade máxima fixa
     Carro() {
        VELOCIDADE_MAXIMA = 120; // Definir um valor padrão para a velocidade máxima
        estaParado = true;
    }

    // Método para acelerar
     public  void acelerar() {
        if (estaParado) {
            estaParado = false;
            velocidade+=5;
            acelerar+=5;
            
        }

        velocidade += acelerar;

        // Verifica se a velocidade ultrapassa a velocidade máxima
        if (velocidade > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        }
    }

    // Método para frear
   public  void frear() {
        if (velocidade > frear) {
            velocidade -= frear;
        } else {
            velocidade = 0; // Garante que a velocidade não fique negativa
            estaParado = true;
        }
    }

    // Método para verificar se o carro está parado
    public boolean estaParado() {
        return estaParado;
    }

    // Método para obter a velocidade atual
    public int getVelocidade() {
        return velocidade;
    }

    // Método para mostrar o estado do carro
    @Override
    public String toString() {
        return "Velocidade atual: " + velocidade + " KM/h";
    }
    
    public void ligarTurbo() {
    	
    }
    
    public void desligatTurbo() {
    	
    }

	public void desligarAr() {
		// TODO Auto-generated method stub
		
	}

	public void ligarAr() {
		// TODO Auto-generated method stub
		
	}

	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}
}