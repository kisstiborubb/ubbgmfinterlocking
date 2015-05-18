/*
 * 
 */
package interlocking.diagram.part;

import interlocking.Connector;
import interlocking.Interlocking;
import interlocking.InterlockingConnection;
import interlocking.InterlockingElement;
import interlocking.InterlockingPackage;
import interlocking.Segment;
import interlocking.Semaphore;
import interlocking.Swich;
import interlocking.diagram.edit.parts.ConnectorEditPart;
import interlocking.diagram.edit.parts.InterlockingConnectionEditPart;
import interlocking.diagram.edit.parts.InterlockingEditPart;
import interlocking.diagram.edit.parts.InterlockingElementEditPart;
import interlocking.diagram.edit.parts.InterlockingElementInterlockingElementConnectorsCompartmentEditPart;
import interlocking.diagram.edit.parts.SegmentEditPart;
import interlocking.diagram.edit.parts.SegmentSegmentConnectorsCompartmentEditPart;
import interlocking.diagram.edit.parts.SemaphoreEditPart;
import interlocking.diagram.edit.parts.SemaphoreSemaphoreConnectorsCompartmentEditPart;
import interlocking.diagram.edit.parts.SwichEditPart;
import interlocking.diagram.edit.parts.SwichSwichConnectorsCompartmentEditPart;
import interlocking.diagram.providers.InterlockingElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class InterlockingDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingNodeDescriptor> getSemanticChildren(View view) {
		switch (InterlockingVisualIDRegistry.getVisualID(view)) {
		case InterlockingEditPart.VISUAL_ID:
			return getInterlocking_1000SemanticChildren(view);
		case SegmentSegmentConnectorsCompartmentEditPart.VISUAL_ID:
			return getSegmentSegmentConnectorsCompartment_7001SemanticChildren(view);
		case SemaphoreSemaphoreConnectorsCompartmentEditPart.VISUAL_ID:
			return getSemaphoreSemaphoreConnectorsCompartment_7002SemanticChildren(view);
		case SwichSwichConnectorsCompartmentEditPart.VISUAL_ID:
			return getSwichSwichConnectorsCompartment_7003SemanticChildren(view);
		case InterlockingElementInterlockingElementConnectorsCompartmentEditPart.VISUAL_ID:
			return getInterlockingElementInterlockingElementConnectorsCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingNodeDescriptor> getInterlocking_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Interlocking modelElement = (Interlocking) view.getElement();
		LinkedList<InterlockingNodeDescriptor> result = new LinkedList<InterlockingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			InterlockingElement childElement = (InterlockingElement) it.next();
			int visualID = InterlockingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SegmentEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == SemaphoreEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == SwichEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == InterlockingElementEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingNodeDescriptor> getSegmentSegmentConnectorsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Segment modelElement = (Segment) containerView.getElement();
		LinkedList<InterlockingNodeDescriptor> result = new LinkedList<InterlockingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = InterlockingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingNodeDescriptor> getSemaphoreSemaphoreConnectorsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Semaphore modelElement = (Semaphore) containerView.getElement();
		LinkedList<InterlockingNodeDescriptor> result = new LinkedList<InterlockingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = InterlockingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingNodeDescriptor> getSwichSwichConnectorsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Swich modelElement = (Swich) containerView.getElement();
		LinkedList<InterlockingNodeDescriptor> result = new LinkedList<InterlockingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = InterlockingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingNodeDescriptor> getInterlockingElementInterlockingElementConnectorsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InterlockingElement modelElement = (InterlockingElement) containerView
				.getElement();
		LinkedList<InterlockingNodeDescriptor> result = new LinkedList<InterlockingNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = InterlockingVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new InterlockingNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getContainedLinks(View view) {
		switch (InterlockingVisualIDRegistry.getVisualID(view)) {
		case InterlockingEditPart.VISUAL_ID:
			return getInterlocking_1000ContainedLinks(view);
		case SegmentEditPart.VISUAL_ID:
			return getSegment_2001ContainedLinks(view);
		case SemaphoreEditPart.VISUAL_ID:
			return getSemaphore_2002ContainedLinks(view);
		case SwichEditPart.VISUAL_ID:
			return getSwich_2003ContainedLinks(view);
		case InterlockingElementEditPart.VISUAL_ID:
			return getInterlockingElement_2004ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_3001ContainedLinks(view);
		case InterlockingConnectionEditPart.VISUAL_ID:
			return getInterlockingConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getIncomingLinks(View view) {
		switch (InterlockingVisualIDRegistry.getVisualID(view)) {
		case SegmentEditPart.VISUAL_ID:
			return getSegment_2001IncomingLinks(view);
		case SemaphoreEditPart.VISUAL_ID:
			return getSemaphore_2002IncomingLinks(view);
		case SwichEditPart.VISUAL_ID:
			return getSwich_2003IncomingLinks(view);
		case InterlockingElementEditPart.VISUAL_ID:
			return getInterlockingElement_2004IncomingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_3001IncomingLinks(view);
		case InterlockingConnectionEditPart.VISUAL_ID:
			return getInterlockingConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getOutgoingLinks(View view) {
		switch (InterlockingVisualIDRegistry.getVisualID(view)) {
		case SegmentEditPart.VISUAL_ID:
			return getSegment_2001OutgoingLinks(view);
		case SemaphoreEditPart.VISUAL_ID:
			return getSemaphore_2002OutgoingLinks(view);
		case SwichEditPart.VISUAL_ID:
			return getSwich_2003OutgoingLinks(view);
		case InterlockingElementEditPart.VISUAL_ID:
			return getInterlockingElement_2004OutgoingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_3001OutgoingLinks(view);
		case InterlockingConnectionEditPart.VISUAL_ID:
			return getInterlockingConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlocking_1000ContainedLinks(
			View view) {
		Interlocking modelElement = (Interlocking) view.getElement();
		LinkedList<InterlockingLinkDescriptor> result = new LinkedList<InterlockingLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterlockingConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSegment_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSemaphore_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSwich_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlockingElement_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getConnector_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlockingConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSegment_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSemaphore_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSwich_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlockingElement_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getConnector_3001IncomingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<InterlockingLinkDescriptor> result = new LinkedList<InterlockingLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterlockingConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlockingConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSegment_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSemaphore_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getSwich_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlockingElement_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getConnector_3001OutgoingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<InterlockingLinkDescriptor> result = new LinkedList<InterlockingLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterlockingConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InterlockingLinkDescriptor> getInterlockingConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<InterlockingLinkDescriptor> getContainedTypeModelFacetLinks_InterlockingConnection_4001(
			Interlocking container) {
		LinkedList<InterlockingLinkDescriptor> result = new LinkedList<InterlockingLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InterlockingConnection) {
				continue;
			}
			InterlockingConnection link = (InterlockingConnection) linkObject;
			if (InterlockingConnectionEditPart.VISUAL_ID != InterlockingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connector dst = link.getTarget();
			Connector src = link.getSource();
			result.add(new InterlockingLinkDescriptor(src, dst, link,
					InterlockingElementTypes.InterlockingConnection_4001,
					InterlockingConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InterlockingLinkDescriptor> getIncomingTypeModelFacetLinks_InterlockingConnection_4001(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<InterlockingLinkDescriptor> result = new LinkedList<InterlockingLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != InterlockingPackage.eINSTANCE
					.getInterlockingConnection_Target()
					|| false == setting.getEObject() instanceof InterlockingConnection) {
				continue;
			}
			InterlockingConnection link = (InterlockingConnection) setting
					.getEObject();
			if (InterlockingConnectionEditPart.VISUAL_ID != InterlockingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connector src = link.getSource();
			result.add(new InterlockingLinkDescriptor(src, target, link,
					InterlockingElementTypes.InterlockingConnection_4001,
					InterlockingConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<InterlockingLinkDescriptor> getOutgoingTypeModelFacetLinks_InterlockingConnection_4001(
			Connector source) {
		Interlocking container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Interlocking) {
				container = (Interlocking) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<InterlockingLinkDescriptor> result = new LinkedList<InterlockingLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InterlockingConnection) {
				continue;
			}
			InterlockingConnection link = (InterlockingConnection) linkObject;
			if (InterlockingConnectionEditPart.VISUAL_ID != InterlockingVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connector dst = link.getTarget();
			Connector src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new InterlockingLinkDescriptor(src, dst, link,
					InterlockingElementTypes.InterlockingConnection_4001,
					InterlockingConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<InterlockingNodeDescriptor> getSemanticChildren(View view) {
			return InterlockingDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InterlockingLinkDescriptor> getContainedLinks(View view) {
			return InterlockingDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InterlockingLinkDescriptor> getIncomingLinks(View view) {
			return InterlockingDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<InterlockingLinkDescriptor> getOutgoingLinks(View view) {
			return InterlockingDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
