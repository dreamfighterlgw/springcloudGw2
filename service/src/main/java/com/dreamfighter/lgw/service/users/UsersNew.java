package com.dreamfighter.lgw.service.users;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; //不是用spring的注解。


@Entity  // This tells Hibernate to make a table out of this class
public class UsersNew {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        private String name;
        private String email;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

}
