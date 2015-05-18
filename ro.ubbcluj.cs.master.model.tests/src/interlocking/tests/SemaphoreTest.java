/**
 */
package interlocking.tests;

import interlocking.InterlockingFactory;
import interlocking.Semaphore;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemaphoreTest extends InterlockingElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemaphoreTest.class);
	}

	/**
	 * Constructs a new Semaphore test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Semaphore test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Semaphore getFixture() {
		return (Semaphore)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterlockingFactory.eINSTANCE.createSemaphore());
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

} //SemaphoreTest
