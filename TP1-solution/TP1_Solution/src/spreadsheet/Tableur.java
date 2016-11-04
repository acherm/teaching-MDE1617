/**
 */
package spreadsheet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tableur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spreadsheet.Tableur#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see spreadsheet.SpreadsheetPackage#getTableur()
 * @model
 * @generated
 */
public interface Tableur extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link spreadsheet.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see spreadsheet.SpreadsheetPackage#getTableur_Cells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cell> getCells();

} // Tableur
