package i9;

import D9.l;
import android.os.SystemClock;
import com.stub.StubApp;
import j9.f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1065a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f14941a;

    public /* synthetic */ C1065a(d dVar) {
        this.f14941a = dVar;
    }

    public final void a(f viewportData) {
        d this$0 = this.f14941a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewportData, "viewportData");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this$0.f14960l >= 1000) {
            l.f(StubApp.getString2(18602) + this$0.f14950a.getCameraState() + StubApp.getString2(18603) + viewportData, StubApp.getString2(18604));
            this$0.f14960l = elapsedRealtime;
        }
        this$0.c(viewportData);
    }
}
