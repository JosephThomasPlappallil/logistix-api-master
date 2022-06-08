package org.department;

import java.util.List;

import org.mapstruct.Mapper;
import org.util.*;

@Mapper(config = QuarkusMappingConfig.class)
public interface DepartmentTransformer {
    Department toResource(DepartmentEntity departmentEntity);

    List<Department> map(List<DepartmentEntity> departmentEntity);

    DepartmentEntity toEntity(Department department);

}
