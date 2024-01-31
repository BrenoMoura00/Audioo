package minhasmusicas.modelos;

public class MinhasPreferidas {
    public  void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "É considerado um grande sucesso!");
        }else {
            System.out.println(audio.getTitulo() + "Você pode gostar também!");
        }
    }
}
