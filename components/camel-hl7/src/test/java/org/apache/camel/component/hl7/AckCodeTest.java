/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.hl7;

import ca.uhn.hl7v2.AcknowledgmentCode;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class AckCodeTest extends CamelTestSupport {

    @Test
    public void verifyAcknowledgmentCodeConversion() {
        assertEquals("Not the expected same count of enum members", AckCode.values().length, AcknowledgmentCode.values().length);

        assertSame("Not the expect 'Application Accept' enum member", AcknowledgmentCode.AA, AckCode.AA.asAcknowledgmentCode());
        assertSame("Not the expect 'Application Error' enum member", AcknowledgmentCode.AE, AckCode.AE.asAcknowledgmentCode());
        assertSame("Not the expect 'Application Reject' enum member", AcknowledgmentCode.AR, AckCode.AR.asAcknowledgmentCode());
        assertSame("Not the expect 'Commit Accept' enum member", AcknowledgmentCode.CA, AckCode.CA.asAcknowledgmentCode());
        assertSame("Not the expect 'Commit Error' enum member", AcknowledgmentCode.CE, AckCode.CE.asAcknowledgmentCode());
        assertSame("Not the expect 'Commit Reject' enum member", AcknowledgmentCode.CR, AckCode.CR.asAcknowledgmentCode());
    }

}
