package com.ankush.Kagebreaker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class RoomInfoController {
//    @Autowired`
//    private UserService userService;
//
//    @GetMapping("/getUser")
//    public ResponseEntity<?> getUserById(@PathVariable("userId") Integer userId) {
//       UserDTO userDTO = null;
//        try {
//            userDTO =  userService.getUserById(userId);
//        } catch (Exception e) {
//            log.error("getUserById () method failed to execute", e);
//        }
//        return new ResponseEntity<UserDTO>(userDTO, userDTO == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
//    }
}