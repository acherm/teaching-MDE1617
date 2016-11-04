/**
 */
package spreadsheet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spreadsheet.CellRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see spreadsheet.SpreadsheetPackage#getCellRef()
 * @model
 * @generated
 */
public interface CellRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Cell)
	 * @see spreadsheet.SpreadsheetPackage#getCellRef_Ref()
	 * @model
	 * @generated
	 */
	Cell getRef();

	/**
	 * Sets the value of the '{@link spreadsheet.CellRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Cell value);

} // CellRef
