package br.com.digitalhouse;

public abstract class Animal {
    private String tamanho;
    private String raca;

    //construtor específico
    public Animal(){

    }

    //construtor específico
    public Animal(String novoTamanho, String novaRaca){
        tamanho = novoTamanho;
        raca = novaRaca;
    }



    //Set - Modificador
    public void setTamanho(String novoTamanho){
        tamanho = novoTamanho;
    }

    //Get - Acessor
    public  String getTamanho(){
        return tamanho;
    }

    //Set - Modificador
    public void setRaca(String novaRaca){
        raca = novaRaca;
    }

    //Get - Acessor
    public String getRaca(){
        return raca;
    }

    public abstract boolean ehMamifero();
}
