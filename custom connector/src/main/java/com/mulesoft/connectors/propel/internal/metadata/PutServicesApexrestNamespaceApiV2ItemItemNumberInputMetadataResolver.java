package com.mulesoft.connectors.propel.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.JsonInputMetadataResolver;
import com.mulesoft.connectors.propel.internal.extension.Propel;

public class PutServicesApexrestNamespaceApiV2ItemItemNumberInputMetadataResolver
    extends JsonInputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/put-services-apexrest-namespace-api-v2-item-item-number-input-schema.json";
  }

  @Override
  public String getResolverName() {
    return "put-services-apexrest-namespace-api-v2-item-item-number-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return Propel.API_METADATA_CATEGORY;
  }
}
