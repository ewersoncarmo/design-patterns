package flyweight;

import java.util.Arrays;
import java.util.List;

import flyweight.note.Note;

public class Client {

	public static void main(String[] args) {
		MusicalNote notas = new MusicalNote();
		
		List<Note> musica = Arrays.asList(
				notas.pega("do"),
				notas.pega("re"),
				notas.pega("mi"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("fa"),
				notas.pega("si"));
		
		System.out.println(musica);
	}

}
