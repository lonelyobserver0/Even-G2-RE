package D5;

import Qb.K0;
import V8.C0349a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Trace;
import b3.C0498N;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.Location;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.navigator.SetRoutesResult;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import q4.InterfaceC1521b;
import r0.InterfaceC1542c;
import t.C1692e;
import w5.InterfaceC1865a;

/* renamed from: D5.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0043g implements q4.d, InterfaceC1521b, Expected.Transformer, Expected.Action, W4.e, J3.b, I3.f, InterfaceC1542c, O0.n, InterfaceC1865a, BasicMessageChannel.Reply, GetLocationCallback, h7.d, SnapshotResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1421c;

    public /* synthetic */ C0043g(int i3, Object obj, Object obj2) {
        this.f1419a = i3;
        this.f1420b = obj;
        this.f1421c = obj2;
    }

    @Override // h7.d
    public void a(K6.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C0498N c0498n = (C0498N) this.f1420b;
        c0498n.getClass();
        R2.c.b(StubApp.getString2(103), StubApp.getString2(1428));
        Location location = (Location) this.f1421c;
        c0498n.w(location.getLongitude(), location.getLatitude(), Double.valueOf(c0498n.f10593t));
    }

    @Override // r0.InterfaceC1542c
    public void accept(Object obj) {
        A0.f fVar = (A0.f) this.f1420b;
        ((L0.G) obj).n(fVar.f32a, fVar.f33b, (I0.g) this.f1421c);
    }

    @Override // I3.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        I3.h hVar = (I3.h) this.f1420b;
        I3.a aVar = hVar.f3121d;
        int i3 = aVar.f3106b;
        B3.j jVar = (B3.j) this.f1421c;
        ArrayList h2 = hVar.h(sQLiteDatabase, jVar, i3);
        for (y3.d dVar : y3.d.values()) {
            if (dVar != jVar.f630c) {
                int size = aVar.f3106b - h2.size();
                if (size <= 0) {
                    break;
                }
                h2.addAll(hVar.h(sQLiteDatabase, jVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1429));
        for (int i10 = 0; i10 < h2.size(); i10++) {
            sb2.append(((I3.b) h2.get(i10)).f3110a);
            if (i10 < h2.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query(StubApp.getString2(1062), new String[]{StubApp.getString2(1060), StubApp.getString2(ModuleDescriptor.MODULE_VERSION), StubApp.getString2(1061)}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new I3.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = h2.listIterator();
        while (listIterator.hasNext()) {
            I3.b bVar = (I3.b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(bVar.f3110a))) {
                B3.h c10 = bVar.f3112c.c();
                long j3 = bVar.f3110a;
                for (I3.g gVar : (Set) hashMap.get(Long.valueOf(j3))) {
                    c10.b(gVar.f3115a, gVar.f3116b);
                }
                listIterator.set(new I3.b(j3, bVar.f3111b, c10.c()));
            }
        }
        return h2;
    }

    @Override // w5.InterfaceC1865a
    public void c(w5.b bVar) {
        ((InterfaceC1865a) this.f1420b).c(bVar);
        ((InterfaceC1865a) this.f1421c).c(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    @Override // O0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M4.Z d(int r17, o0.C1417N r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.C0043g.d(int, o0.N, int[]):M4.Z");
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        C0047k c0047k = (C0047k) this.f1420b;
        String str = (String) this.f1421c;
        synchronized (c0047k) {
            ((C1692e) c0047k.f1435b).remove(str);
        }
        return jVar;
    }

    @Override // J3.b
    public Object f() {
        switch (this.f1419a) {
            case 5:
                I3.h hVar = (I3.h) ((H3.i) this.f1420b).f2726c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f1421c;
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement(StubApp.getString2(1430) + I3.h.v(iterable)).execute();
                    break;
                }
                break;
            default:
                H3.i iVar = (H3.i) this.f1420b;
                iVar.getClass();
                Iterator it = ((HashMap) this.f1421c).entrySet().iterator();
                while (it.hasNext()) {
                    ((I3.h) iVar.f2732i).k(((Integer) r2.getValue()).intValue(), E3.c.f1888g, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // W4.e
    public Object h(W4.s sVar) {
        switch (this.f1419a) {
            case 4:
                return new F5.a((String) this.f1420b, ((F5.d) this.f1421c).b((Context) sVar.get(Context.class)));
            default:
                String str = (String) this.f1420b;
                W4.b bVar = (W4.b) this.f1421c;
                try {
                    Trace.beginSection(str);
                    return bVar.f8120f.h(sVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        Object obj2 = this.f1421c;
        Object obj3 = this.f1420b;
        switch (this.f1419a) {
            case 2:
                ((Q2.g) obj3).M(new E8.d(StubApp.getString2(1435) + ((DataRef) obj2), (Throwable) obj, null, 12));
                break;
            default:
                String error = (String) obj;
                com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) obj3;
                Intrinsics.checkNotNullParameter(gVar, StubApp.getString2(1431));
                Continuation continuation = (Continuation) obj2;
                Intrinsics.checkNotNullParameter(continuation, StubApp.getString2(1432));
                Intrinsics.checkNotNullParameter(error, "error");
                D9.l.e(StubApp.getString2(1433) + gVar.f12506i + StubApp.getString2(1434) + error, StubApp.getString2(1029));
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m40constructorimpl(ExpectedFactory.createError(error)));
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // q4.d
    public void j(q4.j task) {
        switch (this.f1419a) {
            case 0:
                ((AbstractServiceC0044h) this.f1420b).a((Intent) this.f1421c);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar2 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar2);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar3 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.b(task, zVar3);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar4 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar4);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar5 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar5);
                break;
            case 25:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar6 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.b(task, zVar6);
                break;
            case 26:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar7 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar7);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar8 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar8);
                break;
            case 28:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar9 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar9);
                break;
            default:
                Intrinsics.checkNotNullParameter(task, "task");
                X2.z zVar10 = (X2.z) this.f1421c;
                ((hb.i) this.f1420b).getClass();
                hb.i.c(task, zVar10);
                break;
        }
    }

    @Override // com.mapbox.maps.SnapshotResultCallback
    public void onSnapshotResult(Bitmap bitmap, String str) {
        switch (this.f1419a) {
            case 18:
                C0498N c0498n = (C0498N) this.f1420b;
                X2.z zVar = (X2.z) this.f1421c;
                synchronized (c0498n.f10556L0) {
                    c0498n.f10551I0 = null;
                    c0498n.f10549H0 = false;
                    Unit unit = Unit.INSTANCE;
                }
                if (str != null) {
                    R2.c.c(StubApp.getString2(103), StubApp.getString2(1441).concat(str));
                    Result.Companion companion = Result.INSTANCE;
                    zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(1437).concat(str))))));
                    return;
                } else {
                    if (bitmap == null) {
                        R2.c.c(StubApp.getString2(103), StubApp.getString2(1442));
                        Result.Companion companion2 = Result.INSTANCE;
                        zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(1439))))));
                        return;
                    }
                    R2.c.b(StubApp.getString2(103), StubApp.getString2(1443));
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(byteArray)));
                    return;
                }
            default:
                ((C0498N) this.f1420b).f10548H = false;
                X2.z zVar2 = (X2.z) this.f1421c;
                String string2 = StubApp.getString2(103);
                if (str != null) {
                    R2.c.c(string2, StubApp.getString2(1436).concat(str));
                    Result.Companion companion3 = Result.INSTANCE;
                    zVar2.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(1437).concat(str))))));
                    return;
                } else {
                    if (bitmap == null) {
                        R2.c.c(string2, StubApp.getString2(1438));
                        Result.Companion companion4 = Result.INSTANCE;
                        zVar2.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new Exception(StubApp.getString2(1439))))));
                        return;
                    }
                    R2.c.b(string2, StubApp.getString2(1440));
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
                    zVar2.invoke(Result.m39boximpl(Result.m40constructorimpl(byteArray2)));
                    return;
                }
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        boolean z2 = obj instanceof List;
        X2.u uVar = (X2.u) this.f1420b;
        if (!z2) {
            Result.Companion companion = Result.INSTANCE;
            uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(F1.a((String) this.f1421c)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            Result.Companion companion2 = Result.INSTANCE;
            uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
            return;
        }
        Result.Companion companion3 = Result.INSTANCE;
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        uVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new X2.k((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        List emptyList;
        switch (this.f1419a) {
            case 3:
                F9.f it = (F9.f) obj;
                B this$0 = (B) this.f1420b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                F9.b announcement = (F9.b) this.f1421c;
                Intrinsics.checkNotNullParameter(announcement, "$announcement");
                Intrinsics.checkNotNullParameter(it, "it");
                F9.d dVar = (F9.d) ((LinkedHashMap) this$0.f1340a).get(it);
                if (Intrinsics.areEqual(dVar != null ? dVar.f2338a : null, announcement)) {
                    ((LinkedHashMap) this$0.f1340a).remove(it);
                    break;
                }
                break;
            default:
                V8.q this$02 = (V8.q) this.f1420b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter((SetRoutesResult) obj, "it");
                K0 k02 = this$02.f7875f;
                if (k02 != null) {
                    k02.d(null);
                }
                com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) this.f1421c;
                this$02.f7876g = gVar;
                if (gVar == null || (emptyList = gVar.f12507k) == null) {
                    emptyList = CollectionsKt.emptyList();
                }
                if (!Intrinsics.areEqual(this$02.f7891w, emptyList)) {
                    this$02.f7891w = emptyList;
                }
                this$02.d(false);
                E0 e02 = this$02.f7884p;
                C0349a c0349a = (C0349a) e02.f16037b;
                VoiceInstructions voiceInstructions = this$02.f7885q;
                if (Intrinsics.areEqual(c0349a, c0349a)) {
                    e02.f16037b = null;
                }
                if (Intrinsics.areEqual(this$02.f7885q, voiceInstructions)) {
                    this$02.f7885q = null;
                }
                this$02.f7890v = null;
                break;
        }
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        if (location != null) {
            C0498N c0498n = (C0498N) this.f1420b;
            c0498n.getClass();
            R2.c.b(StubApp.getString2(103), StubApp.getString2(1444) + location);
            c0498n.x(location.getLongitude(), location.getLatitude(), (Double) this.f1421c);
        }
    }
}
