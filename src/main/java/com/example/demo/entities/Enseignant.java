package com.example.demo.entities;
  
  import java.io.Serializable; import java.util.*;
  
  import javax.persistence.*;
  
  import lombok.*;
  
  @Getter
  @Setter
  @AllArgsConstructor
  @RequiredArgsConstructor
  @NoArgsConstructor
  @Entity
  @Table(name="enseignant")
  public class Enseignant implements Serializable{
  
	  private static final long serialVersionUID=1L;
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private long matricule; 
  @NonNull
  private String nom_Ens; 
  @NonNull
  private String prenom_Ens;
  private Date  date_entree;
  
  @ManyToMany()
  @JoinTable(name="num_inscri", 
         joinColumns = @JoinColumn(name="matr",referencedColumnName ="matricule" ),
         inverseJoinColumns =@JoinColumn(name="num_iscr",referencedColumnName ="num_Insc")
          )
   private Collection<Etudiant> etudiants;
  
  @ManyToOne
  @JoinColumn(name ="code_dept")
  private Departement departement;
  
  @ManyToOne
  private Cours cours;
  
  
}
 