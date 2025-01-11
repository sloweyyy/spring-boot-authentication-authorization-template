package com.tasks.organizer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resource")
@RequiredArgsConstructor
public class AuthorizationController {

  @GetMapping("/user")
  public ResponseEntity<String> user() {
    return ResponseEntity.ok("Here is your resource user");
  }

  @GetMapping("/admin")
  public ResponseEntity<String> admin() {
    return ResponseEntity.ok("Here is your resource admin");
  }
}
