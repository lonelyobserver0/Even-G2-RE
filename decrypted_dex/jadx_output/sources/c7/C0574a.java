package c7;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0574a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10996b;

    public C0574a(String title, String url) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f10995a = title;
        this.f10996b = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0574a)) {
            return false;
        }
        C0574a c0574a = (C0574a) obj;
        return Intrinsics.areEqual(this.f10995a, c0574a.f10995a) && Intrinsics.areEqual(this.f10996b, c0574a.f10996b);
    }

    public final int hashCode() {
        return this.f10996b.hashCode() + (this.f10995a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(9614));
        sb2.append(this.f10995a);
        sb2.append(StubApp.getString2(9615));
        return Xa.h.s(sb2, this.f10996b, ')');
    }
}
