package com.pharmawizard.actuator;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class PwHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {

		try {
			int responseCode = ((HttpsURLConnection) new URL("http://localhost:8080").openConnection())
					.getResponseCode();
			if (responseCode >= 200 && responseCode < 300) {
				return Health.up().build();

			} else if (responseCode == 404) {
				return Health.down().withDetail("Page Not found, error", responseCode).build();
			} else {
				return Health.down().withDetail("Error, HTTP status code", responseCode).build();
			}
		} catch (IOException e) {
			return Health.down(e).build();
		}
	}

}
