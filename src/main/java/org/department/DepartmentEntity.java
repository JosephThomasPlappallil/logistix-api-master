package org.department;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import io.quarkiverse.hibernate.types.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonType.class)
})
@Entity(name = "department")
public class DepartmentEntity extends PanacheEntity {
    @Type(type = "json")
    @Column(columnDefinition = "json")
    public Object details;
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
