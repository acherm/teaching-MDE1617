/**
 */
package spreadsheet.tests;

import junit.textui.TestRunner;

import spreadsheet.BinExpression;
import spreadsheet.SpreadsheetFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bin Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link spreadsheet.BinExpression#function(spreadsheet.Expression, boolean) <em>Function</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BinExpressionTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinExpressionTest.class);
	}

	/**
	 * Constructs a new Bin Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bin Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinExpression getFixture() {
		return (BinExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpreadsheetFactory.eINSTANCE.createBinExpression());
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

	/**
	 * Tests the '{@link spreadsheet.BinExpression#function(spreadsheet.Expression, boolean) <em>Function</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spreadsheet.BinExpression#function(spreadsheet.Expression, boolean)
	 * @generated
	 */
	public void testFunction__Expression_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BinExpressionTest
