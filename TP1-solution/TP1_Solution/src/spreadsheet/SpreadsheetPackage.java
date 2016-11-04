/**
 */
package spreadsheet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spreadsheet.SpreadsheetFactory
 * @model kind="package"
 * @generated
 */
public interface SpreadsheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spreadsheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/spreadsheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spreadsheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpreadsheetPackage eINSTANCE = spreadsheet.impl.SpreadsheetPackageImpl.init();

	/**
	 * The meta object id for the '{@link spreadsheet.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.impl.CellImpl
	 * @see spreadsheet.impl.SpreadsheetPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spreadsheet.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.impl.ExpressionImpl
	 * @see spreadsheet.impl.SpreadsheetPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CELL = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link spreadsheet.impl.BinExpressionImpl <em>Bin Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.impl.BinExpressionImpl
	 * @see spreadsheet.impl.SpreadsheetPackageImpl#getBinExpression()
	 * @generated
	 */
	int BIN_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION__CELL = EXPRESSION__CELL;

	/**
	 * The feature id for the '<em><b>Subexprs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION__SUBEXPRS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bin Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Function</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION___FUNCTION__EXPRESSION_BOOLEAN = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bin Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link spreadsheet.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.impl.ValueImpl
	 * @see spreadsheet.impl.SpreadsheetPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CELL = EXPRESSION__CELL;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spreadsheet.impl.CellRefImpl <em>Cell Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.impl.CellRefImpl
	 * @see spreadsheet.impl.SpreadsheetPackageImpl#getCellRef()
	 * @generated
	 */
	int CELL_REF = 4;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_REF__CELL = EXPRESSION__CELL;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_REF__REF = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cell Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cell Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link spreadsheet.impl.TableurImpl <em>Tableur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.impl.TableurImpl
	 * @see spreadsheet.impl.SpreadsheetPackageImpl#getTableur()
	 * @generated
	 */
	int TABLEUR = 5;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEUR__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Tableur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tableur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLEUR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link spreadsheet.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see spreadsheet.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the containment reference '{@link spreadsheet.Cell#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see spreadsheet.Cell#getExpression()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Expression();

	/**
	 * Returns the meta object for class '{@link spreadsheet.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see spreadsheet.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the container reference '{@link spreadsheet.Expression#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cell</em>'.
	 * @see spreadsheet.Expression#getCell()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Cell();

	/**
	 * Returns the meta object for class '{@link spreadsheet.BinExpression <em>Bin Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Expression</em>'.
	 * @see spreadsheet.BinExpression
	 * @generated
	 */
	EClass getBinExpression();

	/**
	 * Returns the meta object for the reference list '{@link spreadsheet.BinExpression#getSubexprs <em>Subexprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subexprs</em>'.
	 * @see spreadsheet.BinExpression#getSubexprs()
	 * @see #getBinExpression()
	 * @generated
	 */
	EReference getBinExpression_Subexprs();

	/**
	 * Returns the meta object for the '{@link spreadsheet.BinExpression#function(spreadsheet.Expression, boolean) <em>Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Function</em>' operation.
	 * @see spreadsheet.BinExpression#function(spreadsheet.Expression, boolean)
	 * @generated
	 */
	EOperation getBinExpression__Function__Expression_boolean();

	/**
	 * Returns the meta object for class '{@link spreadsheet.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see spreadsheet.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link spreadsheet.CellRef <em>Cell Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Ref</em>'.
	 * @see spreadsheet.CellRef
	 * @generated
	 */
	EClass getCellRef();

	/**
	 * Returns the meta object for the reference '{@link spreadsheet.CellRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see spreadsheet.CellRef#getRef()
	 * @see #getCellRef()
	 * @generated
	 */
	EReference getCellRef_Ref();

	/**
	 * Returns the meta object for class '{@link spreadsheet.Tableur <em>Tableur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tableur</em>'.
	 * @see spreadsheet.Tableur
	 * @generated
	 */
	EClass getTableur();

	/**
	 * Returns the meta object for the containment reference list '{@link spreadsheet.Tableur#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see spreadsheet.Tableur#getCells()
	 * @see #getTableur()
	 * @generated
	 */
	EReference getTableur_Cells();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpreadsheetFactory getSpreadsheetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spreadsheet.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheet.impl.CellImpl
		 * @see spreadsheet.impl.SpreadsheetPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__EXPRESSION = eINSTANCE.getCell_Expression();

		/**
		 * The meta object literal for the '{@link spreadsheet.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheet.impl.ExpressionImpl
		 * @see spreadsheet.impl.SpreadsheetPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__CELL = eINSTANCE.getExpression_Cell();

		/**
		 * The meta object literal for the '{@link spreadsheet.impl.BinExpressionImpl <em>Bin Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheet.impl.BinExpressionImpl
		 * @see spreadsheet.impl.SpreadsheetPackageImpl#getBinExpression()
		 * @generated
		 */
		EClass BIN_EXPRESSION = eINSTANCE.getBinExpression();

		/**
		 * The meta object literal for the '<em><b>Subexprs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_EXPRESSION__SUBEXPRS = eINSTANCE.getBinExpression_Subexprs();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIN_EXPRESSION___FUNCTION__EXPRESSION_BOOLEAN = eINSTANCE.getBinExpression__Function__Expression_boolean();

		/**
		 * The meta object literal for the '{@link spreadsheet.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheet.impl.ValueImpl
		 * @see spreadsheet.impl.SpreadsheetPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link spreadsheet.impl.CellRefImpl <em>Cell Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheet.impl.CellRefImpl
		 * @see spreadsheet.impl.SpreadsheetPackageImpl#getCellRef()
		 * @generated
		 */
		EClass CELL_REF = eINSTANCE.getCellRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_REF__REF = eINSTANCE.getCellRef_Ref();

		/**
		 * The meta object literal for the '{@link spreadsheet.impl.TableurImpl <em>Tableur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spreadsheet.impl.TableurImpl
		 * @see spreadsheet.impl.SpreadsheetPackageImpl#getTableur()
		 * @generated
		 */
		EClass TABLEUR = eINSTANCE.getTableur();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLEUR__CELLS = eINSTANCE.getTableur_Cells();

	}

} //SpreadsheetPackage
