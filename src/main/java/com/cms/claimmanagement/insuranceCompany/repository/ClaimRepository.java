package com.cms.claimmanagement.insuranceCompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<ClaimDetails, String> {
}
