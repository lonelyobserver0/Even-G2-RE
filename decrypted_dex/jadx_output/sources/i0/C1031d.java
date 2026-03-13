package i0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1031d extends AbstractC1030c {
    public C1031d(AbstractC1030c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f14703a;
        Intrinsics.checkNotNullParameter(initialExtras2, "initialExtras");
        this.f14703a.putAll(initialExtras2);
    }

    public final Object a(InterfaceC1029b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f14703a.get(key);
    }

    public final void b(InterfaceC1029b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f14703a.put(key, obj);
    }

    public /* synthetic */ C1031d(int i3) {
        this(C1028a.f14702b);
    }
}
