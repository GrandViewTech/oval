/*******************************************************************************
 * Portions created by Sebastian Thomschke are copyright (c) 2005-2017 Sebastian
 * Thomschke.
 * 
 * All Rights Reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Thomschke - initial implementation.
 *******************************************************************************/
package net.sf.oval.guard;

import net.sf.oval.exception.ConstraintsViolatedException;

/**
 * @author Sebastian Thomschke
 */
public interface ConstraintsViolatedListener {
    void onConstraintsViolatedException(ConstraintsViolatedException exception);
}
