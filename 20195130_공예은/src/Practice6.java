import javax.swing.*;
import java.awt.*;

public class Practice6 extends JFrame{
	private String [] month = {"January", "February", "March", "April", "May", "June",
								"July", "August", "September", "October", "November", "December"};
	
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", 
			"berry", "strawberry", "blackberry"};
	private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	private ImageIcon [] images = {new ImageIcon("C:\\Users\\공예은\\Desktop\\icon1.png"),
									new ImageIcon("C:\\Users\\공예은\\Desktop\\icon2.png"),
									new ImageIcon("C:\\Users\\공예은\\Desktop\\icon3.png"),
									new ImageIcon("C:\\Users\\공예은\\Desktop\\icon4.png")};
	
	public Practice6() {
		setTitle("GUI실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("버튼"));
		
		ImageIcon cherryIcon = new ImageIcon("C:\\Users\\공예은\\Desktop\\cherry.jpg");
		ImageIcon selectedCherryIcon = new ImageIcon("C:\\Users\\공예은\\Desktop\\selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		ImageIcon cherryIcon2 = new ImageIcon("C:\\Users\\공예은\\Desktop\\cherry.jpg");
		ImageIcon selectedCherryIcon2 = new ImageIcon("C:\\Users\\공예은\\Desktop\\selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple2 = new JRadioButton("사과");
		JRadioButton pear2 = new JRadioButton("배", true);
		JRadioButton cherry2 = new JRadioButton("체리", cherryIcon2);
		
		cherry2.setBorderPainted(true);
		cherry2.setSelectedIcon(selectedCherryIcon2);
		
		g.add(apple2);
		g.add(pear2);
		g.add(cherry2);
		
		c.add(apple2);
		c.add(pear2);
		c.add(cherry2);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		c.add(new JLabel("이름"));
		c.add(new JTextField(15));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과", 15));
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시...", 15));
		
		
		c.add(new JLabel("Enter the password: "));
		c.add(new JPasswordField("", 15));
		
		SpinnerListModel list = new SpinnerListModel(month);
		JSpinner spinner = new JSpinner(list);
		c.add(new JLabel("Month: "));
		c.add(spinner);
		
		c.add(new JScrollPane(new JTextArea("hello", 7, 20)));
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);
		c.add(nameCombo);
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(800, 800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Practice6();

	}

}
