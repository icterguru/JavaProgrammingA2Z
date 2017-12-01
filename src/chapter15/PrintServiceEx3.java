package chapter15;
// PrintServiceEx3.java
import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;


public class PrintServiceEx3 {

	public static void main(String[] args){

		PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
		DocFlavor flavor = DocFlavor.URL.GIF;
		for (int i = 0; i < services.length; i++) {
			System.out.println(services[i].getName());

			if (!services[i].isDocFlavorSupported(flavor)) {
				System.err.println("The printer does not support the appropriate DocFlavor");
			}

		}

		PrintService svc = PrintServiceLookup.lookupDefaultPrintService();
		PrintRequestAttributeSet attrs = new HashPrintRequestAttributeSet();
		PrintService selection = ServiceUI.printDialog(
				null, 100, 100, services, svc, null, attrs);


	}
}
