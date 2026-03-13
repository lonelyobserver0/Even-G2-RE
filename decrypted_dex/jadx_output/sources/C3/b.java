package C3;

import android.content.Context;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1106a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.a f1107b;

    /* renamed from: c, reason: collision with root package name */
    public final K3.a f1108c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1109d;

    public b(Context context, K3.a aVar, K3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException(StubApp.getString2(1124));
        }
        this.f1106a = context;
        if (aVar == null) {
            throw new NullPointerException(StubApp.getString2(1123));
        }
        this.f1107b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException(StubApp.getString2(1122));
        }
        this.f1108c = aVar2;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(1121));
        }
        this.f1109d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f1106a.equals(((b) cVar).f1106a)) {
                b bVar = (b) cVar;
                if (this.f1107b.equals(bVar.f1107b) && this.f1108c.equals(bVar.f1108c) && this.f1109d.equals(bVar.f1109d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1106a.hashCode() ^ 1000003) * 1000003) ^ this.f1107b.hashCode()) * 1000003) ^ this.f1108c.hashCode()) * 1000003) ^ this.f1109d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1125));
        sb2.append(this.f1106a);
        sb2.append(StubApp.getString2(1126));
        sb2.append(this.f1107b);
        sb2.append(StubApp.getString2(1127));
        sb2.append(this.f1108c);
        sb2.append(StubApp.getString2(1128));
        return AbstractC1482f.k(sb2, this.f1109d, StubApp.getString2(265));
    }
}
