package com.jwtimplementation.model;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {

    private String jwtToken;
    private String username;

}
