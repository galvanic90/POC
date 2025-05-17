package com.udea.oauthLib.POC.DTO;

import com.udea.oauthLib.POC.entity.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class UserDTO {
    private String id;
    private String username;

    public static UserDTO from(User user) {
        return UserDTO.builder()  // Corrected the reference to the builder
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

    public static List<UserDTO> listoOfUsers(List<User> users) {
        return users.stream()
                .map(user -> new UserDTO(user.getId(), user.getUsername()))
                .collect(Collectors.toList());
    }

}
