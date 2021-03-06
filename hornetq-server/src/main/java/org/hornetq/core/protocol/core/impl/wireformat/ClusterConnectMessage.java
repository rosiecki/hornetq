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

package org.hornetq.core.protocol.core.impl.wireformat;

import org.hornetq.api.core.HornetQBuffer;
import org.hornetq.core.protocol.core.impl.PacketImpl;

public class ClusterConnectMessage extends PacketImpl
{
   private String clusterUser;
   private String clusterPassword;

   public ClusterConnectMessage()
   {
      super(CLUSTER_CONNECT);
   }

   public ClusterConnectMessage(String clusterUser, String clusterPassword)
   {
      super(CLUSTER_CONNECT);
      this.clusterUser = clusterUser;
      this.clusterPassword = clusterPassword;
   }

   @Override
   public void encodeRest(final HornetQBuffer buffer)
   {
      buffer.writeString(clusterUser);
      buffer.writeString(clusterPassword);
   }

   @Override
   public void decodeRest(final HornetQBuffer buffer)
   {
      clusterUser = buffer.readString();
      clusterPassword = buffer.readString();
   }



   public String getClusterUser()
   {
      return clusterUser;
   }

   public String getClusterPassword()
   {
      return clusterPassword;
   }
}
