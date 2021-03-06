package com.example.sttudy_jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "atable")
@Entity
public class aTable {
    
    @Id
    @Column(name = "a_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "a_id")
    private List<bTable>bTables;

    @Lob
    @Column(name = "text",nullable = true)
    private String text;

}
