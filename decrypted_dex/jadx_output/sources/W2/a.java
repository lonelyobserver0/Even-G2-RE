package W2;

import com.stub.StubApp;
import i2.u;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8066b;

    /* renamed from: c, reason: collision with root package name */
    public String f8067c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8068d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8069e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8070f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8071g;

    /* renamed from: h, reason: collision with root package name */
    public final V2.h f8072h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f8073i;

    public a(String apiKey, String region, String language, String sessionID, int i3, int i10, Integer num) {
        V2.h codec = V2.h.f7740a;
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f8065a = apiKey;
        this.f8066b = region;
        this.f8067c = language;
        this.f8068d = sessionID;
        this.f8069e = i3;
        this.f8070f = 16;
        this.f8071g = i10;
        this.f8072h = codec;
        this.f8073i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f8065a, aVar.f8065a) && Intrinsics.areEqual(this.f8066b, aVar.f8066b) && Intrinsics.areEqual(this.f8067c, aVar.f8067c) && Intrinsics.areEqual(this.f8068d, aVar.f8068d) && this.f8069e == aVar.f8069e && this.f8070f == aVar.f8070f && this.f8071g == aVar.f8071g && this.f8072h == aVar.f8072h && Intrinsics.areEqual(this.f8073i, aVar.f8073i);
    }

    public final int hashCode() {
        int hashCode = (this.f8072h.hashCode() + ((UInt.m147hashCodeimpl(this.f8071g) + ((UInt.m147hashCodeimpl(this.f8070f) + ((UInt.m147hashCodeimpl(this.f8069e) + u.d(u.d(u.d(this.f8065a.hashCode() * 31, 31, this.f8066b), 31, this.f8067c), 31, this.f8068d)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.f8073i;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String str = this.f8067c;
        String m181toStringimpl = UInt.m181toStringimpl(this.f8069e);
        String m181toStringimpl2 = UInt.m181toStringimpl(this.f8070f);
        String m181toStringimpl3 = UInt.m181toStringimpl(this.f8071g);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6816));
        sb2.append(this.f8065a);
        sb2.append(StubApp.getString2(2250));
        E1.a.v(sb2, this.f8066b, StubApp.getString2(6716), str, StubApp.getString2(6817));
        E1.a.v(sb2, this.f8068d, StubApp.getString2(6818), m181toStringimpl, StubApp.getString2(6819));
        E1.a.v(sb2, m181toStringimpl2, StubApp.getString2(6820), m181toStringimpl3, StubApp.getString2(6821));
        sb2.append(this.f8072h);
        sb2.append(StubApp.getString2(6822));
        sb2.append(this.f8073i);
        sb2.append(StubApp.getString2(74));
        return sb2.toString();
    }
}
