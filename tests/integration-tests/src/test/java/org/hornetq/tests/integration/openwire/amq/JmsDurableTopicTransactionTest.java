/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.hornetq.tests.integration.openwire.amq;

import javax.jms.DeliveryMode;

/**
 * adapted from: org.apache.activemq.JmsDurableTopicTransactionTest
 *
 * @author <a href="mailto:hgao@redhat.com">Howard Gao</a>
 *
 */
public class JmsDurableTopicTransactionTest extends JmsTopicTransactionTest
{

   /**
    * @see JmsTransactionTestSupport#getJmsResourceProvider()
    */
   protected JmsResourceProvider getJmsResourceProvider()
   {
      JmsResourceProvider provider = new JmsResourceProvider();
      provider.setTopic(true);
      provider.setDeliveryMode(DeliveryMode.PERSISTENT);
      provider.setClientID(getClass().getName());
      provider.setDurableName("JmsDurableTopicTransactionTest");
      return provider;
   }

}
