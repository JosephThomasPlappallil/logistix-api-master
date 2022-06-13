package org.divisions;

import java.sql.Timestamp;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
@RegisterForReflection
@Data
public class Division {
    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object details;
    
    private Long  organizationId;
    private String code;
    private String name;
    private String shortName;
    private String taxIdentifier;
    
    private String notes;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}
