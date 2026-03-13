package Qb;

import com.stub.StubApp;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class H extends AbstractCoroutineContextElement {

    /* renamed from: b, reason: collision with root package name */
    public static final G f5812b = new G();

    /* renamed from: a, reason: collision with root package name */
    public final String f5813a;

    public H(String str) {
        super(f5812b);
        this.f5813a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && Intrinsics.areEqual(this.f5813a, ((H) obj).f5813a);
    }

    public final int hashCode() {
        return this.f5813a.hashCode();
    }

    public final String toString() {
        return Xa.h.s(new StringBuilder(StubApp.getString2(25470)), this.f5813a, ')');
    }
}
