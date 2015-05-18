/*
 * 
 */
package interlocking.diagram.edit.parts;

import interlocking.diagram.part.InterlockingVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class InterlockingEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (InterlockingVisualIDRegistry.getVisualID(view)) {

			case InterlockingEditPart.VISUAL_ID:
				return new InterlockingEditPart(view);

			case SegmentEditPart.VISUAL_ID:
				return new SegmentEditPart(view);

			case SegmentNameEditPart.VISUAL_ID:
				return new SegmentNameEditPart(view);

			case SemaphoreEditPart.VISUAL_ID:
				return new SemaphoreEditPart(view);

			case SemaphoreNameEditPart.VISUAL_ID:
				return new SemaphoreNameEditPart(view);

			case SwichEditPart.VISUAL_ID:
				return new SwichEditPart(view);

			case SwichNameEditPart.VISUAL_ID:
				return new SwichNameEditPart(view);

			case InterlockingElementEditPart.VISUAL_ID:
				return new InterlockingElementEditPart(view);

			case InterlockingElementNameEditPart.VISUAL_ID:
				return new InterlockingElementNameEditPart(view);

			case ConnectorEditPart.VISUAL_ID:
				return new ConnectorEditPart(view);

			case ConnectorNameEditPart.VISUAL_ID:
				return new ConnectorNameEditPart(view);

			case SegmentSegmentConnectorsCompartmentEditPart.VISUAL_ID:
				return new SegmentSegmentConnectorsCompartmentEditPart(view);

			case SemaphoreSemaphoreConnectorsCompartmentEditPart.VISUAL_ID:
				return new SemaphoreSemaphoreConnectorsCompartmentEditPart(view);

			case SwichSwichConnectorsCompartmentEditPart.VISUAL_ID:
				return new SwichSwichConnectorsCompartmentEditPart(view);

			case InterlockingElementInterlockingElementConnectorsCompartmentEditPart.VISUAL_ID:
				return new InterlockingElementInterlockingElementConnectorsCompartmentEditPart(
						view);

			case InterlockingConnectionEditPart.VISUAL_ID:
				return new InterlockingConnectionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
