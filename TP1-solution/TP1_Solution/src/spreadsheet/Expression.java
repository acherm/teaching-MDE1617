/**
 */
package spreadsheet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spreadsheet.Expression#getCell <em>Cell</em>}</li>
 * </ul>
 *
 * @see spreadsheet.SpreadsheetPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link spreadsheet.Cell#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' container reference.
	 * @see #setCell(Cell)
	 * @see spreadsheet.SpreadsheetPackage#getExpression_Cell()
	 * @see spreadsheet.Cell#getExpression
	 * @model opposite="expression" transient="false"
	 * @generated
	 */
	Cell getCell();

	/**
	 * Sets the value of the '{@link spreadsheet.Expression#getCell <em>Cell</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell</em>' container reference.
	 * @see #getCell()
	 * @generated
	 */
	void setCell(Cell value);

} // Expression
