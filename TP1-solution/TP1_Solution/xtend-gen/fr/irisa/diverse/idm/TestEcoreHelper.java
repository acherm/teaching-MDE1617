package fr.irisa.diverse.idm;

import com.google.common.collect.Iterables;
import fr.irisa.diverse.idm.EcoreHelper;
import fr.irisa.diverse.idm.EcoreLoader;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import spreadsheet.Cell;
import spreadsheet.Expression;
import spreadsheet.Tableur;
import spreadsheet.Value;

@SuppressWarnings("all")
public class TestEcoreHelper {
  @Test
  public void test() {
    InputOutput.<String>println("Without aspects");
    final EcoreLoader loader = new EcoreLoader();
    final EcoreHelper docHelper = new EcoreHelper();
    final EPackage metamodel = loader.loadModel("spreadsheet.ecore");
    EList<EClassifier> _eClassifiers = metamodel.getEClassifiers();
    Iterable<EClass> _filter = Iterables.<EClass>filter(_eClassifiers, EClass.class);
    for (final EClass aClass : _filter) {
      docHelper.assignIdentifier(aClass);
    }
    InputOutput.<String>println("--- Flat ---");
    EList<EClassifier> _eClassifiers_1 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_1 = Iterables.<EClass>filter(_eClassifiers_1, EClass.class);
    for (final EClass aClass_1 : _filter_1) {
      String _flat = docHelper.flat(aClass_1, "");
      InputOutput.<String>println(_flat);
    }
    InputOutput.println();
    InputOutput.<String>println("--- Short ---");
    EList<EClassifier> _eClassifiers_2 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_2 = Iterables.<EClass>filter(_eClassifiers_2, EClass.class);
    for (final EClass aClass_2 : _filter_2) {
      String _sshort = docHelper.sshort(aClass_2, "");
      InputOutput.<String>println(_sshort);
    }
    InputOutput.println();
    InputOutput.<String>println("--- Flat Short ---");
    EList<EClassifier> _eClassifiers_3 = metamodel.getEClassifiers();
    Iterable<EClass> _filter_3 = Iterables.<EClass>filter(_eClassifiers_3, EClass.class);
    for (final EClass aClass_3 : _filter_3) {
      String _flatShort = docHelper.flatShort(aClass_3, "");
      InputOutput.<String>println(_flatShort);
    }
  }
  
  @Test
  public void testTableur() {
    final EcoreLoader loader = new EcoreLoader();
    final Tableur model = loader.loadTableModel("exampletableur3.xmi");
    EList<Cell> _cells = model.getCells();
    int _size = _cells.size();
    Assert.assertEquals(3, _size);
    final AtomicInteger v = new AtomicInteger(0);
    EList<Cell> _cells_1 = model.getCells();
    final Consumer<Cell> _function = (Cell c) -> {
      final Expression ex = c.getExpression();
      if ((ex instanceof Value)) {
        v.getAndIncrement();
      }
    };
    _cells_1.forEach(_function);
    int _get = v.get();
    Assert.assertEquals(1, _get);
  }
}
