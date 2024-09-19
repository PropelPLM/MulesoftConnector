package com.mulesoft.connectors.propel.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.propel.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.propel.internal.metadata.PutServicesApexrestNamespaceApiV2ItemItemNumberInputMetadataResolver;
import com.mulesoft.connectors.propel.internal.metadata.PutServicesApexrestNamespaceApiV2ItemItemNumberOutputMetadataResolver;
import com.mulesoft.connectors.propel.internal.operation.refinement.PutServicesApexrestNamespaceApiV2ItemItemNumberOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class PutServicesApexrestNamespaceApiV2ItemItemNumberOperation
    extends PutServicesApexrestNamespaceApiV2ItemItemNumberOperationRefinement {
  public PutServicesApexrestNamespaceApiV2ItemItemNumberOperation() {
    super();
  }

  public PutServicesApexrestNamespaceApiV2ItemItemNumberOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Updates a specified item''s item revision fields. If the item is released and no drafts exist,
   * a new draft will be created.
   *
   * <p>This operation makes an HTTP PUT request to the
   * /services/apexrest/{namespace}/api/v2/item/{itemNumber} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param namespaceUriParam namespace
   * @param itemNumberUriParam Item Number
   * @param putServicesApexrestNamespaceApiV2ItemItemNumberBody the content to use
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @Alias("update-item")
  @DisplayName("Update Item")
  @Summary(
      "Updates a specified item''s item revision fields. If the item is released and no drafts exist, a new draft will be created.")
  @MediaType("application/json")
  @OutputResolver(
      output = PutServicesApexrestNamespaceApiV2ItemItemNumberOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void putServicesApexrestNamespaceApiV2ItemItemNumber(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("namespace") String namespaceUriParam,
      @DisplayName("Item Number") String itemNumberUriParam,
      @Content(primary = true)
          @DisplayName("Body")
          @TypeResolver(PutServicesApexrestNamespaceApiV2ItemItemNumberInputMetadataResolver.class)
          TypedValue<InputStream> putServicesApexrestNamespaceApiV2ItemItemNumberBody,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.putServicesApexrestNamespaceApiV2ItemItemNumber(
        config,
        connection,
        namespaceUriParam,
        itemNumberUriParam,
        putServicesApexrestNamespaceApiV2ItemItemNumberBody,
        parameters,
        overrides,
        callback);
  }
}
