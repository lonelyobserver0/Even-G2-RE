package l7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f16786a;

    public final void a() {
        r this$0 = this.f16786a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        Iterator it = this$0.j.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a();
        }
    }
}
