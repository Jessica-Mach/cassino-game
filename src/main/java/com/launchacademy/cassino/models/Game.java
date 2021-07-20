package com.launchacademy.cassino.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "games")
public class Game {
  @Id
  @SequenceGenerator(name = "games_generator", sequenceName = "games_id_seq", allocationSize = 1)
  @Column(name = "id", nullable=false, unique=true)
  private Integer id;

  @NotBlank
  @Column(name = "name", nullable = false)
  private String name;
}
