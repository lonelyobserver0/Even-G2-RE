package l8;

import Qb.I;
import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import java.io.File;
import k8.C1116a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1245b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C1116a f16824a;

    /* renamed from: b, reason: collision with root package name */
    public File f16825b;

    /* renamed from: c, reason: collision with root package name */
    public File f16826c;

    /* renamed from: d, reason: collision with root package name */
    public int f16827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HistoryUploadWorker f16828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245b(HistoryUploadWorker historyUploadWorker, Continuation continuation) {
        super(2, continuation);
        this.f16828e = historyUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1245b(this.f16828e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1245b) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        if (r3 == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x032b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.C1245b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
