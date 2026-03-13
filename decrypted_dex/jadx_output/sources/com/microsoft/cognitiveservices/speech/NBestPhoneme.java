package com.microsoft.cognitiveservices.speech;

import com.stub.StubApp;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NBestPhoneme {
    private String phoneme;
    private double score;

    public NBestPhoneme(JSONObject jSONObject) {
        this.phoneme = jSONObject.optString(StubApp.getString2(15733));
        this.score = jSONObject.optDouble(StubApp.getString2(15734));
    }

    public String getPhoneme() {
        return this.phoneme;
    }

    public double getScore() {
        return this.score;
    }
}
