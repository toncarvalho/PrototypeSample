package org.ton.carvalho;


public class FiestaPrototype extends CarroPrototype {


    public FiestaPrototype(FiestaPrototype prototype) {
        this.valorDeCompra = prototype.getValorDeCompra();
    }

    public FiestaPrototype() {
        this.valorDeCompra = 0d;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$"
                + getValorDeCompra();
    }

    @Override
    public CarroPrototype clonar() {
        return new FiestaPrototype(this);
    }
}
