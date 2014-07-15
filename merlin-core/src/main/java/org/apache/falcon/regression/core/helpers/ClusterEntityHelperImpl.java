/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.falcon.regression.core.helpers;

import org.apache.falcon.regression.core.interfaces.IEntityManagerHelper;
import org.apache.falcon.regression.core.response.InstancesSummaryResult;
import org.apache.falcon.regression.core.response.ProcessInstancesResult;
import org.apache.falcon.regression.core.response.ServiceResponse;
import org.apache.falcon.regression.core.util.Util;
import org.apache.falcon.regression.core.util.Util.URLS;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;

public class ClusterEntityHelperImpl extends IEntityManagerHelper {


    private static final String INVALID_ERR = "Not Valid for Cluster Entity";
    private static final Logger logger = Logger.getLogger(ClusterEntityHelperImpl.class);

    public ClusterEntityHelperImpl(String prefix) {
        super(prefix);
    }

    public String getEntityType() {
        return "cluster";
    }

    public String getEntityName(String entity) {
        return Util.readClusterName(entity);
    }

    public ServiceResponse getStatus(URLS url, String data, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    public ServiceResponse resume(URLS url, String data, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    public ServiceResponse schedule(URLS url, String data, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    public ServiceResponse submitAndSchedule(URLS url, String data, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    public ServiceResponse suspend(URLS url, String data, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ProcessInstancesResult getRunningInstance(
        URLS processRunningInstance, String name, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ProcessInstancesResult getProcessInstanceStatus(
        String readEntityName, String params, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }


    public ProcessInstancesResult getProcessInstanceSuspend(
        String readEntityName, String params, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ServiceResponse update(String oldEntity, String newEntity, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ServiceResponse update(String oldEntity, String newEntity, String updateTime,
                                  String user) throws IOException {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ProcessInstancesResult getProcessInstanceKill(String readEntityName,
                                                         String string, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ProcessInstancesResult getProcessInstanceRerun(
        String readEntityName, String string, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public ProcessInstancesResult getProcessInstanceResume(
        String readEntityName, String string, String user) {
        throw new UnsupportedOperationException(INVALID_ERR);
    }

    @Override
    public InstancesSummaryResult getInstanceSummary(String readEntityName,
                                                     String string
    ) throws
        IOException, URISyntaxException {
        logger.info(INVALID_ERR);
        return null;
    }

}
