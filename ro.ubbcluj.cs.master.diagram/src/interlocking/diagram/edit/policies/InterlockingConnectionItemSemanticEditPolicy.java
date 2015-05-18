/*
 * 
 */
package interlocking.diagram.edit.policies;

import interlocking.diagram.providers.InterlockingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class InterlockingConnectionItemSemanticEditPolicy extends
		InterlockingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterlockingConnectionItemSemanticEditPolicy() {
		super(InterlockingElementTypes.InterlockingConnection_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
