package c6;

import com.stub.StubApp;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0573b {

    /* renamed from: a, reason: collision with root package name */
    public final int f10980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10981b;

    public C0573b(int i3, int i10) {
        this.f10980a = i3;
        this.f10981b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0573b)) {
            return false;
        }
        C0573b c0573b = (C0573b) obj;
        return this.f10980a == c0573b.f10980a && this.f10981b == c0573b.f10981b;
    }

    public final int hashCode() {
        return this.f10980a ^ this.f10981b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10980a);
        sb2.append(StubApp.getString2(2830));
        return com.mapbox.common.b.j(sb2, this.f10981b, ')');
    }
}
