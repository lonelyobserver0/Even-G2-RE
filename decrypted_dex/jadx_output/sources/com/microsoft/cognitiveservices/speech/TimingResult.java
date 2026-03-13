package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TimingResult {
    private long duration;
    private long offset;

    public TimingResult(JSONObject jSONObject) {
        this.offset = jSONObject.optLong(StubApp.getString2(15986));
        this.duration = jSONObject.optLong(StubApp.getString2(3229));
    }

    public long getDuration() {
        return this.duration;
    }

    public long getOffset() {
        return this.offset;
    }
}
