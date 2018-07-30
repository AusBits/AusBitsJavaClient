package org.bitcoin.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class FiatConverter {
    private static final Logger LOG = LoggerFactory.getLogger(FiatConverter.class);
    private final static double USD2AUD = 6.2;

    public static double toUsd(Double aud) {
        return toUsd(aud, new Date());
    }

    public static double toUsd(Double aud, Date date) {
        if (aud == null || aud == 0.0) {
            return 0.0;
        }
        double usd = aud / getRate(date);
        return DoubleUtils.toFourDecimal(usd);
    }

    private static Double getRate(Date date) {
        return USD2AUD;
    }


    public static Double toAUD(Double usd) {
        if (usd == null || usd == 0.0) {
            return 0.0;
        }
        double aud = usd * getRate(new Date());
        return DoubleUtils.toFourDecimal(aud);
    }
}
