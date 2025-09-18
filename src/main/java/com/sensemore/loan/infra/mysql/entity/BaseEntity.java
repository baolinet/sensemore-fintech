package com.sensemore.loan.infra.mysql.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

// import org.springframework.data.annotation.Id;

// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
// @MappedSuperclass
public class BaseEntity implements Serializable {
	// @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public boolean isNewRecord() {
		return this.id == null;
	}
}