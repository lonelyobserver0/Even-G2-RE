package ea;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: ea.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0855b {

    /* renamed from: a, reason: collision with root package name */
    public final String f13671a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13673c;

    public C0855b(String str, int i3) {
        this.f13671a = str;
        this.f13673c = i3;
    }

    public final int a() {
        return (int) Float.parseFloat(this.f13671a);
    }

    public final String toString() {
        int i3 = this.f13673c;
        if (i3 == 13) {
            return AbstractC1482f.f(this.f13672b.length, StubApp.getString2(17385), new StringBuilder(StubApp.getString2(17384)));
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(17386));
        sb2.append(com.mapbox.common.b.x(i3));
        sb2.append(StubApp.getString2(12693));
        return AbstractC1482f.k(sb2, this.f13671a, StubApp.getString2(511));
    }

    public C0855b(char c10, int i3) {
        this.f13671a = Character.toString(c10);
        this.f13673c = i3;
    }

    public C0855b(byte[] bArr) {
        this.f13672b = bArr;
        this.f13673c = 13;
    }
}
