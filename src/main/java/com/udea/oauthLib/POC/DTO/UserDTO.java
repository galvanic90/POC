package com.udea.oauthLib.POC.DTO;

import com.udea.oauthLib.POC.entity.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private String id;
    private String username;

    public static UserDTO from(User user) {
        return UserDTO.builder()  // Corrected the reference to the builder
                .id(user.getId())
                .username(user.getUserName())
                .build();
    }
}
