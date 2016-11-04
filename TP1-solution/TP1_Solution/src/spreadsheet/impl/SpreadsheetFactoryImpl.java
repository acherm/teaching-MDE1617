/**
 */
package spreadsheet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spreadsheet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetFactoryImpl extends EFactoryImpl implements SpreadsheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpreadsheetFactory init() {
		try {
			SpreadsheetFactory theSpreadsheetFactory = (SpreadsheetFactory)EPackage.Registry.INSTANCE.getEFactory(SpreadsheetPackage.eNS_URI);
			if (theSpreadsheetFactory != null) {
				return theSpreadsheetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpreadsheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpreadsheetPackage.CELL: return createCell();
			case SpreadsheetPackage.BIN_EXPRESSION: return createBinExpression();
			case SpreadsheetPackage.VALUE: return createValue();
			case SpreadsheetPackage.CELL_REF: return createCellRef();
			case SpreadsheetPackage.TABLEUR: return createTableur();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinExpression createBinExpression() {
		BinExpressionImpl binExpression = new BinExpressionImpl();
		return binExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellRef createCellRef() {
		CellRefImpl cellRef = new CellRefImpl();
		return cellRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tableur createTableur() {
		TableurImpl tableur = new TableurImpl();
		return tableur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetPackage getSpreadsheetPackage() {
		return (SpreadsheetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpreadsheetPackage getPackage() {
		return SpreadsheetPackage.eINSTANCE;
	}

} //SpreadsheetFactoryImpl
