package com.routesrunner.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("routes")
public class Route {
    @Id
    private String id;
    private String routeName;
    private String[] hashtags;
    private String imageThumbnail;

}
