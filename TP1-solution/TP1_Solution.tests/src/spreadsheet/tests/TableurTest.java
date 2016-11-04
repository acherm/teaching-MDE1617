/**
 */
package spreadsheet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import spreadsheet.SpreadsheetFactory;
import spreadsheet.Tableur;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tableur</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableurTest extends TestCase {

	/**
	 * The fixture for this Tableur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tableur fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TableurTest.class);
	}

	/**
	 * Constructs a new Tableur test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableurTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tableur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tableur fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tableur test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tableur getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpreadsheetFactory.eINSTANCE.createTableur());
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

} //TableurTest
