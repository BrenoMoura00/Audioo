package minhasmusicas.principal;

import minhasmusicas.modelos.MinhasPreferidas;
import minhasmusicas.modelos.Musica;
import minhasmusicas.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Flowers");
        minhaMusica.setCantor("Miley Cyrus");
        minhaMusica.setGenero("Pop");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("DevCast");
        meuPodCast.setApresentador("Breno Moura");
        meuPodCast.setDescricao("Episódio 01");

        for (int i = 0; i < 5640; i++) {
            meuPodCast.reproduz();
        }

        for (int i = 0; i < 2453; i++) {
            meuPodCast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhaMusica);
    }
}
