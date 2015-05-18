/*
 * 
 */
package interlocking.diagram.edit.parts;

import interlocking.diagram.edit.policies.InterlockingConnectionItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InterlockingConnectionEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public InterlockingConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InterlockingConnectionItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new InterlockingConnectionFigure();
	}

	/**
	 * @generated
	 */
	public InterlockingConnectionFigure getPrimaryShape() {
		return (InterlockingConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InterlockingConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InterlockingConnectionFigure() {
			this.setLineWidth(5);
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
