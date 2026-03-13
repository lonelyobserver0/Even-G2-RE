package l8;

import com.mapbox.navigation.copilot.work.PeriodicHistoryCleanupWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: l8.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1247d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PeriodicHistoryCleanupWorker f16831b;

    /* renamed from: c, reason: collision with root package name */
    public int f16832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247d(PeriodicHistoryCleanupWorker periodicHistoryCleanupWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16831b = periodicHistoryCleanupWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16830a = obj;
        this.f16832c |= Integer.MIN_VALUE;
        return this.f16831b.h(this);
    }
}
