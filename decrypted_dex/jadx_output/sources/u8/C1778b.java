package u8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1778b extends AbstractC1780d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21463a;

    public C1778b(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f21463a = sessionId;
    }

    @Override // u8.AbstractC1780d
    public final String a() {
        return this.f21463a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1778b) {
            return Intrinsics.areEqual(this.f21463a, ((C1778b) obj).f21463a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21463a.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(23577)), this.f21463a, ')');
    }
}
