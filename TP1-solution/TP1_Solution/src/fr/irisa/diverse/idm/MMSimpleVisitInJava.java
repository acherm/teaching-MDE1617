package fr.irisa.diverse.idm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import fr.irisa.diverse.idm.EcoreLoader;

/*
 * an example in Java (rather than Xtend) 
 * same principles for traversing the metamodel
 */

public class MMSimpleVisitInJava {
	
	
	@Test
	public void testFlat() throws Exception {
				
		EPackage pkg = new EcoreLoader().loadModel("spreadsheet.ecore");
		System.err.println("" + pkg.getName());
		EList<EClassifier> ecls = pkg.getEClassifiers();
		
		String out = "";
		for (EClassifier eClassifier : ecls) {
			if (eClassifier instanceof EClass) {
				EClass cl = (EClass) eClassifier;
				out += cl.getName();
				for (EClass superType : cl.getESuperTypes()) {
					out = out + " : " + superType.getName();
				}
				out += "\n";
			}
		}
		
		System.err.println("" + out);
				
	}

}
