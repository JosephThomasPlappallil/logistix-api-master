package org.department;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name = "department")
public class DepartmentEntity extends PanacheEntity {
    @OneToMany(mappedBy = "Organization")
    public Long organizationId;
    @OneToMany(mappedBy = "Division")
    public Long divisionId;

    public String code;

    public String name;

    public String shortName;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    public Object details;

    public String notes;

    public String createdBy;

    public String updatedBy;

    public Timestamp createdAt;

    public Timestamp updatedAt;
}
