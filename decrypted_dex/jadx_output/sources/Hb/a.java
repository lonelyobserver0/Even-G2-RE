package Hb;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class a {

    @JsonProperty("group")
    public int group = 0;

    /* renamed from: rc, reason: collision with root package name */
    @JsonProperty("rc")
    public int f3013rc;

    @JsonCreator
    public a() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3013rc);
        sb2.append(StubApp.getString2(2760));
        return AbstractC1482f.f(this.group, StubApp.getString2(74), sb2);
    }
}
