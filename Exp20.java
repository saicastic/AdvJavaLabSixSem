import javax.swing.*;
import java.awt.*;

public class Exp20{
	public static void main(String args[]){
		JFrame frame = new JFrame("Menu Bar");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar mb = new JMenuBar();
		JMenu File = new JMenu("File");
		JMenu Edit = new JMenu("Edit");
		JMenu View = new JMenu("View");
		
		mb.add(File);
		mb.add(Edit);
		mb.add(View);
				
		frame.setJMenuBar(mb);
		JMenuItem New = new JMenuItem("New");
		JMenuItem Open = new JMenuItem("Open");
		JMenuItem Save = new JMenuItem("Save");
		JMenuItem SaveAs = new JMenuItem("Save As");
		JMenuItem Exit = new JMenuItem("Exit");
		JMenuItem Zoom = new JMenuItem("Zoom");
		JMenuItem StatusBar = new JMenuItem("Status Bar");
		JMenuItem WW = new JMenuItem("Word Wrap");
		JMenuItem Undo = new JMenuItem("Undo");
		JMenuItem Cut = new JMenuItem("Cut");
		JMenuItem Copy = new JMenuItem("Copy");
		JMenuItem Paste = new JMenuItem("Paste");
		

		File.add(New);
		File.add(Open);
		File.add(Save);
		File.add(SaveAs);
		File.add(Exit);

		Edit.add(Undo);
		Edit.add(Cut);
		Edit.add(Copy);
		Edit.add(Paste);

		View.add(Zoom);
		View.add(StatusBar);
		View.add(WW);



		frame.setVisible(true);
	}
}
