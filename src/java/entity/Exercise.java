package entity;
// Generated 03-dic-2017 20:46:53 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;




/**
 * Exercise generated by hbm2java
 */
public class Exercise  implements java.io.Serializable {


     private Integer idExercise;
     private User user;
     private Integer type;
     private Integer columns;
     private Integer rows;
     private Set selecteds = new HashSet(0);

    public Exercise() {
    }

	
    public Exercise(User user) {
        this.user = user;
    }
    public Exercise(User user, Integer type, Integer columns, Integer rows) {
       this.user = user;
       this.type = type;
       this.columns = columns;
       this.rows = rows;
    }
    
    public Exercise(int idExercise, User user, Integer type, Integer columns, Integer rows, Set selecteds) {
       this.idExercise = idExercise;
       this.user = user;
       this.type = type;
       this.columns = columns;
       this.rows = rows;
       this.selecteds = selecteds;
    }
   
    public Integer getIdExercise() {
        return this.idExercise;
    }
    
    public void setIdExercise(Integer idExercise) {
        this.idExercise = idExercise;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getColumns() {
        return this.columns;
    }
    
    public void setColumns(Integer columns) {
        this.columns = columns;
    }
    public Integer getRows() {
        return this.rows;
    }
    
    public void setRows(Integer rows) {
        this.rows = rows;
    }
  
    public Set getSelecteds() {
        return selecteds;
    }

    public void setSelecteds(Set selecteds) {
        this.selecteds = selecteds;
    }




}


