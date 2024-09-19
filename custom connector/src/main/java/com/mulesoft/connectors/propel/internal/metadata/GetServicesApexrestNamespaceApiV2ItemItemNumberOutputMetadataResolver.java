package com.mulesoft.connectors.propel.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.propel.internal.extension.Propel;

public class GetServicesApexrestNamespaceApiV2ItemItemNumberOutputMetadataResolver
    extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/get-services-apexrest-namespace-api-v2-item-item-number-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "get-services-apexrest-namespace-api-v2-item-item-number-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return Propel.API_METADATA_CATEGORY;
  }
}
