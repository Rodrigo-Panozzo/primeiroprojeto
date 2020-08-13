
package carro;


public abstract class Carro {
    protected String cor;
    protected String modelo;
    protected String marca;
    protected String ano;
    protected String acelera;

    
    public void acelerar(int acelera){
        this.acelera +=acelera;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getAno() {
        return ano;
    }

    public String getAcelera() {
        return acelera;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setAcelera(String acelera) {
        this.acelera = acelera;
    }
    
}