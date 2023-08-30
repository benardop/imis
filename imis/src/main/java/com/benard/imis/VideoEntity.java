package com.benard.imis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Getter @Setter @NoArgsConstructor
 class VideoEntity {
 private @Id @GeneratedValue Long id;
 private String name;
 private String description;

 public VideoEntity(String name, String description) {
  this.name = name;
  this.description = description;
 }

}
