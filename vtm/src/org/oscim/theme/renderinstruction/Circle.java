/*
 * Copyright 2010, 2011, 2012 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.oscim.theme.renderinstruction;

import org.oscim.theme.IRenderCallback;


/**
 * Represents a round area on the map.
 */
public final class Circle extends RenderInstruction {


	public final int level;

	public final int fill;
	public final int outline;
	public final float radius;
	public  float renderRadius;
	public final boolean scaleRadius;
	public final float strokeWidth;

	public Circle(Float radius, boolean scaleRadius, int fill, int stroke,
			float strokeWidth, int level) {
		super();

		this.radius = radius.floatValue();
		this.scaleRadius = scaleRadius;

		this.fill = fill;
		this.outline = stroke;

		this.strokeWidth = strokeWidth;
		this.level = level;

//if (!mScaleRadius) {
//	mRenderRadius = mRadius;
//	if (mOutline != null) {
//		mOutline.setStrokeWidth(mStrokeWidth);
//	}
//}
	}

	@Override
	public void renderNode(IRenderCallback renderCallback) {
			renderCallback.renderPointOfInterestCircle(this, this.level);
	}
}
