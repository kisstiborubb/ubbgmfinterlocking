/*
 * 
 */
package interlocking.diagram.providers;

import interlocking.diagram.edit.parts.InterlockingEditPart;
import interlocking.diagram.edit.parts.InterlockingEditPartFactory;
import interlocking.diagram.part.InterlockingVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class InterlockingEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public InterlockingEditPartProvider() {
		super(new InterlockingEditPartFactory(),
				InterlockingVisualIDRegistry.TYPED_INSTANCE,
				InterlockingEditPart.MODEL_ID);
	}

}
