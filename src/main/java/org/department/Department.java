package org.department;

import java.sql.Timestamp;

import io.quarkus.runtime.annotations.RegisterForReflection;
import io.quarkus.vertx.http.runtime.devmode.Json;
import lombok.Data;

@RegisterForReflection
@Data

public class Department {
    public Long id;

    public Long organizationId;

    public Long divisionId;

    public String code;

    public String name;

    public String shortName;

    public Json details;

    public String notes;

    public String createdBy;

    public String updatedBy;

    public Timestamp createdAt;

    public Timestamp updatedAt;
}
