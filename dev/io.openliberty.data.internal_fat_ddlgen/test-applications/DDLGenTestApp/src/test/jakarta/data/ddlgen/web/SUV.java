/*******************************************************************************
 * Copyright (c) 2024 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package test.jakarta.data.ddlgen.web;

import jakarta.persistence.Entity;

/**
 * Inherits from Auto which is not itself an entity but a mapped superclass
 */
@Entity
public class SUV extends Auto {
    public boolean hatchback;

    public static SUV of(String vin, String make, String model, int modelYear, int odometer, float price, boolean hatchback) {
        SUV inst = new SUV();
        inst.vin = vin;
        inst.make = make;
        inst.model = model;
        inst.modelYear = modelYear;
        inst.odometer = odometer;
        inst.price = price;
        inst.hatchback = hatchback;
        return inst;
    }
}
