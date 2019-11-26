package ru.vaadinDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vaadinDemo.entityes.PrObject;

public interface PrObjectDao extends JpaRepository<PrObject, Long> {
}
