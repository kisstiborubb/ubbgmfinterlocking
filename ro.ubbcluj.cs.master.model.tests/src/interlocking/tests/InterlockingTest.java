/**
 */
package interlocking.tests;

import interlocking.Interlocking;
import interlocking.InterlockingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interlocking</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterlockingTest extends TestCase {

	/**
	 * The fixture for this Interlocking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interlocking fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterlockingTest.class);
	}

	/**
	 * Constructs a new Interlocking test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Interlocking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Interlocking fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Interlocking test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interlocking getFixture() {
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
		setFixture(InterlockingFactory.eINSTANCE.createInterlocking());
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

} //InterlockingTest
