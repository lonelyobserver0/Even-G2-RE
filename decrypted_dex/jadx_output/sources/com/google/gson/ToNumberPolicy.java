package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import com.mapbox.common.b;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public Double readNumber(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) throws IOException {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        private Number parseAsDouble(String str, JsonReader jsonReader) throws IOException {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!jsonReader.isLenient()) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                }
                return valueOf;
            } catch (NumberFormatException e10) {
                StringBuilder l9 = b.l("Cannot parse ", str, "; at path ");
                l9.append(jsonReader.getPreviousPath());
                throw new JsonParseException(l9.toString(), e10);
            }
        }

        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) throws IOException, JsonParseException {
            String nextString = jsonReader.nextString();
            if (nextString.indexOf(46) >= 0) {
                return parseAsDouble(nextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(nextString));
            } catch (NumberFormatException unused) {
                return parseAsDouble(nextString, jsonReader);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public BigDecimal readNumber(JsonReader jsonReader) throws IOException {
            String nextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(nextString);
            } catch (NumberFormatException e10) {
                StringBuilder l9 = b.l("Cannot parse ", nextString, "; at path ");
                l9.append(jsonReader.getPreviousPath());
                throw new JsonParseException(l9.toString(), e10);
            }
        }
    }
}
