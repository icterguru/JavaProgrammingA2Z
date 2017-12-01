package chapter15;
// PrintServiceEx2.java
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;


public class PrintServiceEx2 {

	public static void main(String[] args){
		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		for (int i = 0; i < services.length; i++) {
			System.out.println(services[i].getName());
		}

		PrintService service = PrintServiceLookup.lookupDefaultPrintService();
		DocFlavor flavor = DocFlavor.URL.GIF;
		if (!service.isDocFlavorSupported(flavor)) {
			System.err.println("The printer does not support the appropriate DocFlavor");
		}

	}
}
