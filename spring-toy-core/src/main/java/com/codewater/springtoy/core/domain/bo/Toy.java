package com.codewater.springtoy.core.domain.bo;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column
    String name;

    @Column
            @OneToMany
            @ManyToOne
            @JoinColumn
    String price;
}
