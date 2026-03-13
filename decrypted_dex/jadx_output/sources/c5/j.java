package c5;

import android.util.Log;
import com.stub.StubApp;
import e5.C0844c;
import i5.C1059c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f10884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f10885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A3.s f10886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f10888f;

    public j(l lVar, long j, Throwable th, Thread thread, A3.s sVar, boolean z2) {
        this.f10888f = lVar;
        this.f10883a = j;
        this.f10884b = th;
        this.f10885c = thread;
        this.f10886d = sVar;
        this.f10887e = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1059c c1059c;
        String str;
        long j = this.f10883a;
        long j3 = j / 1000;
        l lVar = this.f10888f;
        String sessionId = lVar.e();
        String string2 = StubApp.getString2(280);
        if (sessionId == null) {
            Log.e(string2, StubApp.getString2(9470), null);
            return a4.f.m(null);
        }
        lVar.f10895c.i();
        C1059c c1059c2 = lVar.f10904m;
        c1059c2.getClass();
        String concat = StubApp.getString2(9471).concat(sessionId);
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, concat, null);
        }
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        c1059c2.m(this.f10884b, this.f10885c, StubApp.getString2(7530), new C0844c(sessionId, j3, MapsKt.emptyMap()), true);
        String string22 = StubApp.getString2(9467);
        try {
            c1059c = lVar.f10899g;
            str = string22 + j;
            c1059c.getClass();
        } catch (IOException e10) {
            Log.w(string2, StubApp.getString2(9473), e10);
        }
        if (!new File((File) c1059c.f14844c, str).createNewFile()) {
            throw new IOException(StubApp.getString2("9472"));
        }
        A3.s sVar = this.f10886d;
        lVar.b(false, sVar, false);
        lVar.c(new C0571d().f10870a, Boolean.valueOf(this.f10887e));
        return !lVar.f10894b.a() ? a4.f.m(null) : ((q4.k) ((AtomicReference) sVar.f197i).get()).f20051a.onSuccessTask(lVar.f10897e.f13422a, new Y.m(this, sessionId, 6, false));
    }
}
