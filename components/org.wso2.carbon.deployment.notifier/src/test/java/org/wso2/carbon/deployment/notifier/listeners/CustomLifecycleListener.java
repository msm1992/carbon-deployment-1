/*
*  Copyright (c) $today.year, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.wso2.carbon.deployment.notifier.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.carbon.deployment.Artifact;
import org.wso2.carbon.deployment.LifecycleEvent;
import org.wso2.carbon.deployment.LifecycleListener;

public class CustomLifecycleListener implements LifecycleListener {

    private static final Logger logger = LoggerFactory.getLogger(CustomLifecycleListener.class);

    @Override
    public void lifecycleEvent(LifecycleEvent event) {
        Artifact artifact = event.getArtifact();
        String artifactName = artifact.getName();

        LifecycleEvent.RESULT deploymentResult = event.getDeploymentResult();

        logger.info("{} event triggered for artifact: {}, with current deployment result: {} ", event.getState(),
                artifactName, deploymentResult);
    }
}