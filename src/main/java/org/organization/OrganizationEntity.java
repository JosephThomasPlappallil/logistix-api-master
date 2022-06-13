package org.organization;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import org.divisions.DivisionEntity;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import io.quarkiverse.hibernate.types.json.JsonType;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonType.class)
})

@Entity(name="organization")
public class OrganizationEntity extends PanacheEntity {
    @MapKey(name = "id")
    @OneToMany(mappedBy = "organization")
    protected Map<Long, DivisionEntity> division = new HashMap<>();
    @Type(type = "json")
    @Column(columnDefinition = "json")
    public Object details;
    public Long id;
    public String code;
    public String parentId;
    public String parentCode;
    public String name;
    public String shortName;
    public String taxIdentifier;
    public String createdBy;
    public String updatedBy;
    public Timestamp createdAt;
    public Timestamp updatedAt;
}
