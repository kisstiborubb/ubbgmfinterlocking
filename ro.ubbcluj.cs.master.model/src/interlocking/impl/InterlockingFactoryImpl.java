/**
 */
package interlocking.impl;

import interlocking.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterlockingFactoryImpl extends EFactoryImpl implements InterlockingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterlockingFactory init() {
		try {
			InterlockingFactory theInterlockingFactory = (InterlockingFactory)EPackage.Registry.INSTANCE.getEFactory(InterlockingPackage.eNS_URI);
			if (theInterlockingFactory != null) {
				return theInterlockingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterlockingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InterlockingPackage.INTERLOCKING: return createInterlocking();
			case InterlockingPackage.SEGMENT: return createSegment();
			case InterlockingPackage.SEMAPHORE: return createSemaphore();
			case InterlockingPackage.SWICH: return createSwich();
			case InterlockingPackage.INTERLOCKING_ELEMENT: return createInterlockingElement();
			case InterlockingPackage.CONNECTOR: return createConnector();
			case InterlockingPackage.INTERLOCKING_CONNECTION: return createInterlockingConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interlocking createInterlocking() {
		InterlockingImpl interlocking = new InterlockingImpl();
		return interlocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore createSemaphore() {
		SemaphoreImpl semaphore = new SemaphoreImpl();
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swich createSwich() {
		SwichImpl swich = new SwichImpl();
		return swich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockingElement createInterlockingElement() {
		InterlockingElementImpl interlockingElement = new InterlockingElementImpl();
		return interlockingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockingConnection createInterlockingConnection() {
		InterlockingConnectionImpl interlockingConnection = new InterlockingConnectionImpl();
		return interlockingConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterlockingPackage getInterlockingPackage() {
		return (InterlockingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterlockingPackage getPackage() {
		return InterlockingPackage.eINSTANCE;
	}

} //InterlockingFactoryImpl
