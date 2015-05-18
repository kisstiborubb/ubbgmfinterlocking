/*
 * 
 */
package interlocking.diagram.part;

import interlocking.diagram.providers.InterlockingElementTypes;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class InterlockingPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createConnector1CreationTool());
		paletteContainer.add(createInterlockingElement2CreationTool());
		paletteContainer.add(createSegment3CreationTool());
		paletteContainer.add(createSemaphore4CreationTool());
		paletteContainer.add(createSwich5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInterlockingConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Connector1CreationTool_title,
				Messages.Connector1CreationTool_desc,
				Collections
						.singletonList(InterlockingElementTypes.Connector_3001));
		entry.setId("createConnector1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InterlockingElementTypes
				.getImageDescriptor(InterlockingElementTypes.Connector_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterlockingElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.InterlockingElement2CreationTool_title,
				Messages.InterlockingElement2CreationTool_desc,
				Collections
						.singletonList(InterlockingElementTypes.InterlockingElement_2004));
		entry.setId("createInterlockingElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InterlockingElementTypes
				.getImageDescriptor(InterlockingElementTypes.InterlockingElement_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSegment3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Segment3CreationTool_title,
				Messages.Segment3CreationTool_desc,
				Collections
						.singletonList(InterlockingElementTypes.Segment_2001));
		entry.setId("createSegment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InterlockingElementTypes
				.getImageDescriptor(InterlockingElementTypes.Segment_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSemaphore4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Semaphore4CreationTool_title,
				Messages.Semaphore4CreationTool_desc,
				Collections
						.singletonList(InterlockingElementTypes.Semaphore_2002));
		entry.setId("createSemaphore4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InterlockingElementTypes
				.getImageDescriptor(InterlockingElementTypes.Semaphore_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwich5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Swich5CreationTool_title,
				Messages.Swich5CreationTool_desc,
				Collections.singletonList(InterlockingElementTypes.Swich_2003));
		entry.setId("createSwich5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InterlockingElementTypes
				.getImageDescriptor(InterlockingElementTypes.Swich_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterlockingConnection1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.InterlockingConnection1CreationTool_title,
				Messages.InterlockingConnection1CreationTool_desc,
				Collections
						.singletonList(InterlockingElementTypes.InterlockingConnection_4001));
		entry.setId("createInterlockingConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(InterlockingElementTypes
				.getImageDescriptor(InterlockingElementTypes.InterlockingConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
