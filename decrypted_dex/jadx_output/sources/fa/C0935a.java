package fa;

import com.stub.StubApp;
import java.util.List;

/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0935a {

    /* renamed from: a, reason: collision with root package name */
    public float f14184a;

    /* renamed from: b, reason: collision with root package name */
    public float f14185b;

    /* renamed from: c, reason: collision with root package name */
    public float f14186c;

    /* renamed from: d, reason: collision with root package name */
    public float f14187d;

    public C0935a(float f10, float f11, float f12, float f13) {
        this.f14184a = f10;
        this.f14185b = f11;
        this.f14186c = f12;
        this.f14187d = f13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        sb2.append(this.f14184a);
        String string2 = StubApp.getString2(321);
        sb2.append(string2);
        sb2.append(this.f14185b);
        sb2.append(string2);
        sb2.append(this.f14186c);
        sb2.append(string2);
        sb2.append(this.f14187d);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    public C0935a(List list) {
        this.f14184a = ((Number) list.get(0)).floatValue();
        this.f14185b = ((Number) list.get(1)).floatValue();
        this.f14186c = ((Number) list.get(2)).floatValue();
        this.f14187d = ((Number) list.get(3)).floatValue();
    }
}
