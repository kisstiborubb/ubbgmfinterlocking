/*
 * 
 */
package interlocking.diagram.edit.policies;

import interlocking.diagram.edit.commands.ConnectorCreateCommand;
import interlocking.diagram.providers.InterlockingElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SegmentSegmentConnectorsCompartmentItemSemanticEditPolicy extends
		InterlockingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SegmentSegmentConnectorsCompartmentItemSemanticEditPolicy() {
		super(InterlockingElementTypes.Segment_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InterlockingElementTypes.Connector_3001 == req.getElementType()) {
			return getGEFWrapper(new ConnectorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
