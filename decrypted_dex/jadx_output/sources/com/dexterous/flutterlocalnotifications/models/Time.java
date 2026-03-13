package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Time implements Serializable {
    private static final String HOUR = StubApp.getString2(10008);
    private static final String MINUTE = StubApp.getString2(10009);
    private static final String SECOND = StubApp.getString2(10010);
    public Integer hour = 0;
    public Integer minute = 0;
    public Integer second = 0;

    public static Time from(Map<String, Object> map) {
        Time time = new Time();
        time.hour = (Integer) map.get(HOUR);
        time.minute = (Integer) map.get(MINUTE);
        time.second = (Integer) map.get(SECOND);
        return time;
    }
}
