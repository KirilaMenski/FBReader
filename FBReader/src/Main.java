
import java.util.List;
import java.util.Map;

import by.ansgar.fbreader.loadvalues.Description;
import by.ansgar.fbreader.loadvalues.DescriptionImpl;
import by.ansgar.fbreader.loadvalues.Text;
import by.ansgar.fbreader.loadvalues.TextImpl;

public class Main {

	public static void main(String[] args) {
		String path = "res/ilion.fb2";
		Description op = new DescriptionImpl(path);
		Text t = new TextImpl(path);
		System.out.println("Title: " + op.getTitle());
		System.out.println("Genre: " + op.getGenre());
		System.out.println("Author: " + op.getAuthor());
		System.out.println("Series: " + op.getSeries());
		System.out.println("Number of series: " + op.getNumOfSer());
		System.out.println("Cover book: " + op.getCover());
		System.out.println("Lang: " + op.getLang());
		
		List<String> anotation = op.getAnotation();
		for(int i = 0; i < anotation.size(); i++){
			System.out.print(anotation.get(i));
		}
		
		List<String> text = t.getText();
		System.out.println("\n*******************************1");
		for(int i = 0; i < text.size(); i++){
			System.out.print(text.get(i));
		}

	}

}
