package Y8;

import D5.D;
import I4.e;
import Z8.f;
import Z8.g;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8839a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f8840b;

    /* renamed from: c, reason: collision with root package name */
    public final D f8841c;

    public d(Context context, final f fVar, Handler handler) {
        this.f8839a = context;
        this.f8840b = handler;
        D d8 = new D(this, fVar);
        this.f8841c = d8;
        D.a.c(context, d8, new IntentFilter(StubApp.getString2(7582)), 4);
        g nativeNavigatorRecreationObserver = new g(this) { // from class: Y8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f8838b;

            {
                this.f8838b = this;
            }

            @Override // Z8.g
            public final void a() {
                f navigator = fVar;
                Intrinsics.checkNotNullParameter(navigator, "$navigator");
                d this$0 = this.f8838b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                navigator.e(e.m(this$0.f8839a));
            }
        };
        Intrinsics.checkNotNullParameter(nativeNavigatorRecreationObserver, "nativeNavigatorRecreationObserver");
        fVar.f9061n.add(nativeNavigatorRecreationObserver);
        fVar.e(e.m(context));
    }
}
