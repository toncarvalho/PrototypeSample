package org.ton.carvalho;


public abstract class CarroPrototype {

    protected Double valorDeCompra;

    public abstract String exibirInfo();

    public abstract CarroPrototype clonar();

    public Double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(Double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }
}
