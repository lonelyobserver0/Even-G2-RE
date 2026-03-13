package u8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1777a extends AbstractC1780d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21462a;

    public C1777a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f21462a = sessionId;
    }

    @Override // u8.AbstractC1780d
    public final String a() {
        return this.f21462a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1777a) {
            return Intrinsics.areEqual(this.f21462a, ((C1777a) obj).f21462a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21462a.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(23576)), this.f21462a, ')');
    }
}
