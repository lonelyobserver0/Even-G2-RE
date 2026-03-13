package l8;

import A.i;
import O0.l;
import Qb.I;
import Z9.A;
import android.content.Context;
import c5.g;
import com.google.gson.Gson;
import com.mapbox.common.MapboxOptions;
import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import com.mapbox.navigation.copilot.work.PeriodicHistoryCleanupWorker;
import com.stub.StubApp;
import i2.m;
import i2.o;
import i2.p;
import j2.C1087e;
import j2.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k8.C1116a;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r2.f;

/* renamed from: l8.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1248e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PeriodicHistoryCleanupWorker f16833a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248e(PeriodicHistoryCleanupWorker periodicHistoryCleanupWorker, Continuation continuation) {
        super(2, continuation);
        this.f16833a = periodicHistoryCleanupWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1248e(this.f16833a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1248e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<File> dropLast;
        A a3;
        Set mutableSet;
        List dropLast2;
        PeriodicHistoryCleanupWorker periodicHistoryCleanupWorker;
        Lazy lazy;
        ArrayList arrayList;
        Iterator it;
        int i3;
        String json;
        Object m40constructorimpl;
        String string2 = StubApp.getString2(4416);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PeriodicHistoryCleanupWorker periodicHistoryCleanupWorker2 = this.f16833a;
        periodicHistoryCleanupWorker2.getClass();
        Lazy lazy2 = periodicHistoryCleanupWorker2.f12521k;
        File file = new File((String) lazy2.getValue());
        Intrinsics.checkNotNullParameter(file, string2);
        File[] listFiles = file.listFiles(new g(5));
        if (listFiles == null) {
            listFiles = new File[0];
        }
        dropLast = CollectionsKt___CollectionsKt.dropLast(ArraysKt.sortedWith(listFiles, new i(8)), 1);
        ArrayList arrayList2 = new ArrayList();
        for (File file2 : dropLast) {
            periodicHistoryCleanupWorker2.i(StubApp.getString2(21002) + file2.getName());
            json = FilesKt__FileReadWriteKt.readText$default(file2, null, 1, null);
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                Result.Companion companion = Result.INSTANCE;
                m40constructorimpl = Result.m40constructorimpl((C1116a) new Gson().fromJson(json, C1116a.class));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m46isFailureimpl(m40constructorimpl)) {
                m40constructorimpl = null;
            }
            C1116a c1116a = (C1116a) m40constructorimpl;
            if (c1116a != null) {
                arrayList2.add(c1116a);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            a3 = periodicHistoryCleanupWorker2.f12522l;
            if (!hasNext) {
                break;
            }
            C1116a copilotSession = (C1116a) it2.next();
            File file3 = new File(copilotSession.f15494k);
            if (file3.exists()) {
                periodicHistoryCleanupWorker2.i(StubApp.getString2(21003) + copilotSession.f15494k);
                Context context = periodicHistoryCleanupWorker2.f10355a;
                Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(copilotSession, "copilotSession");
                String str = StubApp.getString2(21004) + copilotSession.f15494k;
                l lVar = new l(HistoryUploadWorker.class);
                i2.d dVar = new i2.d();
                i2.b bVar = new i2.b();
                bVar.f14718a = 1;
                Lazy lazy3 = lazy2;
                arrayList = arrayList2;
                bVar.f14723f = -1L;
                bVar.f14724g = -1L;
                new HashSet();
                bVar.f14719b = false;
                bVar.f14720c = false;
                bVar.f14718a = 2;
                bVar.f14721d = false;
                bVar.f14722e = false;
                bVar.f14725h = dVar;
                Iterator it3 = it2;
                bVar.f14723f = -1L;
                bVar.f14724g = -1L;
                Intrinsics.checkNotNullExpressionValue(bVar, "Builder().setRequiredNet…rkType.CONNECTED).build()");
                f fVar = (f) lVar.f5144c;
                fVar.j = bVar;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                lVar.f5142a = true;
                fVar.f20312l = 1;
                long millis = timeUnit.toMillis(300L);
                String str2 = f.f20301s;
                if (millis > 18000000) {
                    it = it3;
                    o.e().h(str2, StubApp.getString2(21005), new Throwable[0]);
                    i3 = 0;
                    millis = 18000000;
                } else {
                    it = it3;
                    i3 = 0;
                }
                if (millis < 10000) {
                    o.e().h(str2, StubApp.getString2(21006), new Throwable[i3]);
                    millis = 10000;
                }
                fVar.f20313m = millis;
                String str3 = StubApp.getString2(21007) + MapboxOptions.getAccessToken();
                Intrinsics.checkNotNullParameter(copilotSession, "copilotSession");
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(21008));
                String str4 = copilotSession.f15495l;
                sb2.append(str4);
                sb2.append(StubApp.getString2(21009));
                String str5 = copilotSession.f15485a;
                sb2.append(str5);
                sb2.append(StubApp.getString2(21010));
                String str6 = copilotSession.f15486b;
                sb2.append(str6);
                lazy = lazy3;
                sb2.append(StubApp.getString2(21011));
                String str7 = copilotSession.f15487c;
                sb2.append(str7);
                String sb3 = sb2.toString();
                periodicHistoryCleanupWorker = periodicHistoryCleanupWorker2;
                Ya.g gVar = new Ya.g(1);
                Intrinsics.checkNotNullParameter(gVar, string2);
                Intrinsics.checkNotNullParameter(copilotSession, "copilotSession");
                gVar.b(StubApp.getString2(20972), str5);
                gVar.b(StubApp.getString2(20973), str6);
                gVar.b(StubApp.getString2(20974), str7);
                gVar.b(StubApp.getString2(20975), copilotSession.f15488d);
                gVar.b(StubApp.getString2(20976), copilotSession.f15489e);
                gVar.b(StubApp.getString2(20977), copilotSession.f15490f);
                gVar.b(StubApp.getString2(20978), copilotSession.f15491g);
                gVar.b(StubApp.getString2(20979), copilotSession.f15493i);
                gVar.b(StubApp.getString2(20029), copilotSession.f15492h);
                gVar.b(StubApp.getString2(20980), copilotSession.j);
                gVar.b(StubApp.getString2(20981), copilotSession.f15494k);
                gVar.b(StubApp.getString2(9619), str4);
                Intrinsics.checkNotNullExpressionValue(gVar, "putString(APP_MODE, copi…ER, copilotSession.owner)");
                gVar.b(StubApp.getString2(20995), str3);
                gVar.b(StubApp.getString2(20992), sb3);
                i2.g gVar2 = new i2.g(gVar.f8893a);
                i2.g.c(gVar2);
                Intrinsics.checkNotNullExpressionValue(gVar2, "Builder()\n              …\n                .build()");
                ((f) lVar.f5144c).f20306e = gVar2;
                ((HashSet) lVar.f5145d).add(StubApp.getString2(21012));
                p d8 = lVar.d();
                Intrinsics.checkNotNullExpressionValue(d8, "OneTimeWorkRequestBuilde…\n                .build()");
                new C1087e(k.L(context), str, 2, Collections.singletonList(d8)).G();
                arrayList3.add(file3);
                a3.f9069b++;
            } else {
                periodicHistoryCleanupWorker = periodicHistoryCleanupWorker2;
                lazy = lazy2;
                arrayList = arrayList2;
                it = it2;
            }
            arrayList2 = arrayList;
            lazy2 = lazy;
            periodicHistoryCleanupWorker2 = periodicHistoryCleanupWorker;
            it2 = it;
        }
        PeriodicHistoryCleanupWorker periodicHistoryCleanupWorker3 = periodicHistoryCleanupWorker2;
        Lazy lazy4 = lazy2;
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.f(arrayList4));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C1116a) it4.next()).f15494k);
        }
        mutableSet = CollectionsKt___CollectionsKt.toMutableSet(arrayList5);
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            String absolutePath = ((File) it5.next()).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "it.absolutePath");
            mutableSet.add(absolutePath);
        }
        File file4 = new File((String) lazy4.getValue());
        Intrinsics.checkNotNullParameter(file4, string2);
        File[] listFiles2 = file4.listFiles(new g(4));
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        dropLast2 = CollectionsKt___CollectionsKt.dropLast(ArraysKt.sortedWith(listFiles2, new i(7)), 1);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : dropLast2) {
            if (!mutableSet.contains(((File) obj2).getAbsolutePath())) {
                arrayList6.add(obj2);
            }
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            File file5 = (File) it6.next();
            PeriodicHistoryCleanupWorker periodicHistoryCleanupWorker4 = periodicHistoryCleanupWorker3;
            periodicHistoryCleanupWorker4.i(StubApp.getString2(21013) + file5.getName());
            Intrinsics.checkNotNullParameter(file5, "file");
            file5.delete();
            a3.f9070c++;
            periodicHistoryCleanupWorker3 = periodicHistoryCleanupWorker4;
        }
        periodicHistoryCleanupWorker3.i(StubApp.getString2(21014) + a3.f9069b + StubApp.getString2(21015) + a3.f9070c);
        return new m(i2.g.f14736c);
    }
}
