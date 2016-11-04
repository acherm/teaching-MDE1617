package fr.irisa.diverse.idm;

import org.eclipse.emf.ecore.EClass
import org.junit.Test

import static org.junit.Assert.*
import spreadsheet.Value
import java.util.concurrent.atomic.AtomicInteger

class TestEcoreHelper {

	@Test
	def void test() {
		println("Without aspects")
		
		val loader = new EcoreLoader
		val docHelper = new EcoreHelper()
		val metamodel = loader.loadModel("spreadsheet.ecore")
		
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			docHelper.assignIdentifier(aClass)	
		}
		
		println("--- Flat ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.flat(aClass, ""));
		}
		
		println
		
		println("--- Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.sshort(aClass, ""));	
		}
		
		println
	
		println("--- Flat Short ---")
		for (EClass aClass : metamodel.EClassifiers.filter(EClass)) {
			println(docHelper.flatShort(aClass, ""));	
		}
	}
	
	@Test
	def void testTableur() {
		
		val loader = new EcoreLoader
		val model = loader.loadTableModel("exampletableur3.xmi")
		assertEquals(3, model.cells.size)
		
		val v = new AtomicInteger(0)
		model.cells.forEach[ c |
			val ex = c.expression
			if (ex instanceof Value) {
				v.andIncrement
			}
		]
		
		assertEquals(1, v.get)
		
		
	}
	
	

}
