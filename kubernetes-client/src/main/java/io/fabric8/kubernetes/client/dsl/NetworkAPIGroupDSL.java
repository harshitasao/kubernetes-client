/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.dsl;

import io.fabric8.kubernetes.api.model.networking.DoneableNetworkPolicy;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicy;
import io.fabric8.kubernetes.api.model.networking.NetworkPolicyList;
import io.fabric8.kubernetes.api.model.networking.v1beta1.DoneableIngress;
import io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress;
import io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList;
import io.fabric8.kubernetes.client.Client;

public interface NetworkAPIGroupDSL extends Client {

  MixedOperation<NetworkPolicy, NetworkPolicyList, DoneableNetworkPolicy, Resource<NetworkPolicy, DoneableNetworkPolicy>> networkPolicies();
  MixedOperation<Ingress, IngressList, DoneableIngress, Resource<Ingress, DoneableIngress>> ingress();

  MixedOperation<Ingress, IngressList, DoneableIngress, Resource<Ingress, DoneableIngress>> ingresses();
}
