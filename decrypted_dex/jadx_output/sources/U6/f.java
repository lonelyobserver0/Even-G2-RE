package U6;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7476a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7477b;

    public f(String sourceId, int i3) {
        switch (i3) {
            case 1:
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                this.f7476a = new HashMap();
                this.f7477b = new HashMap();
                break;
            default:
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                this.f7476a = new HashMap();
                this.f7477b = new HashMap();
                break;
        }
    }
}
