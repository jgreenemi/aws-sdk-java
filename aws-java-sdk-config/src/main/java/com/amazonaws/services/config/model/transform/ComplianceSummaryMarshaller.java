/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComplianceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComplianceSummaryMarshaller {

    private static final MarshallingInfo<StructuredPojo> COMPLIANTRESOURCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompliantResourceCount").build();
    private static final MarshallingInfo<StructuredPojo> NONCOMPLIANTRESOURCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonCompliantResourceCount").build();
    private static final MarshallingInfo<java.util.Date> COMPLIANCESUMMARYTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceSummaryTimestamp").build();

    private static final ComplianceSummaryMarshaller instance = new ComplianceSummaryMarshaller();

    public static ComplianceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComplianceSummary complianceSummary, ProtocolMarshaller protocolMarshaller) {

        if (complianceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(complianceSummary.getCompliantResourceCount(), COMPLIANTRESOURCECOUNT_BINDING);
            protocolMarshaller.marshall(complianceSummary.getNonCompliantResourceCount(), NONCOMPLIANTRESOURCECOUNT_BINDING);
            protocolMarshaller.marshall(complianceSummary.getComplianceSummaryTimestamp(), COMPLIANCESUMMARYTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
