package org.organization;

import java.util.List;
import org.organization.util.QuarkusMappingConfig;
import org.mapstruct.Mapper;

@Mapper(config = QuarkusMappingConfig.class)
public interface OrganizationTransformer{

    Organization toResource(OrganizationEntity organizationEntity);

    List<Organization> map(List<OrganizationEntity> organizationEntityList);

    OrganizationEntity toEntity(Organization organization);

}