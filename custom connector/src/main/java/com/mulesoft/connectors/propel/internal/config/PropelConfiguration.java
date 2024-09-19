package com.mulesoft.connectors.propel.internal.config;

import com.mulesoft.connectors.propel.internal.config.refinement.PropelConfigurationRefinement;
import com.mulesoft.connectors.propel.internal.connection.provider.OauthConnectionProvider;
import com.mulesoft.connectors.propel.internal.operation.GetServicesApexrestNamespaceApiV2ItemItemNumberOperation;
import com.mulesoft.connectors.propel.internal.operation.GetServicesApexrestNamespaceApiV3ChangeItemNumberOperation;
import com.mulesoft.connectors.propel.internal.operation.PutServicesApexrestNamespaceApiV2ItemItemNumberOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.sdk.api.annotation.JavaVersionSupport;
import org.mule.sdk.api.meta.JavaVersion;

@Configuration
@Operations({
  GetServicesApexrestNamespaceApiV2ItemItemNumberOperation.class,
  PutServicesApexrestNamespaceApiV2ItemItemNumberOperation.class,
  GetServicesApexrestNamespaceApiV3ChangeItemNumberOperation.class
})
@ConnectionProviders({OauthConnectionProvider.class})
@JavaVersionSupport({JavaVersion.JAVA_8, JavaVersion.JAVA_11, JavaVersion.JAVA_17})
public class PropelConfiguration extends PropelConfigurationRefinement {}
