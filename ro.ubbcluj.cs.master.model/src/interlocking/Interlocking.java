/**
 */
package interlocking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interlocking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link interlocking.Interlocking#getElements <em>Elements</em>}</li>
 *   <li>{@link interlocking.Interlocking#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see interlocking.InterlockingPackage#getInterlocking()
 * @model
 * @generated
 */
public interface Interlocking extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link interlocking.InterlockingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see interlocking.InterlockingPackage#getInterlocking_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterlockingElement> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link interlocking.InterlockingConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see interlocking.InterlockingPackage#getInterlocking_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterlockingConnection> getConnections();

} // Interlocking
