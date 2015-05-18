/*
 * 
 */
package interlocking.diagram.providers;

import interlocking.InterlockingPackage;
import interlocking.diagram.edit.parts.ConnectorEditPart;
import interlocking.diagram.edit.parts.InterlockingConnectionEditPart;
import interlocking.diagram.edit.parts.InterlockingEditPart;
import interlocking.diagram.edit.parts.InterlockingElementEditPart;
import interlocking.diagram.edit.parts.SegmentEditPart;
import interlocking.diagram.edit.parts.SemaphoreEditPart;
import interlocking.diagram.edit.parts.SwichEditPart;
import interlocking.diagram.part.InterlockingDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class InterlockingElementTypes {

	/**
	 * @generated
	 */
	private InterlockingElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			InterlockingDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Interlocking_1000 = getElementType("ro.ubbcluj.cs.master.diagram.Interlocking_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Segment_2001 = getElementType("ro.ubbcluj.cs.master.diagram.Segment_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Semaphore_2002 = getElementType("ro.ubbcluj.cs.master.diagram.Semaphore_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Swich_2003 = getElementType("ro.ubbcluj.cs.master.diagram.Swich_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InterlockingElement_2004 = getElementType("ro.ubbcluj.cs.master.diagram.InterlockingElement_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connector_3001 = getElementType("ro.ubbcluj.cs.master.diagram.Connector_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InterlockingConnection_4001 = getElementType("ro.ubbcluj.cs.master.diagram.InterlockingConnection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Interlocking_1000,
					InterlockingPackage.eINSTANCE.getInterlocking());

			elements.put(Segment_2001,
					InterlockingPackage.eINSTANCE.getSegment());

			elements.put(Semaphore_2002,
					InterlockingPackage.eINSTANCE.getSemaphore());

			elements.put(Swich_2003, InterlockingPackage.eINSTANCE.getSwich());

			elements.put(InterlockingElement_2004,
					InterlockingPackage.eINSTANCE.getInterlockingElement());

			elements.put(Connector_3001,
					InterlockingPackage.eINSTANCE.getConnector());

			elements.put(InterlockingConnection_4001,
					InterlockingPackage.eINSTANCE.getInterlockingConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Interlocking_1000);
			KNOWN_ELEMENT_TYPES.add(Segment_2001);
			KNOWN_ELEMENT_TYPES.add(Semaphore_2002);
			KNOWN_ELEMENT_TYPES.add(Swich_2003);
			KNOWN_ELEMENT_TYPES.add(InterlockingElement_2004);
			KNOWN_ELEMENT_TYPES.add(Connector_3001);
			KNOWN_ELEMENT_TYPES.add(InterlockingConnection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case InterlockingEditPart.VISUAL_ID:
			return Interlocking_1000;
		case SegmentEditPart.VISUAL_ID:
			return Segment_2001;
		case SemaphoreEditPart.VISUAL_ID:
			return Semaphore_2002;
		case SwichEditPart.VISUAL_ID:
			return Swich_2003;
		case InterlockingElementEditPart.VISUAL_ID:
			return InterlockingElement_2004;
		case ConnectorEditPart.VISUAL_ID:
			return Connector_3001;
		case InterlockingConnectionEditPart.VISUAL_ID:
			return InterlockingConnection_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return interlocking.diagram.providers.InterlockingElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return interlocking.diagram.providers.InterlockingElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return interlocking.diagram.providers.InterlockingElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
