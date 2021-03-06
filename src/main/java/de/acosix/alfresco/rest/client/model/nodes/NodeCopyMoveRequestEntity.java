/*
 * Copyright 2019 Acosix GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.acosix.alfresco.rest.client.model.nodes;

/**
 * @author Axel Faust
 */
public class NodeCopyMoveRequestEntity
{

    private String targetParentId;

    private String name;

    /**
     * Creates a new instance of this value class.
     */
    public NodeCopyMoveRequestEntity()
    {
        // NO-OP
    }

    /**
     * Creates a new instance of this value class as a full (recursive) copy of the provided reference / template.
     *
     * @param reference
     *            the reference / template for the new instance
     */
    public NodeCopyMoveRequestEntity(final NodeCopyMoveRequestEntity reference)
    {
        this.targetParentId = reference.getTargetParentId();
        this.name = reference.getName();
    }

    /**
     * @return the targetParentId
     */
    public String getTargetParentId()
    {
        return this.targetParentId;
    }

    /**
     * @param targetParentId
     *            the targetParentId to set
     */
    public void setTargetParentId(final String targetParentId)
    {
        this.targetParentId = targetParentId;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name)
    {
        this.name = name;
    }

}
