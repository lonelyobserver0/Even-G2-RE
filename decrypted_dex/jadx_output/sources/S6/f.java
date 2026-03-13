package S6;

import Xa.h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final f f6597b = new f(StubApp.getString2(1342));

    /* renamed from: c, reason: collision with root package name */
    public static final f f6598c = new f(StubApp.getString2(1337));

    /* renamed from: a, reason: collision with root package name */
    public final String f6599a;

    public f(String str) {
        this.f6599a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Intrinsics.areEqual(this.f6599a, ((f) obj).f6599a);
        }
        return false;
    }

    @Override // S6.c
    public final String getValue() {
        return this.f6599a;
    }

    public final int hashCode() {
        return this.f6599a.hashCode();
    }

    public final String toString() {
        return h.s(new StringBuilder(StubApp.getString2(6020)), this.f6599a, ')');
    }
}
