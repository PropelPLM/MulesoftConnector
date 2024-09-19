package com.mulesoft.connectors.propel.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.propel.internal.metadata.GetServicesApexrestNamespaceApiV2ItemItemNumberOutputMetadataResolver;
import com.mulesoft.connectors.propel.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.propel.internal.operation.refinement.GetServicesApexrestNamespaceApiV2ItemItemNumberOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetServicesApexrestNamespaceApiV2ItemItemNumberOperation
    extends GetServicesApexrestNamespaceApiV2ItemItemNumberOperationRefinement {
  public GetServicesApexrestNamespaceApiV2ItemItemNumberOperation() {
    super();
  }

  public GetServicesApexrestNamespaceApiV2ItemItemNumberOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Get Item and all item revisions.
   *
   * <p>This operation makes an HTTP GET request to the
   * /services/apexrest/{namespace}/api/v2/item/{itemNumber} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param namespaceUriParam namespace
   * @param itemNumberUriParam Item Number
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @Alias("get-item")
  @DisplayName("Get Item")
  @Summary("Get Item and all item revisions.")
  @MediaType("application/json")
  @OutputResolver(
      output = GetServicesApexrestNamespaceApiV2ItemItemNumberOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getServicesApexrestNamespaceApiV2ItemItemNumber(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("namespace") String namespaceUriParam,
      @DisplayName("Item Number") String itemNumberUriParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.getServicesApexrestNamespaceApiV2ItemItemNumber(
        config, connection, namespaceUriParam, itemNumberUriParam, parameters, overrides, callback);
  }
}
