package flyweight;

import java.util.HashMap;
import java.util.Map;

import flyweight.note.Note;
import flyweight.note.impl.Do;
import flyweight.note.impl.Fa;
import flyweight.note.impl.La;
import flyweight.note.impl.Mi;
import flyweight.note.impl.Re;
import flyweight.note.impl.Si;
import flyweight.note.impl.Sol;

public class MusicalNote {

	private Map<String, Note> notes = new HashMap<>();
	
	public MusicalNote() {
		notes.put("do", new Do());
		notes.put("re", new Re());
		notes.put("mi", new Mi());
		notes.put("fa", new Fa());
		notes.put("sol", new Sol());
		notes.put("la", new La());
		notes.put("si", new Si());
	}
	
	public Note pega(String note) {
		return notes.get(note);
	}
}
