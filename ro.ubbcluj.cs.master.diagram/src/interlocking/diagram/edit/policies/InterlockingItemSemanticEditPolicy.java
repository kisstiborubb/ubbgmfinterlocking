/*
 * 
 */
package interlocking.diagram.edit.policies;

import interlocking.diagram.edit.commands.InterlockingElementCreateCommand;
import interlocking.diagram.edit.commands.SegmentCreateCommand;
import interlocking.diagram.edit.commands.SemaphoreCreateCommand;
import interlocking.diagram.edit.commands.SwichCreateCommand;
import interlocking.diagram.providers.InterlockingElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class InterlockingItemSemanticEditPolicy extends
		InterlockingBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterlockingItemSemanticEditPolicy() {
		super(InterlockingElementTypes.Interlocking_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InterlockingElementTypes.Segment_2001 == req.getElementType()) {
			return getGEFWrapper(new SegmentCreateCommand(req));
		}
		if (InterlockingElementTypes.Semaphore_2002 == req.getElementType()) {
			return getGEFWrapper(new SemaphoreCreateCommand(req));
		}
		if (InterlockingElementTypes.Swich_2003 == req.getElementType()) {
			return getGEFWrapper(new SwichCreateCommand(req));
		}
		if (InterlockingElementTypes.InterlockingElement_2004 == req
				.getElementType()) {
			return getGEFWrapper(new InterlockingElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
