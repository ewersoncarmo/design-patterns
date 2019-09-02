package flyweight;

import java.util.HashMap;
import java.util.Map;

import flyweight.nota.Nota;
import flyweight.nota.impl.Do;
import flyweight.nota.impl.Fa;
import flyweight.nota.impl.La;
import flyweight.nota.impl.Mi;
import flyweight.nota.impl.Re;
import flyweight.nota.impl.Si;
import flyweight.nota.impl.Sol;

public class NotasMusicais {

	private Map<String, Nota> notas = new HashMap<>();
	
	public NotasMusicais() {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}
	
	public Nota pega(String nota) {
		return notas.get(nota);
	}
}
