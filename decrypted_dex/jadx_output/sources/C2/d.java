package C2;

import D5.L;
import D5.N;
import E0.y;
import E0.z;
import H5.C0079l;
import H5.P;
import H5.Q;
import M4.F;
import M4.I;
import M4.Z;
import R8.C0250h;
import T0.InterfaceC0317h;
import T0.u;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.navigator.RefreshRouteResult;
import com.mapbox.navigator.RouteAlternative;
import com.microsoft.cognitiveservices.speech.audio.PushAudioInputStream;
import com.stub.StubApp;
import i4.C1052p;
import i4.C1054r;
import i5.C1059c;
import io.flutter.plugin.common.BasicMessageChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o0.C1417N;
import o0.C1438m;
import q4.InterfaceC1521b;
import r0.AbstractC1560u;
import w5.InterfaceC1865a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements q4.d, q4.f, q4.e, InterfaceC1521b, y, Expected.Transformer, J3.b, y3.e, H8.g, O0.n, BasicMessageChannel.MessageHandler, GetLocationCallback, InterfaceC0317h, W4.e, InterfaceC1865a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1057b;

    public /* synthetic */ d(Object obj, int i3) {
        this.f1056a = i3;
        this.f1057b = obj;
    }

    @Override // q4.e
    public void C(Exception exc) {
        Log.e(StubApp.getString2(959), StubApp.getString2(960));
        ((A2.g) this.f1057b).b(2);
    }

    @Override // T0.InterfaceC0317h
    public long a(long j) {
        return AbstractC1560u.j((j * r0.f7051e) / 1000000, 0L, ((u) this.f1057b).j - 1);
    }

    @Override // y3.e, I3.f
    public Object apply(Object obj) {
        ((C0079l) this.f1057b).getClass();
        String r8 = Q.f2793b.r((P) obj);
        Intrinsics.checkNotNullExpressionValue(r8, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d(StubApp.getString2(962), StubApp.getString2(961));
        byte[] bytes = r8.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // E0.y
    public int b(Object obj) {
        E0.p pVar = (E0.p) obj;
        pVar.getClass();
        C1438m c1438m = (C1438m) this.f1057b;
        String str = c1438m.f18216n;
        String str2 = pVar.f1778b;
        return ((str2.equals(str) || str2.equals(z.b(c1438m))) && pVar.c(c1438m, false)) ? 1 : 0;
    }

    @Override // w5.InterfaceC1865a
    public void c(w5.b bVar) {
        Z4.a aVar = (Z4.a) this.f1057b;
        aVar.getClass();
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(963), null);
        }
        aVar.f8976b.set((Z4.a) bVar.get());
    }

    @Override // O0.n
    public Z d(int i3, C1417N c1417n, int[] iArr) {
        F l9 = I.l();
        int i10 = 0;
        while (i10 < c1417n.f18067a) {
            int i11 = i3;
            C1417N c1417n2 = c1417n;
            l9.a(new O0.g(i11, c1417n2, i10, (O0.j) this.f1057b, iArr[i10]));
            i10++;
            i3 = i11;
            c1417n = c1417n2;
        }
        return l9.g();
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        ((C0250h) this.f1057b).getClass();
        Bundle bundle = (Bundle) jVar.getResult(IOException.class);
        String string2 = StubApp.getString2(964);
        if (bundle == null) {
            throw new IOException(string2);
        }
        String string = bundle.getString(StubApp.getString2(965));
        if (string != null) {
            return string;
        }
        String string3 = bundle.getString(StubApp.getString2(966));
        if (string3 != null) {
            return string3;
        }
        String string4 = bundle.getString(StubApp.getString2(435));
        if (StubApp.getString2(967).equals(string4)) {
            throw new IOException(StubApp.getString2(969));
        }
        if (string4 != null) {
            throw new IOException(string4);
        }
        Log.w(StubApp.getString2(493), StubApp.getString2(968) + bundle, new Throwable());
        throw new IOException(string2);
    }

    @Override // J3.b
    public Object f() {
        SQLiteDatabase a3;
        Object obj = this.f1057b;
        switch (this.f1056a) {
            case 12:
                I3.h hVar = (I3.h) ((I3.c) obj);
                hVar.getClass();
                int i3 = E3.a.f1877e;
                p2.h hVar2 = new p2.h();
                hVar2.f19671a = null;
                hVar2.f19672b = new ArrayList();
                hVar2.f19673c = null;
                hVar2.f19674d = "";
                HashMap hashMap = new HashMap();
                String string2 = StubApp.getString2(975);
                a3 = hVar.a();
                a3.beginTransaction();
                try {
                    E3.a aVar = (E3.a) I3.h.A(a3.rawQuery(string2, new String[0]), new e(hVar, hashMap, hVar2, 6));
                    a3.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 13:
                I3.h hVar3 = (I3.h) ((I3.d) obj);
                long f10 = hVar3.f3119b.f() - hVar3.f3121d.f3108d;
                a3 = hVar3.a();
                a3.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(f10)};
                    Cursor rawQuery = a3.rawQuery(StubApp.getString2("972"), strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar3.k(rawQuery.getInt(0), E3.c.f1884c, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a3.delete(StubApp.getString2("973"), StubApp.getString2("974"), strArr);
                    a3.setTransactionSuccessful();
                    a3.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 14:
                I3.h hVar4 = (I3.h) ((H3.i) obj).f2732i;
                a3 = hVar4.a();
                a3.beginTransaction();
                try {
                    a3.compileStatement(StubApp.getString2("970")).execute();
                    a3.compileStatement(StubApp.getString2("971") + hVar4.f3119b.f()).execute();
                    a3.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                H3.j jVar = (H3.j) obj;
                Iterator it = ((Iterable) ((I3.h) jVar.f2734b).e(new A1.a(15))).iterator();
                while (it.hasNext()) {
                    jVar.f2735c.a((B3.j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // H8.g
    public L7.i g() {
        String string2 = StubApp.getString2(976);
        L7.i iVar = (L7.i) this.f1057b;
        Intrinsics.checkNotNullParameter(iVar, string2);
        return iVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:3)(1:166)|4|(1:6)|(1:8)(1:165)|9|(3:161|162|(15:164|25|(1:27)|28|(4:31|(3:33|34|35)(1:37)|36|29)|38|39|40|41|(1:43)|44|45|(1:47)|48|(33:50|(1:52)|(1:54)(1:151)|55|(2:56|(3:58|(2:60|61)(1:63)|62)(1:64))|65|(2:68|66)|69|70|(1:72)(1:150)|(1:74)|75|(5:137|(1:139)|140|487|145)(1:79)|80|(18:84|(1:86)(2:133|(1:135))|(3:88|(1:90)|91)(2:129|(2:131|132))|92|93|94|95|96|97|98|(8:120|121|(1:123)|124|111|112|(2:114|(1:116))|117)|107|(1:109)|110|111|112|(0)|117)|136|(0)(0)|92|93|94|95|96|97|98|(2:100|102)|120|121|(0)|124|111|112|(0)|117)(2:152|153)))(3:13|(3:157|158|(1:160))(4:17|(2:20|18)|21|22)|23)|24|25|(0)|28|(1:29)|38|39|40|41|(0)|44|45|(0)|48|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:50|(1:52)|(1:54)(1:151)|55|(2:56|(3:58|(2:60|61)(1:63)|62)(1:64))|65|(2:68|66)|69|70|(1:72)(1:150)|(1:74)|75|(5:137|(1:139)|140|487|145)(1:79)|80|(18:84|(1:86)(2:133|(1:135))|(3:88|(1:90)|91)(2:129|(2:131|132))|92|93|94|95|96|97|98|(8:120|121|(1:123)|124|111|112|(2:114|(1:116))|117)|107|(1:109)|110|111|112|(0)|117)|136|(0)(0)|92|93|94|95|96|97|98|(2:100|102)|120|121|(0)|124|111|112|(0)|117) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05fd, code lost:
    
        r11.f10931g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0665, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0684, code lost:
    
        android.util.Log.e(r2, com.stub.StubApp.getString2(1011), r0);
        r11.f10932h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x073b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x073c, code lost:
    
        r2 = r3;
        android.util.Log.e(r2, com.stub.StubApp.getString2(1024), r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ab A[Catch: NameNotFoundException -> 0x073b, TryCatch #3 {NameNotFoundException -> 0x073b, blocks: (B:41:0x028e, B:43:0x02ab, B:44:0x02b1), top: B:40:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04e7  */
    @Override // W4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(W4.s r53) {
        /*
            Method dump skipped, instructions count: 1917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.d.h(W4.s):java.lang.Object");
    }

    @Override // q4.f
    public void i(Object obj) {
        switch (this.f1056a) {
            case 1:
                g gVar = (g) this.f1057b;
                gVar.h(gVar.f1070f);
                break;
            default:
                ((A2.g) this.f1057b).a((Location) obj);
                break;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        Value value$lambda$0;
        String joinToString$default;
        Object obj2 = this.f1057b;
        switch (this.f1056a) {
            case 9:
                com.mapbox.navigation.base.route.g route = (com.mapbox.navigation.base.route.g) obj;
                Intrinsics.checkNotNullExpressionValue(route, "it");
                Q2.g gVar = (Q2.g) obj2;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                Long l9 = (Long) gVar.f5711b;
                if (l9 == null || ((LinkedHashMap) ((C1059c) gVar.f5713d).f14846e).remove(l9) != null) {
                    O8.e eVar = (O8.e) gVar.f5712c;
                    Intrinsics.checkNotNullParameter(route, "route");
                    Result.Companion companion = Result.INSTANCE;
                    eVar.f5232a.resumeWith(Result.m40constructorimpl(new R8.o(route)));
                }
                return Unit.INSTANCE;
            case 23:
                value$lambda$0 = PromoteId.toValue$lambda$0((PromoteId) obj2, (String) obj);
                return value$lambda$0;
            default:
                RefreshRouteResult refreshRouteResult = (RefreshRouteResult) obj;
                Continuation continuation = (Continuation) obj2;
                Intrinsics.checkNotNullParameter(continuation, "$continuation");
                Intrinsics.checkNotNullParameter(refreshRouteResult, "refreshRouteResult");
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(1026));
                sb2.append(refreshRouteResult.getRoute().getRouteId());
                sb2.append(StubApp.getString2(1027));
                List<RouteAlternative> alternatives = refreshRouteResult.getAlternatives();
                Intrinsics.checkNotNullExpressionValue(alternatives, "refreshRouteResult.alternatives");
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(alternatives, null, null, null, 0, null, Z8.b.f9043a, 31, null);
                if (StringsKt.isBlank(joinToString$default)) {
                    joinToString$default = StubApp.getString2(1028);
                }
                sb2.append(joinToString$default);
                D9.l.d(sb2.toString(), StubApp.getString2(1029));
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m40constructorimpl(ExpectedFactory.createValue(refreshRouteResult.getAlternatives())));
                return Unit.INSTANCE;
        }
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        switch (this.f1056a) {
            case 0:
                boolean isSuccessful = jVar.isSuccessful();
                b bVar = (b) this.f1057b;
                if (!isSuccessful) {
                    bVar.f1047a.error(E1.a.b(3), E1.a.a(3), null);
                }
                C1052p c1052p = (C1052p) jVar.getResult();
                if (c1052p == null) {
                    bVar.f1047a.error(E1.a.b(3), E1.a.a(3), null);
                    break;
                } else {
                    C1054r c1054r = c1052p.f14798a.f14800b;
                    bVar.f1047a.success(Boolean.valueOf((c1054r != null && c1054r.f14801a) || (c1054r != null && c1054r.f14802b)));
                    break;
                }
                break;
            case 5:
                L.b((Intent) this.f1057b);
                break;
            case 6:
                ((N) this.f1057b).f1390b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f1057b).cancel(false);
                break;
        }
    }

    public void k(F9.b it) {
        E9.k this$0 = (E9.k) this.f1057b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        E9.l lVar = (E9.l) ((ConcurrentLinkedQueue) this$0.f2084e).poll();
        if (((ConcurrentLinkedQueue) this$0.f2084e).isEmpty()) {
            this$0.a(false);
        }
        if (lVar != null) {
            lVar.f2090b.accept(lVar.f2089a);
        }
        this$0.d();
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        U2.a aVar = (U2.a) this.f1057b;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Intrinsics.checkNotNullParameter(reply, "reply");
        String string2 = StubApp.getString2(1030);
        if (byteBuffer == null) {
            R2.c.b(string2, StubApp.getString2(1032));
            reply.reply(null);
            return;
        }
        try {
            byte[] data = new byte[byteBuffer.remaining()];
            byteBuffer.get(data);
            B3.h hVar = aVar.f7449d;
            if (hVar != null) {
                Intrinsics.checkNotNullParameter(data, "data");
                PushAudioInputStream pushAudioInputStream = (PushAudioInputStream) hVar.f613d;
                if (pushAudioInputStream != null) {
                    pushAudioInputStream.write(data);
                }
            }
            reply.reply(null);
        } catch (Exception e10) {
            R2.c.c(string2, StubApp.getString2(1031) + e10.getMessage());
            reply.reply(null);
        }
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(com.mapbox.common.location.Location location) {
        String string2 = StubApp.getString2(392);
        B3.h hVar = (B3.h) this.f1057b;
        Intrinsics.checkNotNullParameter(hVar, string2);
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(1033) + location, StubApp.getString2(545));
        }
        if (location != null) {
            hVar.e(location);
        }
    }
}
