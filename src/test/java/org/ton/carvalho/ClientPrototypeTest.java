package org.ton.carvalho;

import org.junit.Test;

/**
 * Created by ton on 30/05/15.
 */
public class ClientPrototypeTest {

    @Test
    public void testar() {
        FiestaPrototype prototipoPalio = new FiestaPrototype();
        CarroPrototype palioNovo = prototipoPalio.clonar();
        palioNovo.setValorDeCompra(27900.0);
        CarroPrototype palioUsado = prototipoPalio.clonar();
        palioUsado.setValorDeCompra(21000.0);

        System.out.println(palioNovo.exibirInfo());
        System.out.println(palioUsado.exibirInfo());

    }
}
