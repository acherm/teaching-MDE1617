package fr.irisa.diverse.idm;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

@SuppressWarnings("all")
public class EcoreHelper {
  private Map<EClass, String> ids = new HashMap<EClass, String>();
  
  public String flat(final EClass aClass, final String tab) {
    String _name = aClass.getName();
    String _plus = (tab + _name);
    String out = (_plus + " : ");
    String _get = this.ids.get(aClass);
    String _plus_1 = ((((out + "\n") + tab) + "\t id : ") + _get);
    out = _plus_1;
    EList<EClass> _eSuperTypes = aClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      String _flat = this.flat(superType, (tab + "\t"));
      String _plus_2 = ((out + "\n") + _flat);
      out = _plus_2;
    }
    return out;
  }
  
  public String sshort(final EClass aClass, final String tab) {
    String _name = aClass.getName();
    String _plus = (tab + _name);
    String out = (_plus + " : ");
    String _get = this.ids.get(aClass);
    String _plus_1 = ((((out + "\n") + tab) + "\t id : ") + _get);
    out = _plus_1;
    EList<EAttribute> _eAttributes = aClass.getEAttributes();
    for (final EAttribute attr : _eAttributes) {
      String _name_1 = attr.getName();
      String _plus_2 = ((((out + "\n") + tab) + "\t attr ") + _name_1);
      String _plus_3 = (_plus_2 + " : ");
      EClassifier _eType = attr.getEType();
      String _name_2 = _eType.getName();
      String _plus_4 = (_plus_3 + _name_2);
      out = _plus_4;
    }
    EList<EOperation> _eOperations = aClass.getEOperations();
    for (final EOperation op : _eOperations) {
      {
        String _name_3 = op.getName();
        String _plus_5 = ((((out + "\n") + tab) + "\t op ") + _name_3);
        String _plus_6 = (_plus_5 + " (");
        out = _plus_6;
        boolean first = true;
        EList<EParameter> _eParameters = op.getEParameters();
        for (final EParameter parameter : _eParameters) {
          {
            if (first) {
              first = false;
            } else {
              out = (out + ", ");
            }
            String _name_4 = parameter.getName();
            String _plus_7 = (out + _name_4);
            String _plus_8 = (_plus_7 + " : ");
            EClassifier _eType_1 = parameter.getEType();
            String _name_5 = _eType_1.getName();
            String _plus_9 = (_plus_8 + _name_5);
            out = _plus_9;
          }
        }
        EClassifier _eType_1 = op.getEType();
        String _name_4 = _eType_1.getName();
        String _plus_7 = ((out + ") : ") + _name_4);
        out = _plus_7;
      }
    }
    EList<EReference> _eReferences = aClass.getEReferences();
    for (final EReference ref : _eReferences) {
      {
        String _name_3 = ref.getName();
        String _plus_5 = ((((out + "\n") + tab) + "\t ref ") + _name_3);
        String _plus_6 = (_plus_5 + " : ");
        EClassifier _eType_1 = ref.getEType();
        String _name_4 = _eType_1.getName();
        String _plus_7 = (_plus_6 + _name_4);
        out = _plus_7;
        int _lowerBound = ref.getLowerBound();
        String _plus_8 = ((out + "[") + Integer.valueOf(_lowerBound));
        String _plus_9 = (_plus_8 + "..");
        out = _plus_9;
        String _xifexpression = null;
        int _upperBound = ref.getUpperBound();
        boolean _equals = (_upperBound == (-1));
        if (_equals) {
          _xifexpression = "*]";
        } else {
          int _upperBound_1 = ref.getUpperBound();
          _xifexpression = (Integer.valueOf(_upperBound_1) + "]");
        }
        String _plus_10 = (out + _xifexpression);
        out = _plus_10;
      }
    }
    return out;
  }
  
  public String flatShort(final EClass aClass, final String tab) {
    String out = this.sshort(aClass, tab);
    EList<EClass> _eSuperTypes = aClass.getESuperTypes();
    for (final EClass superType : _eSuperTypes) {
      String _flatShort = this.flatShort(superType, (tab + "\t"));
      String _plus = ((out + "\n") + _flatShort);
      out = _plus;
    }
    return out;
  }
  
  public void assignIdentifier(final EClass aClass) {
    String _name = aClass.getName();
    int _hashCode = _name.hashCode();
    String _plus = (Integer.valueOf(_hashCode) + "_");
    long _currentTimeMillis = System.currentTimeMillis();
    String _plus_1 = (_plus + Long.valueOf(_currentTimeMillis));
    this.ids.put(aClass, _plus_1);
  }
}
