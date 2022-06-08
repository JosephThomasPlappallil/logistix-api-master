package org.organization;

import java.sql.Timestamp;
import javax.persistence.Column;
import org.hibernate.annotations.Type;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;

@RegisterForReflection
@Data
public class Organization{
    @Type(type = "json")
    @Column(columnDefinition = "json")
    public Object details;
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


