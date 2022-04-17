package javaprograms.designpattern.behavioural.memento;
/*Taken from journaldev site*/
public class FileWriterClient {

	public static void main(String[] args) {
		FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

		FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");

		fileWriterUtil.write("First set of data\n");

		System.out.println(fileWriterUtil + "\n\n");

		fileWriterCaretaker.save(fileWriterUtil);

		fileWriterUtil.write("Second set of data\n");

		System.out.println(fileWriterUtil + "\n\n");

		fileWriterCaretaker.undo(fileWriterUtil);

		System.out.println(fileWriterUtil + "\n\n");
	}
}
