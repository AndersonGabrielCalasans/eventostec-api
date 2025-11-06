package com.calasansdev.repositories;

import com.calasansdev.domain.coupon.Coupon;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public interface CouponRepository extends PanacheRepositoryBase<Coupon, UUID> {
}
