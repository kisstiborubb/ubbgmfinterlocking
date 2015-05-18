/*
 * 
 */
package interlocking.diagram.navigator;

import interlocking.diagram.edit.parts.ConnectorEditPart;
import interlocking.diagram.edit.parts.ConnectorNameEditPart;
import interlocking.diagram.edit.parts.InterlockingConnectionEditPart;
import interlocking.diagram.edit.parts.InterlockingEditPart;
import interlocking.diagram.edit.parts.InterlockingElementEditPart;
import interlocking.diagram.edit.parts.InterlockingElementNameEditPart;
import interlocking.diagram.edit.parts.SegmentEditPart;
import interlocking.diagram.edit.parts.SegmentNameEditPart;
import interlocking.diagram.edit.parts.SemaphoreEditPart;
import interlocking.diagram.edit.parts.SemaphoreNameEditPart;
import interlocking.diagram.edit.parts.SwichEditPart;
import interlocking.diagram.edit.parts.SwichNameEditPart;
import interlocking.diagram.part.InterlockingDiagramEditorPlugin;
import interlocking.diagram.part.InterlockingVisualIDRegistry;
import interlocking.diagram.providers.InterlockingElementTypes;
import interlocking.diagram.providers.InterlockingParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class InterlockingNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		InterlockingDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		InterlockingDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof InterlockingNavigatorItem
				&& !isOwnView(((InterlockingNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof InterlockingNavigatorGroup) {
			InterlockingNavigatorGroup group = (InterlockingNavigatorGroup) element;
			return InterlockingDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof InterlockingNavigatorItem) {
			InterlockingNavigatorItem navigatorItem = (InterlockingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (InterlockingVisualIDRegistry.getVisualID(view)) {
		case InterlockingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?ro.ubblcuj.cs.master.model.interlocking?Interlocking", InterlockingElementTypes.Interlocking_1000); //$NON-NLS-1$
		case SegmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ro.ubblcuj.cs.master.model.interlocking?Segment", InterlockingElementTypes.Segment_2001); //$NON-NLS-1$
		case SemaphoreEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ro.ubblcuj.cs.master.model.interlocking?Semaphore", InterlockingElementTypes.Semaphore_2002); //$NON-NLS-1$
		case SwichEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ro.ubblcuj.cs.master.model.interlocking?Swich", InterlockingElementTypes.Swich_2003); //$NON-NLS-1$
		case InterlockingElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ro.ubblcuj.cs.master.model.interlocking?InterlockingElement", InterlockingElementTypes.InterlockingElement_2004); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ro.ubblcuj.cs.master.model.interlocking?Connector", InterlockingElementTypes.Connector_3001); //$NON-NLS-1$
		case InterlockingConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ro.ubblcuj.cs.master.model.interlocking?InterlockingConnection", InterlockingElementTypes.InterlockingConnection_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = InterlockingDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& InterlockingElementTypes.isKnownElementType(elementType)) {
			image = InterlockingElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof InterlockingNavigatorGroup) {
			InterlockingNavigatorGroup group = (InterlockingNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof InterlockingNavigatorItem) {
			InterlockingNavigatorItem navigatorItem = (InterlockingNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (InterlockingVisualIDRegistry.getVisualID(view)) {
		case InterlockingEditPart.VISUAL_ID:
			return getInterlocking_1000Text(view);
		case SegmentEditPart.VISUAL_ID:
			return getSegment_2001Text(view);
		case SemaphoreEditPart.VISUAL_ID:
			return getSemaphore_2002Text(view);
		case SwichEditPart.VISUAL_ID:
			return getSwich_2003Text(view);
		case InterlockingElementEditPart.VISUAL_ID:
			return getInterlockingElement_2004Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_3001Text(view);
		case InterlockingConnectionEditPart.VISUAL_ID:
			return getInterlockingConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getInterlocking_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSegment_2001Text(View view) {
		IParser parser = InterlockingParserProvider.getParser(
				InterlockingElementTypes.Segment_2001,
				view.getElement() != null ? view.getElement() : view,
				InterlockingVisualIDRegistry
						.getType(SegmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InterlockingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSemaphore_2002Text(View view) {
		IParser parser = InterlockingParserProvider.getParser(
				InterlockingElementTypes.Semaphore_2002,
				view.getElement() != null ? view.getElement() : view,
				InterlockingVisualIDRegistry
						.getType(SemaphoreNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InterlockingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwich_2003Text(View view) {
		IParser parser = InterlockingParserProvider.getParser(
				InterlockingElementTypes.Swich_2003,
				view.getElement() != null ? view.getElement() : view,
				InterlockingVisualIDRegistry
						.getType(SwichNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InterlockingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterlockingElement_2004Text(View view) {
		IParser parser = InterlockingParserProvider.getParser(
				InterlockingElementTypes.InterlockingElement_2004, view
						.getElement() != null ? view.getElement() : view,
				InterlockingVisualIDRegistry
						.getType(InterlockingElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InterlockingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnector_3001Text(View view) {
		IParser parser = InterlockingParserProvider.getParser(
				InterlockingElementTypes.Connector_3001,
				view.getElement() != null ? view.getElement() : view,
				InterlockingVisualIDRegistry
						.getType(ConnectorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			InterlockingDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterlockingConnection_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return InterlockingEditPart.MODEL_ID
				.equals(InterlockingVisualIDRegistry.getModelID(view));
	}

}
