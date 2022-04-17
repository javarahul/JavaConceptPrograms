package javaprograms.designpattern.behavioural.memento;

public class FileWriterCaretaker {
	private Object object;
	
	public void save(FileWriterUtil fileWriterUtil) {
		object = fileWriterUtil.save();
	}
	
	public void undo(FileWriterUtil fileWriterUtil) {
		fileWriterUtil.undoToLastSave(object);
	}
}
