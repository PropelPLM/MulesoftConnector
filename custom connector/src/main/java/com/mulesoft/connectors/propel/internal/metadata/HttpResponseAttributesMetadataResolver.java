package com.mulesoft.connectors.propel.internal.metadata;

import com.mulesoft.connectors.propel.internal.extension.Propel;

/**
 * Metadata output attributes resolver for {@link
 * com.mulesoft.connectivity.rest.commons.api.operation.HttpResponseAttributes}.
 */
public class HttpResponseAttributesMetadataResolver
    extends com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output
        .HttpResponseAttributesMetadataResolver {
  @Override
  public String getCategoryName() {
    return Propel.API_METADATA_CATEGORY;
  }
}
