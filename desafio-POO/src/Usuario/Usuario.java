package Usuario;

import componentes.audio.Ipod;
import componentes.audio.ReprodutorSom;
import componentes.celular.Iphone;
import componentes.ligacao.Ligacao;
import componentes.ligacao.Telefone;
import componentes.navegador.Internet;
import componentes.navegador.Navegador;

class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // REPRODUZINDO MUSICA DIRETO DO IPOD, SEM SER PELO IPHONE.
        Ipod ip = new Ipod();
        ReprodutorSom rp = ip;
        rp.tocarMusica();

        // FAZENDO LIGAÇÃO SEM SER PELO IPHONE.
        Telefone tel = new Telefone();
        Ligacao lig = tel;
        lig.fazerLigacao();

        // ACESSANDO NAVEGADOR SEM SER PELO IPHONE.
        Navegador nav = new Navegador();
        Internet internet = nav;
        internet.acessarNavegador();

        // ACESSANDO NAVEGADOR PELO IPHONE.
        iphone.acessarNavegador();

        // FAZENDO LIGAÇÃO PELO IPHONE.
        iphone.fazerLigacao();

        // REPRODUZINDO MÚSICA PELO IPHONE.
        iphone.tocarMusica();
    }
}