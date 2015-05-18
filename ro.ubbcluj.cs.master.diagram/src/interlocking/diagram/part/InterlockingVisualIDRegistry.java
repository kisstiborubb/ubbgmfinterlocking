/*
 * 
 */
package interlocking.diagram.part;

import interlocking.Interlocking;
import interlocking.InterlockingPackage;
import interlocking.diagram.edit.parts.ConnectorEditPart;
import interlocking.diagram.edit.parts.ConnectorNameEditPart;
import interlocking.diagram.edit.parts.InterlockingConnectionEditPart;
import interlocking.diagram.edit.parts.InterlockingEditPart;
import interlocking.diagram.edit.parts.InterlockingElementEditPart;
import interlocking.diagram.edit.parts.InterlockingElementInterlockingElementConnectorsCompartmentEditPart;
import interlocking.diagram.edit.parts.InterlockingElementNameEditPart;
import interlocking.diagram.edit.parts.SegmentEditPart;
import interlocking.diagram.edit.parts.SegmentNameEditPart;
import interlocking.diagram.edit.parts.SegmentSegmentConnectorsCompartmentEditPart;
import interlocking.diagram.edit.parts.SemaphoreEditPart;
import interlocking.diagram.edit.parts.SemaphoreNameEditPart;
import interlocking.diagram.edit.parts.SemaphoreSemaphoreConnectorsCompartmentEditPart;
import interlocking.diagram.edit.parts.SwichEditPart;
import interlocking.diagram.edit.parts.SwichNameEditPart;
import interlocking.diagram.edit.parts.SwichSwichConnectorsCompartmentEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class InterlockingVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ro.ubbcluj.cs.master.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (InterlockingEditPart.MODEL_ID.equals(view.getType())) {
				return InterlockingEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return interlocking.diagram.part.InterlockingVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				InterlockingDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (InterlockingPackage.eINSTANCE.getInterlocking().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Interlocking) domainElement)) {
			return InterlockingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = interlocking.diagram.part.InterlockingVisualIDRegistry
				.getModelID(containerView);
		if (!InterlockingEditPart.MODEL_ID.equals(containerModelID)
				&& !"interlocking".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (InterlockingEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = interlocking.diagram.part.InterlockingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = InterlockingEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case InterlockingEditPart.VISUAL_ID:
			if (InterlockingPackage.eINSTANCE.getSegment().isSuperTypeOf(
					domainElement.eClass())) {
				return SegmentEditPart.VISUAL_ID;
			}
			if (InterlockingPackage.eINSTANCE.getSemaphore().isSuperTypeOf(
					domainElement.eClass())) {
				return SemaphoreEditPart.VISUAL_ID;
			}
			if (InterlockingPackage.eINSTANCE.getSwich().isSuperTypeOf(
					domainElement.eClass())) {
				return SwichEditPart.VISUAL_ID;
			}
			if (InterlockingPackage.eINSTANCE.getInterlockingElement()
					.isSuperTypeOf(domainElement.eClass())) {
				return InterlockingElementEditPart.VISUAL_ID;
			}
			break;
		case SegmentSegmentConnectorsCompartmentEditPart.VISUAL_ID:
			if (InterlockingPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			break;
		case SemaphoreSemaphoreConnectorsCompartmentEditPart.VISUAL_ID:
			if (InterlockingPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			break;
		case SwichSwichConnectorsCompartmentEditPart.VISUAL_ID:
			if (InterlockingPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			break;
		case InterlockingElementInterlockingElementConnectorsCompartmentEditPart.VISUAL_ID:
			if (InterlockingPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = interlocking.diagram.part.InterlockingVisualIDRegistry
				.getModelID(containerView);
		if (!InterlockingEditPart.MODEL_ID.equals(containerModelID)
				&& !"interlocking".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (InterlockingEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = interlocking.diagram.part.InterlockingVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = InterlockingEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case InterlockingEditPart.VISUAL_ID:
			if (SegmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SemaphoreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwichEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterlockingElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SegmentEditPart.VISUAL_ID:
			if (SegmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SegmentSegmentConnectorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SemaphoreEditPart.VISUAL_ID:
			if (SemaphoreNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SemaphoreSemaphoreConnectorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwichEditPart.VISUAL_ID:
			if (SwichNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SwichSwichConnectorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterlockingElementEditPart.VISUAL_ID:
			if (InterlockingElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterlockingElementInterlockingElementConnectorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SegmentSegmentConnectorsCompartmentEditPart.VISUAL_ID:
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SemaphoreSemaphoreConnectorsCompartmentEditPart.VISUAL_ID:
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SwichSwichConnectorsCompartmentEditPart.VISUAL_ID:
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterlockingElementInterlockingElementConnectorsCompartmentEditPart.VISUAL_ID:
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (InterlockingPackage.eINSTANCE.getInterlockingConnection()
				.isSuperTypeOf(domainElement.eClass())) {
			return InterlockingConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Interlocking element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case SegmentSegmentConnectorsCompartmentEditPart.VISUAL_ID:
		case SemaphoreSemaphoreConnectorsCompartmentEditPart.VISUAL_ID:
		case SwichSwichConnectorsCompartmentEditPart.VISUAL_ID:
		case InterlockingElementInterlockingElementConnectorsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case InterlockingEditPart.VISUAL_ID:
			return false;
		case ConnectorEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return interlocking.diagram.part.InterlockingVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return interlocking.diagram.part.InterlockingVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return interlocking.diagram.part.InterlockingVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return interlocking.diagram.part.InterlockingVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return interlocking.diagram.part.InterlockingVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return interlocking.diagram.part.InterlockingVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
