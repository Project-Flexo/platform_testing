/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.compatibility.common.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the type of test with purpose of asserting GAS requirements.
 *
 * <p>The Google Automotive Services (GAS) Partner Requirements are a set of requirements for an
 * Android Automotive device implementation to properly integrate and be compatible with GAS.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface GasTest {
    // The GAS requirement ID the GasTest applies to.
    // Example: @GasTest(requirement = "G-0-000")
    String requirement();

    // The minimum GAS software requirement version the GasTest applies to.
    // Example: @GasTest(requirement = "G-0-000", minSoftwareVersion = 0.1)
    double minSoftwareVersion() default 0;

    // The maximum GAS software requirement version the GasTest applies to.
    // Example: @GasTest(requirement = "G-0-000", maxSoftwareVersion = 0.1)
    double maxSoftwareVersion() default 0;

    // The minimum GAS hardware requirement version the GasTest applies to.
    // Example: @GasTest(requirement = "G-0-000", minHardwareVersion = 0.1)
    double minHardwareVersion() default 0;

    // The maximum GAS hardware requirement version the GasTest applies to.
    // Example: @GasTest(requirement = "G-0-000", maxHardwareVersion = 0.1)
    double maxHardwareVersion() default 0;
}
