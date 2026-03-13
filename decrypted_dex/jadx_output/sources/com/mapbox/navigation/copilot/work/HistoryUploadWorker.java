package com.mapbox.navigation.copilot.work;

import D9.l;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.stub.StubApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/mapbox/navigation/copilot/work/HistoryUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Tc/d", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HistoryUploadWorker extends CoroutineWorker {
    public final WorkerParameters j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryUploadWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.j = workerParams;
    }

    public static final void i(HistoryUploadWorker historyUploadWorker, File file) {
        historyUploadWorker.getClass();
        historyUploadWorker.k(StubApp.getString2(14671) + file.getName());
        Intrinsics.checkNotNullParameter(file, "file");
        file.delete();
    }

    public static final void j(HistoryUploadWorker historyUploadWorker, String str) {
        l.h(StubApp.getString2(14672) + historyUploadWorker.f10356b.f10362a + StubApp.getString2(1558) + str, StubApp.getString2(9623));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l8.C1244a
            if (r0 == 0) goto L13
            r0 = r6
            l8.a r0 = (l8.C1244a) r0
            int r1 = r0.f16823c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16823c = r1
            goto L18
        L13:
            l8.a r0 = new l8.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16821a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16823c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            Xb.c r6 = Qb.W.f5839b
            l8.b r2 = new l8.b
            r4 = 0
            r2.<init>(r5, r4)
            r0.f16823c = r3
            java.lang.Object r6 = Qb.L.n(r6, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "override suspend fun doW…        }\n        }\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.copilot.work.HistoryUploadWorker.h(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void k(String str) {
        l.d(StubApp.getString2(14672) + this.f10356b.f10362a + StubApp.getString2(1558) + str, StubApp.getString2(9623));
    }
}
