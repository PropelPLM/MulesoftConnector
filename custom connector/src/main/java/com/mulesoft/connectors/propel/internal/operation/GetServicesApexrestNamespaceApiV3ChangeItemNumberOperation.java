package com.mulesoft.connectors.propel.internal.operation;

import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.CONNECTOR_OVERRIDES;
import static com.mulesoft.connectivity.rest.commons.internal.RestConstants.REQUEST_PARAMETERS_GROUP_NAME;

import com.mulesoft.connectivity.rest.commons.api.configuration.RestConfiguration;
import com.mulesoft.connectivity.rest.commons.api.connection.RestConnection;
import com.mulesoft.connectivity.rest.commons.api.error.RequestErrorTypeProvider;
import com.mulesoft.connectivity.rest.commons.api.operation.ConfigurationOverrides;
import com.mulesoft.connectivity.rest.commons.api.operation.RequestParameters;
import com.mulesoft.connectors.propel.internal.metadata.GetServicesApexrestNamespaceApiV3ChangeItemNumberOutputMetadataResolver;
import com.mulesoft.connectors.propel.internal.metadata.HttpResponseAttributesMetadataResolver;
import com.mulesoft.connectors.propel.internal.operation.refinement.GetServicesApexrestNamespaceApiV3ChangeItemNumberOperationRefinement;
import java.io.InputStream;
import org.mule.runtime.api.el.ExpressionLanguage;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.runtime.process.CompletionCallback;

/** Lower part of the Operation. It has the operation declaration with its annotations. */
public class GetServicesApexrestNamespaceApiV3ChangeItemNumberOperation
    extends GetServicesApexrestNamespaceApiV3ChangeItemNumberOperationRefinement {
  public GetServicesApexrestNamespaceApiV3ChangeItemNumberOperation() {
    super();
  }

  public GetServicesApexrestNamespaceApiV3ChangeItemNumberOperation(ExpressionLanguage arg0) {
    super(arg0);
  }

  /**
   * Get Propel Change
   *
   * <p>This operation makes an HTTP GET request to the
   * /services/apexrest/{namespace}/api/v3/change/{itemNumber} endpoint
   *
   * @param config the configuration to use
   * @param connection the connection to use
   * @param namespaceUriParam namespace
   * @param itemNumberUriParam Item Number
   * @param affectedItemsQueryParam Affected Items
   * @param bomQueryParam BOM
   * @param amlsQueryParam AMLS
   * @param attachmentsQueryParam Attachments
   * @param useXmlexportFieldsetQueryParam Use XML Export Fieldset
   * @param parameters the {@link RequestParameters}
   * @param overrides the {@link ConfigurationOverrides}
   * @param callback the operation's {@link CompletionCallback}
   */
  @Throws(RequestErrorTypeProvider.class)
  @Alias("get-change")
  @DisplayName("Get Change")
  @Summary("Get Propel Change")
  @MediaType("application/json")
  @OutputResolver(
      output = GetServicesApexrestNamespaceApiV3ChangeItemNumberOutputMetadataResolver.class,
      attributes = HttpResponseAttributesMetadataResolver.class)
  public void getServicesApexrestNamespaceApiV3ChangeItemNumber(
      @Config RestConfiguration config,
      @Connection RestConnection connection,
      @DisplayName("namespace") String namespaceUriParam,
      @DisplayName("Item Number") String itemNumberUriParam,
      @Optional @DisplayName("Affected Items") @Summary("Affected Items")
          boolean affectedItemsQueryParam,
      @Optional @DisplayName("bom") @Summary("BOM") boolean bomQueryParam,
      @Optional @DisplayName("amls") @Summary("AMLS") boolean amlsQueryParam,
      @Optional @DisplayName("attachments") @Summary("Attachments") boolean attachmentsQueryParam,
      @Optional @DisplayName("Use XMLExport Fieldset") @Summary("Use XML Export Fieldset")
          boolean useXmlexportFieldsetQueryParam,
      @ParameterGroup(name = REQUEST_PARAMETERS_GROUP_NAME) RequestParameters parameters,
      @ParameterGroup(name = CONNECTOR_OVERRIDES) ConfigurationOverrides overrides,
      CompletionCallback<InputStream, Object> callback) {
    super.getServicesApexrestNamespaceApiV3ChangeItemNumber(
        config,
        connection,
        namespaceUriParam,
        itemNumberUriParam,
        affectedItemsQueryParam,
        bomQueryParam,
        amlsQueryParam,
        attachmentsQueryParam,
        useXmlexportFieldsetQueryParam,
        parameters,
        overrides,
        callback);
  }
}
