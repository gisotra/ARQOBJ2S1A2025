package aulas.aula8classe_espacial.especial.enumerador;

public class ExemploA {
    public static void main(String[] args) {
        
        System.out.println( FormaGeometricaA.Cor.VERMELHO );
        
        System.out.println( FormaGeometricaA.Cor.values()[ 0 ] );
        
        for( FormaGeometricaA.Cor c : FormaGeometricaA.Cor.values() ) {
            System.out.println( c );
        }
        
        System.out.println("---");
        
        FormaGeometricaA quadrado = 
                new FormaGeometricaA( 
                    FormaGeometricaA.Cor.PRETO,
                    FormaGeometricaA.Cor.VERMELHO );
        
        System.out.println( quadrado.getCorBorda() );
        
        System.out.println( quadrado.getCorBorda().name() );
        System.out.println( quadrado.getCorBorda().ordinal() );
        
    }
}


