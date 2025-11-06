package com.calasansdev.repositories;

import com.calasansdev.domain.address.Address;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public interface AddressRepository extends PanacheRepositoryBase<Address, UUID> {
}
