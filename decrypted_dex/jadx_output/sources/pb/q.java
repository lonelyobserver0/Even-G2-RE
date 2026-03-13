package pb;

import L0.A;
import android.content.Context;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import o0.C1447v;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f19796a;

    public q() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f19796a = uuid;
    }

    public abstract C1447v a();

    public abstract A b(Context context);

    public q(String str) {
        this.f19796a = str;
    }
}
