package j2;

import androidx.work.impl.WorkDatabase;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {
    public static void a(P1.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.a();
        try {
            int i3 = WorkDatabase.f10369n;
            db2.k(StubApp.getString2("18973") + (System.currentTimeMillis() - WorkDatabase.f10368m) + StubApp.getString2("18974"));
            db2.G();
        } finally {
            db2.h();
        }
    }
}
