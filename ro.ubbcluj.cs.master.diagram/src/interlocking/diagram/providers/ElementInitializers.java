/*
 * 
 */
package interlocking.diagram.providers;

import interlocking.diagram.part.InterlockingDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = InterlockingDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			InterlockingDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
