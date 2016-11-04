package fr.irisa.diverse.idm

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import spreadsheet.Tableur
import spreadsheet.SpreadsheetPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class EcoreLoader {
	def EPackage loadModel(String path) {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(path);
		var res = rs.getResource(uri, true);
		var EPackage p = res.contents.get(0) as EPackage
		return p;

	}
	
	def Tableur loadTableModel(String path) {
		
		//Load an instance of spreadsheet MM (a model of a tableur, xmi format)
		 doEMFRegistration()
        var res = new ResourceSetImpl().getResource(URI::createURI(path), true);
        res.contents.get(0) as Tableur		

	}
	
	
	
	def doEMFRegistration() {
		
		SpreadsheetPackage.eINSTANCE.eClass(); 
		val reg = Resource.Factory.Registry.INSTANCE;
		val m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		
	}
}