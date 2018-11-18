package com.hendisantika.jpa.one2one.repository;

import com.hendisantika.jpa.one2one.model.Husband;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HusbandRepository extends JpaRepository<Husband, Integer> {
}