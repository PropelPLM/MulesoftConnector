package com.mulesoft.connectors.propel.internal.connection.provider;

import com.mulesoft.connectors.propel.internal.connection.provider.refinement.OauthConnectionProviderRefinement;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.connectivity.oauth.ClientCredentials;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * This is the last layer of the connection provider generation gap pattern. It is what finally gets
 * exposed as the connection provider, including all customizations made in the refinement layer.
 */
@Alias("oauth")
@DisplayName("Oauth Connection Provider")
@ClientCredentials(tokenUrl = "https://salesforce-access-token-uri", defaultScopes = "")
public class OauthConnectionProvider extends OauthConnectionProviderRefinement {}
