package Carros;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Civic(); // Criando um objeto do tipo Civic (supondo que Civic é uma classe que herda de Carro)
        
        
        c.acelerar(); 
        System.out.println("Civic"+ c);
        c.acelerar(); 
        System.out.println("Civic"+ c);
        c.acelerar(); 
        System.out.println("Civic"+ c);
        c.acelerar(); 
        System.out.println("Civic"+ c);
        c.acelerar(); 
        System.out.println("Civic"+ c);
        c.acelerar(); // Chamando o método acelerar
        System.out.println("Civic"+ c);
        c.acelerar(); 
        c.frear();
        System.out.println("Civic"+ c);
        c.frear();
        System.out.println("Civic"+ c);
        c.frear();
        
        
        Ferrari c2 = new Ferrari();
        c2.LigarTurbo();
        c2.acelerar();
        System.out.println( " \n Ferrari" + c2);
        c2.acelerar();
        c2.desligarTurbo();
        System.out.println( "Ferrari" + c2);
        c2.acelerar();
        System.out.println( "Ferrari" + c2);
        c2.acelerar();
        System.out.println( "Ferrari" + c2);
        c2.acelerar();
        System.out.println( "Ferrari" + c2);
        c2.LigarTurbo();
        c2.acelerar();
        System.out.println( "Ferrari" + c2);
        c2.acelerar();
        System.out.println( "Ferrari" + c2);
        c2.acelerar();
        System.out.println( "Ferrari" + c2);
        c2.DesligarTurbo();
        c.frear();
        System.out.println( "Ferrari" + c2);
        c.frear();
        System.out.println( "Ferrari" + c2);
        c.frear();
        System.out.println( "Ferrari" + c2);
    }
}
