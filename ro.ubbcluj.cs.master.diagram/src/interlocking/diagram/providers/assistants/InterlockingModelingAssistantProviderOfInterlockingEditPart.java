/*
 * 
 */
package interlocking.diagram.providers.assistants;

import interlocking.diagram.providers.InterlockingElementTypes;
import interlocking.diagram.providers.InterlockingModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class InterlockingModelingAssistantProviderOfInterlockingEditPart extends
		InterlockingModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(InterlockingElementTypes.Segment_2001);
		types.add(InterlockingElementTypes.Semaphore_2002);
		types.add(InterlockingElementTypes.Swich_2003);
		types.add(InterlockingElementTypes.InterlockingElement_2004);
		return types;
	}

}
