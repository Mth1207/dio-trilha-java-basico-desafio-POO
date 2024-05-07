package componentes.celular;

import componentes.audio.ReprodutorSom;
import componentes.ligacao.Ligacao;
import componentes.navegador.Internet;

public class Iphone implements ReprodutorSom, Ligacao, Internet {

    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA PELO IPHONE.");
    }

    public void acessarNavegador() {
        System.out.println("ACESSANDO NAVEGADOR PELO IPHONE.");
    }

    public void fazerLigacao() {
        System.out.println("FAZENDO LIGAÇÃO PELO IPHONE.");
    }
}
