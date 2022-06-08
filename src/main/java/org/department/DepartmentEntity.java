package org.department;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.vertx.http.runtime.devmode.Json;

@Entity(name = "department")
public class DepartmentEntity extends PanacheEntity {
    @OneToMany(mappedBy = "Organization")
    public Long organizationId;
    @OneToMany(mappedBy = "Division")
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
