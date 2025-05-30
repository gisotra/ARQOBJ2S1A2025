package aulas.aula8classe_espacial.especial.enumerador;

public class ExemploB {
    public static void main(String[] args) {
        
        System.out.println( Cor.VERMELHO );
        
        System.out.println( Cor.values()[ 0 ] );
        
        for( Cor c : Cor.values() ) {
            System.out.println( c );
        }
        
        System.out.println("---");
        
        FormaGeometricaB quadrado = 
                new FormaGeometricaB( 
                    Cor.PRETO,
                    Cor.VERMELHO );
        
        System.out.println( quadrado.getCorBorda() );
        
        System.out.println( quadrado.getCorBorda().name() );
        System.out.println( quadrado.getCorBorda().ordinal() );
        
    }
}
