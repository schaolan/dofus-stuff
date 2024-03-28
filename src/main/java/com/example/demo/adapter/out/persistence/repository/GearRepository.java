package com.example.demo.adapter.out.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.adapter.out.persistence.entity.GearCaracteristicEntity;
import com.example.demo.adapter.out.persistence.entity.GearEntity;
import com.example.demo.application.domain.model.enumeration.CaracteristicElement;
import com.example.demo.application.domain.model.enumeration.CaracteristicType;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;

public interface GearRepository extends JpaRepository<GearEntity, Long>, JpaSpecificationExecutor<GearEntity> {

    default Specification<GearEntity> caracteristic(final Float quantity, final CaracteristicElement element,
            final CaracteristicType type) {
        return (root, query, builder) -> {
            Subquery<GearCaracteristicEntity> subquery = query.subquery(GearCaracteristicEntity.class);
            Root<GearCaracteristicEntity> subqueryRoot = subquery.from(GearCaracteristicEntity.class);
            Predicate quantityPredicate = builder.greaterThan(subqueryRoot.get("quantity"), quantity);
            subquery.select(subqueryRoot.get("gear").get("id")).where(quantityPredicate,
                    builder.equal(root.get("id"), subqueryRoot.get("gear").get("id")));
            return builder.exists(subquery);
        };
    }

}
