package kb;

import L0.B;
import b3.C0498N;
import b3.C0517s;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.SessionSKUIdentifier;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import o0.C1438m;
import o8.C1464a;
import r0.InterfaceC1546g;
import r0.InterfaceC1547h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class e implements q4.d, InterfaceC1547h, InterfaceC1546g, Expected.Action {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15530b;

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f15529a = obj;
        this.f15530b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06cf A[ORIG_RETURN, RETURN] */
    @Override // r0.InterfaceC1547h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r25, o0.C1436k r26) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.e.a(java.lang.Object, o0.k):void");
    }

    public void b(boolean z2) {
        String trimMargin$default;
        C1464a this$0 = (C1464a) this.f15529a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z2) {
            Iterator it = this$0.f18386b.iterator();
            while (it.hasNext()) {
                C0517s c0517s = (C0517s) it.next();
                P7.a routeLegProgress = (P7.a) this.f15530b;
                switch (c0517s.f10652a) {
                    case 0:
                        Intrinsics.checkNotNullParameter(routeLegProgress, "routeLegProgress");
                        ((C0498N) c0517s.f10653b).f10543E0 = false;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(routeLegProgress, "routeLegProgress");
                        B6.a aVar = (B6.a) c0517s.f10653b;
                        SessionSKUIdentifier i3 = aVar.i();
                        SessionSKUIdentifier sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
                        if (i3 != sessionSKUIdentifier) {
                            trimMargin$default = StringsKt__IndentKt.trimMargin$default(StubApp.getString2(19165) + i3 + StubApp.getString2(5807), null, 1, null);
                            throw new IllegalStateException(trimMargin$default.toString());
                        }
                        aVar.b(sessionSKUIdentifier, 0L, StubApp.getString2(19164));
                        break;
                }
            }
        }
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        w0.h hVar = (w0.h) obj;
        hVar.getClass();
        w0.a aVar = (w0.a) this.f15529a;
        B b2 = aVar.f21982d;
        if (b2 == null) {
            return;
        }
        I0.g gVar = (I0.g) this.f15530b;
        C1438m c1438m = (C1438m) gVar.f3079f;
        c1438m.getClass();
        b2.getClass();
        Bc.i iVar = new Bc.i(c1438m, gVar.f3076c, hVar.f22016b.c(aVar.f21980b, b2));
        int i3 = gVar.f3075b;
        if (i3 != 0) {
            if (i3 == 1) {
                hVar.f22029p = iVar;
                return;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                hVar.f22030q = iVar;
                return;
            }
        }
        hVar.f22028o = iVar;
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        ((g) this.f15529a).getClass();
        boolean isSuccessful = jVar.isSuccessful();
        MethodChannel.Result result = (MethodChannel.Result) this.f15530b;
        if (isSuccessful) {
            result.success(jVar.getResult());
            return;
        }
        Exception exception = jVar.getException();
        String message = exception != null ? exception.getMessage() : null;
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(1052), StubApp.getString2(351));
        String string2 = StubApp.getString2(1905);
        if (exception != null) {
            hashMap.put(string2, exception.getMessage());
        } else {
            hashMap.put(string2, StubApp.getString2(19166));
        }
        result.error(StubApp.getString2(19167), message, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170 A[LOOP:2: B:69:0x016a->B:71:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004b  */
    @Override // com.mapbox.bindgen.Expected.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.e.run(java.lang.Object):void");
    }
}
