package org.example.bajajfinserv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebhookResponse {
    private String webhook;
    private String accessToken;
}
