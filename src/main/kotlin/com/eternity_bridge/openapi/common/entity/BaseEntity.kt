package com.eternity_bridge.openapi.common.entity

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@EntityListeners(AuditingEntityListener::class)
@MappedSuperclass
class BaseEntity {
    @CreatedDate
    private var createdAt: LocalDateTime? = null
    @LastModifiedDate
    private var modifiedAt: LocalDateTime? = null
}