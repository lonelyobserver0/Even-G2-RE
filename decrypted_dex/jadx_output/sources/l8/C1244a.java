package l8;

import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1244a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HistoryUploadWorker f16822b;

    /* renamed from: c, reason: collision with root package name */
    public int f16823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244a(HistoryUploadWorker historyUploadWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f16822b = historyUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16821a = obj;
        this.f16823c |= Integer.MIN_VALUE;
        return this.f16822b.h(this);
    }
}
