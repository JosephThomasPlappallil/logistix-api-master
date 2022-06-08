package org.department;

import org.department.util.*;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper(config = QuarkusMappingConfig.class)
public interface DepartmentTransformer {
    Department toResource(DepartmentEntity departmentEntity);

    List<Department> map(List<DepartmentEntity> departmentEntity);

    DepartmentEntity toEntity(Department department);

}
