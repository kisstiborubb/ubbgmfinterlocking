/**
 */
package interlocking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see interlocking.InterlockingFactory
 * @model kind="package"
 * @generated
 */
public interface InterlockingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interlocking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ro.ubblcuj.cs.master.model.interlocking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interlocking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterlockingPackage eINSTANCE = interlocking.impl.InterlockingPackageImpl.init();

	/**
	 * The meta object id for the '{@link interlocking.impl.InterlockingImpl <em>Interlocking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.InterlockingImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getInterlocking()
	 * @generated
	 */
	int INTERLOCKING = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Interlocking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link interlocking.impl.InterlockingElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.InterlockingElementImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getInterlockingElement()
	 * @generated
	 */
	int INTERLOCKING_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_ELEMENT__CONNECTORS = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link interlocking.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.SegmentImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = INTERLOCKING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__CONNECTORS = INTERLOCKING_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = INTERLOCKING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link interlocking.impl.SemaphoreImpl <em>Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.SemaphoreImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getSemaphore()
	 * @generated
	 */
	int SEMAPHORE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__NAME = INTERLOCKING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE__CONNECTORS = INTERLOCKING_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_FEATURE_COUNT = INTERLOCKING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link interlocking.impl.SwichImpl <em>Swich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.SwichImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getSwich()
	 * @generated
	 */
	int SWICH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWICH__NAME = INTERLOCKING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWICH__CONNECTORS = INTERLOCKING_ELEMENT__CONNECTORS;

	/**
	 * The number of structural features of the '<em>Swich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWICH_FEATURE_COUNT = INTERLOCKING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link interlocking.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.ConnectorImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link interlocking.impl.InterlockingConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interlocking.impl.InterlockingConnectionImpl
	 * @see interlocking.impl.InterlockingPackageImpl#getInterlockingConnection()
	 * @generated
	 */
	int INTERLOCKING_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLOCKING_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link interlocking.Interlocking <em>Interlocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interlocking</em>'.
	 * @see interlocking.Interlocking
	 * @generated
	 */
	EClass getInterlocking();

	/**
	 * Returns the meta object for the containment reference list '{@link interlocking.Interlocking#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see interlocking.Interlocking#getElements()
	 * @see #getInterlocking()
	 * @generated
	 */
	EReference getInterlocking_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link interlocking.Interlocking#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see interlocking.Interlocking#getConnections()
	 * @see #getInterlocking()
	 * @generated
	 */
	EReference getInterlocking_Connections();

	/**
	 * Returns the meta object for class '{@link interlocking.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see interlocking.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for class '{@link interlocking.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore</em>'.
	 * @see interlocking.Semaphore
	 * @generated
	 */
	EClass getSemaphore();

	/**
	 * Returns the meta object for class '{@link interlocking.Swich <em>Swich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swich</em>'.
	 * @see interlocking.Swich
	 * @generated
	 */
	EClass getSwich();

	/**
	 * Returns the meta object for class '{@link interlocking.InterlockingElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see interlocking.InterlockingElement
	 * @generated
	 */
	EClass getInterlockingElement();

	/**
	 * Returns the meta object for the attribute '{@link interlocking.InterlockingElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see interlocking.InterlockingElement#getName()
	 * @see #getInterlockingElement()
	 * @generated
	 */
	EAttribute getInterlockingElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link interlocking.InterlockingElement#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see interlocking.InterlockingElement#getConnectors()
	 * @see #getInterlockingElement()
	 * @generated
	 */
	EReference getInterlockingElement_Connectors();

	/**
	 * Returns the meta object for class '{@link interlocking.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see interlocking.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link interlocking.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see interlocking.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for class '{@link interlocking.InterlockingConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see interlocking.InterlockingConnection
	 * @generated
	 */
	EClass getInterlockingConnection();

	/**
	 * Returns the meta object for the reference '{@link interlocking.InterlockingConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see interlocking.InterlockingConnection#getSource()
	 * @see #getInterlockingConnection()
	 * @generated
	 */
	EReference getInterlockingConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link interlocking.InterlockingConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see interlocking.InterlockingConnection#getTarget()
	 * @see #getInterlockingConnection()
	 * @generated
	 */
	EReference getInterlockingConnection_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterlockingFactory getInterlockingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link interlocking.impl.InterlockingImpl <em>Interlocking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.InterlockingImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getInterlocking()
		 * @generated
		 */
		EClass INTERLOCKING = eINSTANCE.getInterlocking();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERLOCKING__ELEMENTS = eINSTANCE.getInterlocking_Elements();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERLOCKING__CONNECTIONS = eINSTANCE.getInterlocking_Connections();

		/**
		 * The meta object literal for the '{@link interlocking.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.SegmentImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '{@link interlocking.impl.SemaphoreImpl <em>Semaphore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.SemaphoreImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getSemaphore()
		 * @generated
		 */
		EClass SEMAPHORE = eINSTANCE.getSemaphore();

		/**
		 * The meta object literal for the '{@link interlocking.impl.SwichImpl <em>Swich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.SwichImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getSwich()
		 * @generated
		 */
		EClass SWICH = eINSTANCE.getSwich();

		/**
		 * The meta object literal for the '{@link interlocking.impl.InterlockingElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.InterlockingElementImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getInterlockingElement()
		 * @generated
		 */
		EClass INTERLOCKING_ELEMENT = eINSTANCE.getInterlockingElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERLOCKING_ELEMENT__NAME = eINSTANCE.getInterlockingElement_Name();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERLOCKING_ELEMENT__CONNECTORS = eINSTANCE.getInterlockingElement_Connectors();

		/**
		 * The meta object literal for the '{@link interlocking.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.ConnectorImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '{@link interlocking.impl.InterlockingConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interlocking.impl.InterlockingConnectionImpl
		 * @see interlocking.impl.InterlockingPackageImpl#getInterlockingConnection()
		 * @generated
		 */
		EClass INTERLOCKING_CONNECTION = eINSTANCE.getInterlockingConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERLOCKING_CONNECTION__SOURCE = eINSTANCE.getInterlockingConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERLOCKING_CONNECTION__TARGET = eINSTANCE.getInterlockingConnection_Target();

	}

} //InterlockingPackage
