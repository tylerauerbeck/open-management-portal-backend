package com.redhat.labs.omp.model;

import java.time.LocalDateTime;

import javax.json.bind.annotation.JsonbProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreationDetails {

    @JsonbProperty("created_by_user")
    private String createdByUser;
    @JsonbProperty("created_by_email")
    private String createdByEmail;
    @JsonbProperty("created_on")
    private LocalDateTime createdOn;

}
