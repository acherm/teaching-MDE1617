package fr.irisa.diverse.idm

import java.util.Map
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EParameter
import org.eclipse.emf.ecore.EReference
import java.util.HashMap

class EcoreHelper {
	
	Map<EClass, String> ids = new HashMap;

	def String flat(EClass aClass, String tab) {
		var String out = tab + aClass.name + " : "
		out = out + "\n" + tab + "\t id : " + ids.get(aClass)
		for (EClass superType : aClass.ESuperTypes) {
			out = out + "\n" + flat(superType, tab + "\t");
		}
		return out		
	}
	
	
	def String sshort(EClass aClass, String tab) { // short is a keyword in Java/Xtend
		var out = tab + aClass.name + " : "
		out = out + "\n" + tab + "\t id : " + ids.get(aClass)
		
		// Attributes
		for (EAttribute attr : aClass.EAttributes) {
			out = out + "\n" + tab + "\t attr " + attr.name + " : " + attr.EType.name
		}
		
		// Operations
		for (EOperation op: aClass.EOperations) {
			out = out + "\n" + tab + "\t op " + op.name + " ("
			var first = true
			for (EParameter parameter : op.EParameters) {
				if (first) {
					first = false	
				} else {
					out = out + (", ")
				}
				
				out = out + parameter.name + " : " + parameter.EType.name
				 				
			}
			out = out + ") : " + op.EType.name
		}
		
		// References
		for (EReference ref : aClass.EReferences) {
			out = out + "\n" + tab + "\t ref " + ref.name + " : " + ref.EType.name 
			out = out + "[" + ref.lowerBound + ".." 
			out = out + if (ref.upperBound == -1) { "*]" } else { ref.upperBound + "]" }
		}
		
		return out
	} 	 	 
	
	def String flatShort(EClass aClass, String tab) {
		var out = aClass.sshort(tab)
		for (EClass superType : aClass.ESuperTypes) {
			out = out + "\n" + flatShort(superType, tab + "\t");
		}
		return out
	} 
	
	def void assignIdentifier(EClass aClass) {
		ids.put(aClass, aClass.name.hashCode + "_" + System.currentTimeMillis)
	}	
		
}



