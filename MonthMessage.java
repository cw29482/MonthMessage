import javax.swing.JOptionPane;
public class MonthMessage {
	enum Months {January, February, March, April, May, June, July, August, September, October,
			November, December}
	public static void main(String [] args) {

	Months [] choices = {Months.January, Months.February, Months.March, Months.April, Months.May, 
		Months.June, Months.July, Months.August, Months.September, Months.October,
		Months.November, Months.December};
		Months Input = (Months) JOptionPane.showInputDialog(null, "Select a month.",
		"Month Selection", JOptionPane.QUESTION_MESSAGE, null, choices, choices[3]);

		switch (Input) {
		case January:
			JOptionPane.showMessageDialog(null, " Do you want to build a snow man?");
			break;
		case February:
			JOptionPane.showMessageDialog(null, " Do you want to build a snow man?");
			break;
		case March:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
			break;
		case April:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
			break;
		case May:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
			break;
		case June:
			JOptionPane.showMessageDialog(null, "It's a summer time.");
			break;
		case July:
			JOptionPane.showMessageDialog(null, "It����s a summer time.");
			break;
		case August:
			JOptionPane.showMessageDialog(null, "It's a summer time.");
			break;
		case September:
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
			break;
		case October:
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
			break;
		case November:
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
			break;
		case December:
			JOptionPane.showMessageDialog(null, " Do you want to build a snow man?");
			break;
		}
						
								

	}
	}


