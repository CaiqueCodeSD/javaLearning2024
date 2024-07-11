/*import videos.Anime;
import videos.Documentario;
import videos.Filme;
import videos.Serie;*/

/*Utilizando o método acima leva mais tempo, com o import + ".*" já seleciona 
todas as classes*/


import videos.*;   
import gui.*;
import gui.botoes.*;


public class App {

	public static void main(String[] args) {

		Anime anime = new Anime();
		Documentario documentario = new Documentario();
		Filme filme = new Filme();
		Serie serie = new Serie();
		
		Janela janela = new Janela();
		MiniaturaVideo miniaturaVideo = new MiniaturaVideo();
		
		BotaoPause botaoPause = new BotaoPause();

	}
	
}
