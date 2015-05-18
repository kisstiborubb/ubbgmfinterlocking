/*
 * 
 */
package interlocking.diagram.providers;

import interlocking.InterlockingPackage;
import interlocking.diagram.edit.parts.ConnectorNameEditPart;
import interlocking.diagram.edit.parts.InterlockingElementNameEditPart;
import interlocking.diagram.edit.parts.SegmentNameEditPart;
import interlocking.diagram.edit.parts.SemaphoreNameEditPart;
import interlocking.diagram.edit.parts.SwichNameEditPart;
import interlocking.diagram.parsers.MessageFormatParser;
import interlocking.diagram.part.InterlockingVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InterlockingParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser segmentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSegmentName_5002Parser() {
		if (segmentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { InterlockingPackage.eINSTANCE
					.getInterlockingElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			segmentName_5002Parser = parser;
		}
		return segmentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser semaphoreName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSemaphoreName_5003Parser() {
		if (semaphoreName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { InterlockingPackage.eINSTANCE
					.getInterlockingElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			semaphoreName_5003Parser = parser;
		}
		return semaphoreName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser swichName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSwichName_5004Parser() {
		if (swichName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { InterlockingPackage.eINSTANCE
					.getInterlockingElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			swichName_5004Parser = parser;
		}
		return swichName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser interlockingElementName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInterlockingElementName_5005Parser() {
		if (interlockingElementName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { InterlockingPackage.eINSTANCE
					.getInterlockingElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interlockingElementName_5005Parser = parser;
		}
		return interlockingElementName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectorName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorName_5001Parser() {
		if (connectorName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { InterlockingPackage.eINSTANCE
					.getConnector_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectorName_5001Parser = parser;
		}
		return connectorName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SegmentNameEditPart.VISUAL_ID:
			return getSegmentName_5002Parser();
		case SemaphoreNameEditPart.VISUAL_ID:
			return getSemaphoreName_5003Parser();
		case SwichNameEditPart.VISUAL_ID:
			return getSwichName_5004Parser();
		case InterlockingElementNameEditPart.VISUAL_ID:
			return getInterlockingElementName_5005Parser();
		case ConnectorNameEditPart.VISUAL_ID:
			return getConnectorName_5001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(InterlockingVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(InterlockingVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (InterlockingElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
