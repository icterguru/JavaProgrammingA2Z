import java.awt.*;
import java.io.File;

public class Lister extends Frame{
	
	TextArea ta;
	
	public static void main(String args[]){
		
		String path = ".";
		
		if(args.length >=1){
			
			path = args[0];
		}
		
		File f = new File(path);
		if (!f.isDirectory()){
			
			System.out.println("Doesn't exist or not a Directory - "+ path);
			System.exit(0);
		}
		
		Lister lister = new Lister(f);
		lister.setVisible(true);
	}
	
	Lister(File f){
		
		super("Java file Lister");
		setSize(300,450);
		ta = new TextArea();
		ta.setFont(new Font("Monospaced",Font.BOLD, 14));
		add(BorderLayout.CENTER, ta);
		recurse(f,0);
	}
	
	void recurse(File dirfile, int depth){
		
		String contents[] = dirfile.list();
		
		for(int i = 0;i<contents.length; i++){
			
			for(int spaces = 0;spaces<depth; spaces++){
				ta.append("     ");
			}
			
			File child = new File(dirfile,contents[i]); 
				//My line
			if(child.isDirectory()) 			//My line
				ta.append("[DIR] ");
							//My line
			ta.append(contents[i] + "\n");
			//File child = new File(dirfile,contents[i]);
			if(child.isDirectory()){	
				recurse(child,depth+1);
			}
		}
	}
}