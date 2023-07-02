package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }
}