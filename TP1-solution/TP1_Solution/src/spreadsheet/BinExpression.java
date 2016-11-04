/**
 */
package spreadsheet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spreadsheet.BinExpression#getSubexprs <em>Subexprs</em>}</li>
 * </ul>
 *
 * @see spreadsheet.SpreadsheetPackage#getBinExpression()
 * @model
 * @generated
 */
public interface BinExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Subexprs</b></em>' reference list.
	 * The list contents are of type {@link spreadsheet.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subexprs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subexprs</em>' reference list.
	 * @see spreadsheet.SpreadsheetPackage#getBinExpression_Subexprs()
	 * @model
	 * @generated
	 */
	EList<Expression> getSubexprs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String function(Expression toto, boolean tata);

} // BinExpression
