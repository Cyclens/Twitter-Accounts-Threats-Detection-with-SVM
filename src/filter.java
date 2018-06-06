import java.util.ArrayList;
import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class filter {
	private static String[] keywords = {"tourism", "conference", "business trip", "sightseeing", "happy", "great day"
			+ "trip", "visiting", "visit", "tour", "touring", "flight", "journey", "great time", "exited", "show", "concert"
			+ "game"};
	
	public static void textfilter(String[] args) {
		ArrayList<BadTwitter> list2 = new ArrayList<BadTwitter>();
		ArrayList<GoodTwitter> list3 = new ArrayList<GoodTwitter>();
		File output = new File("Output.txt");
		
		for (Twitter twitter : list) {
			String twittercontent = twitter.getText();
			int twitterlabel = twitter.getLable();
			if (twitterlable == 1) {
				list2.add(twitter);
			}
			else {
				list3.add(twitter);
			}
		}
		for (BadTwitter badbad : list2) {
			String badcontent = badbad.getText();
			for(String keyword : keywords){
				if (badcontent.contains(keyword)) {
					badbad.setLabel(0);
				}
				break;
			}
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		for(int i = 0; i < list2.size(); i++) {
			bw.write(list2.get(i).toString());
			bw.newLine();
		}
		for(int j = 0; j < list3.size(); j++) {
			bw.write(list3.get(j).toString());
			bw.newLine();
		}
		bw.close();
	}
	
}