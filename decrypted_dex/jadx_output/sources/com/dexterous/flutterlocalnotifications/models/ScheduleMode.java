package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    public static class Deserializer implements JsonDeserializer<ScheduleMode> {
        @Override // com.google.gson.JsonDeserializer
        public final ScheduleMode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                return ScheduleMode.valueOf(jsonElement.getAsString());
            } catch (Exception unused) {
                return jsonElement.getAsBoolean() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
            }
        }
    }

    public boolean useAlarmClock() {
        return this == alarmClock;
    }

    public boolean useAllowWhileIdle() {
        return this == exactAllowWhileIdle || this == inexactAllowWhileIdle;
    }

    public boolean useExactAlarm() {
        return this == exact || this == exactAllowWhileIdle;
    }
}
