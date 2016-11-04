/**
 */
package spreadsheet.tests;

import junit.textui.TestRunner;

import spreadsheet.CellRef;
import spreadsheet.SpreadsheetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cell Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CellRefTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CellRefTest.class);
	}

	/**
	 * Constructs a new Cell Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cell Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CellRef getFixture() {
		return (CellRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpreadsheetFactory.eINSTANCE.createCellRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CellRefTest
