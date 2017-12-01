package chapter15;
// http://www.coderanch.com/mobile/t/410208/java/java/java-printing-printing-pdf?foo=a

// PrintTestEx1.java
import java.io.*;
import javax.print.*;
import javax.print.attribute.*;

public class PrintTestEx1{
	public static void main(String args[]){
		FileInputStream psStream = null;

		try {
			psStream = new FileInputStream("test.pdf");
		} catch (FileNotFoundException ffne) {
			ffne.printStackTrace();
		}
		if (psStream == null) {
			return;
		}

		DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
		Doc myDoc = new SimpleDoc(psStream, psInFormat, null);
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);
		// this step is necessary because I have several printers configured
		PrintService myPrinter = null;

		for (int i = 0; i < services.length; i++){
			String svcName = services[i].toString();
			System.out.println("Service found: "+svcName);
			if (svcName.contains("My local printer name")){
				myPrinter = services[i];
				System.out.println("my printer found: "+svcName);
				break;
			}
		}

		if (myPrinter != null) {
			DocPrintJob job = myPrinter.createPrintJob();
			try {
				job.print(myDoc, aset);

			}
			catch (Exception pe) {pe.printStackTrace();}
		}
		else {
			System.out.println("No printer services found" );
		}
	}
}
