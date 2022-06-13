package org.department;

import java.sql.Timestamp;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Department {
    @Type(type = "json")
    @Column(columnDefinition = "json")
    public Object details;
    public Long id;
    public Long organizationId;
    public Long divisionId;
    public String code;
    public String name;
    public String shortName;
    public String notes;
    public String createdBy;
    public String updatedBy;
    public Timestamp createdAt;
    public Timestamp updatedAt;
}
