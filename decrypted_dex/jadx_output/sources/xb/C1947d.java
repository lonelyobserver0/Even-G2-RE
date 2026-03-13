package xb;

import com.stub.StubApp;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xb.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1947d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23144a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23145b;

    /* renamed from: c, reason: collision with root package name */
    public final wb.e f23146c;

    public C1947d(byte[] data, long j, wb.e transaction) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f23144a = data;
        this.f23145b = j;
        this.f23146c = transaction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C1947d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.runtime.mcumgr.ble.callback.SmpProtocolSession.Outgoing");
        return Arrays.equals(this.f23144a, ((C1947d) obj).f23144a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23144a);
    }

    public final String toString() {
        return StubApp.getString2(24549) + Arrays.toString(this.f23144a) + StubApp.getString2(24550) + this.f23145b + StubApp.getString2(24551) + this.f23146c + StubApp.getString2(74);
    }
}
