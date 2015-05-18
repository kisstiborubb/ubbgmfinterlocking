/**
 */
package interlocking;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link interlocking.InterlockingConnection#getSource <em>Source</em>}</li>
 *   <li>{@link interlocking.InterlockingConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see interlocking.InterlockingPackage#getInterlockingConnection()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='5'"
 * @generated
 */
public interface InterlockingConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Connector)
	 * @see interlocking.InterlockingPackage#getInterlockingConnection_Source()
	 * @model
	 * @generated
	 */
	Connector getSource();

	/**
	 * Sets the value of the '{@link interlocking.InterlockingConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Connector value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Connector)
	 * @see interlocking.InterlockingPackage#getInterlockingConnection_Target()
	 * @model
	 * @generated
	 */
	Connector getTarget();

	/**
	 * Sets the value of the '{@link interlocking.InterlockingConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Connector value);

} // InterlockingConnection
