package com.spring.cloud.config.client2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfigurationData {
	private String URL_A;
	private String URL_B;
}