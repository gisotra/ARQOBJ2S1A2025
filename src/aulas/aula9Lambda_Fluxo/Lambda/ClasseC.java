package aulas.aula9Lambda_Fluxo.Lambda;


public class ClasseC {
    public void metodo(InterfaceFuncionalC itf) { //esperando um objeto que implementa a interface funcional
        itf.metodoC();
        System.out.println("Classe C");
    }
}
