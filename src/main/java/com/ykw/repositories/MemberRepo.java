package com.ykw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ykw.entities.Member;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface MemberRepo extends JpaRepository<Member, Integer> {

}
