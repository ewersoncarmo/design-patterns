package flyweight;

import java.util.Arrays;
import java.util.List;

import flyweight.nota.Nota;

public class Programa {

	public static void main(String[] args) {
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
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
