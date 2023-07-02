package equipamentos.impressora;

public interface Impressora {
    public default void imprimir() {
        System.out.println("IMPRIMINDO");
    }
}