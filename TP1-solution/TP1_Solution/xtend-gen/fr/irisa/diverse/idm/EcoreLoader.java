package fr.irisa.diverse.idm;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import spreadsheet.SpreadsheetPackage;
import spreadsheet.Tableur;

@SuppressWarnings("all")
public class EcoreLoader {
  public EPackage loadModel(final String path) {
    EcoreResourceFactoryImpl fact = new EcoreResourceFactoryImpl();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    }
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    _extensionToFactoryMap.put("ecore", fact);
    ResourceSetImpl rs = new ResourceSetImpl();
    URI uri = URI.createURI(path);
    Resource res = rs.getResource(uri, true);
    EList<EObject> _contents = res.getContents();
    EObject _get = _contents.get(0);
    EPackage p = ((EPackage) _get);
    return p;
  }
  
  public Tableur loadTableModel(final String path) {
    Tableur _xblockexpression = null;
    {
      this.doEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      URI _createURI = URI.createURI(path);
      Resource res = _resourceSetImpl.getResource(_createURI, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((Tableur) _get);
    }
    return _xblockexpression;
  }
  
  public Object doEMFRegistration() {
    Object _xblockexpression = null;
    {
      SpreadsheetPackage.eINSTANCE.eClass();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = m.put("xmi", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
}
