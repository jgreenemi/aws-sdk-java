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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters for an AUTOMATION task type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowAutomationParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowAutomationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of an SSM Automation document to use during task execution.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * Parameters for the AUTOMATION task.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * The version of an SSM Automation document to use during task execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of an SSM Automation document to use during task execution.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of an SSM Automation document to use during task execution.
     * </p>
     * 
     * @return The version of an SSM Automation document to use during task execution.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of an SSM Automation document to use during task execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of an SSM Automation document to use during task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowAutomationParameters withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * Parameters for the AUTOMATION task.
     * </p>
     * 
     * @return Parameters for the AUTOMATION task.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Parameters for the AUTOMATION task.
     * </p>
     * 
     * @param parameters
     *        Parameters for the AUTOMATION task.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Parameters for the AUTOMATION task.
     * </p>
     * 
     * @param parameters
     *        Parameters for the AUTOMATION task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowAutomationParameters withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public MaintenanceWindowAutomationParameters addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowAutomationParameters clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowAutomationParameters == false)
            return false;
        MaintenanceWindowAutomationParameters other = (MaintenanceWindowAutomationParameters) obj;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowAutomationParameters clone() {
        try {
            return (MaintenanceWindowAutomationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowAutomationParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
