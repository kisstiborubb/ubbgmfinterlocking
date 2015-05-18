package interlocking.diagram.edit.parts.custom;

 
import interlocking.diagram.edit.parts.ConnectorEditPart;
import interlocking.diagram.edit.parts.SegmentSegmentConnectorsCompartmentEditPart;

import java.util.List;

import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
 
public class SegmentCompartmentFigureListener implements FigureListener {
 
	private SegmentSegmentConnectorsCompartmentEditPart compartmentEditPart = null;
	private RoundedRectangle roundedRectangle = null;
 
	public static final double MARGIN = 20; // The margin to apply before drawing our operator
	public static final double R = 10; // The base length
	public static final double REF_W = 2 * MARGIN + R * 6; // Reference width
	public static final double REF_H = 2 * MARGIN + R * 5; // Reference height
 
	public SegmentCompartmentFigureListener(SegmentSegmentConnectorsCompartmentEditPart semaphoreSemaphoreContentsCompartmentEditPart, RoundedRectangle roundedRectangle) {
		this.compartmentEditPart = semaphoreSemaphoreContentsCompartmentEditPart;
		this.roundedRectangle = roundedRectangle;
	}
 
	@Override
	public void figureMoved(IFigure f) {
		ResizableCompartmentFigure figure = (ResizableCompartmentFigure) f;
		if (figure.getSize().width != 0) {
			IFigure contentPane = figure.getContentPane();
			Insets is = figure.getInsets();
			// Determine the scale to apply
			double xScale = ((double) figure.getSize().width - is.left - is.right) / REF_W;
			double yScale = ((double) figure.getSize().height - is.top - is.bottom) / REF_H;
 
			// Set the constraints (bounds) for the rounded rectangle
			Rectangle constraint = new Rectangle(
					(int) (R),
					(int) ((MARGIN) * yScale), 
					(int) (figure.getSize().width()-2*R),
					(int) (R * 5 * yScale));
			contentPane.setConstraint(roundedRectangle, constraint);
 
			// Set the constraints for the input and output nodes
			List<AbstractEditPart> childs = compartmentEditPart.getChildren();
			boolean firstInputProcessed = false;
			for (AbstractEditPart child : childs) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;
					if (gEditPart instanceof NodeEditPart) {
						constraint = new Rectangle(
								firstInputProcessed ? (int) (R) : (int) ((figure.getSize().width()-2*R)),
								(int) ((figure.getSize().height()/2) * yScale+R/2) ,
								(int) (R), 
								(int) (R));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
						firstInputProcessed = true; // This boolean heps to know if we process the first or the seconde operator input
					}
				}
			}
		}
	}
 
}