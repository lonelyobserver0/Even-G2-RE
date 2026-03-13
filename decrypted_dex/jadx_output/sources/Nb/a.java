package Nb;

import com.stub.StubApp;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4971b;

    public a(byte[] data, int i3) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f4970a = data;
        this.f4971b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.runtime.mcumgr.transfer.Chunk");
        a aVar = (a) obj;
        return Arrays.equals(this.f4970a, aVar.f4970a) && this.f4971b == aVar.f4971b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f4970a) * 31) + this.f4971b;
    }

    public final String toString() {
        return StubApp.getString2(25405) + this.f4971b + StubApp.getString2(14652) + this.f4970a.length + StubApp.getString2(74);
    }
}
