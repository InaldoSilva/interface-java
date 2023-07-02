package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
