package E9;

import com.mapbox.api.directions.v5.models.VoiceInstructions;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public E0 f2071a;

    /* renamed from: b, reason: collision with root package name */
    public VoiceInstructions f2072b;

    /* renamed from: c, reason: collision with root package name */
    public E0 f2073c;

    /* renamed from: d, reason: collision with root package name */
    public E0 f2074d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E0 f2076f;

    /* renamed from: g, reason: collision with root package name */
    public int f2077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(E0 e02, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2076f = e02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2075e = obj;
        this.f2077g |= Integer.MIN_VALUE;
        return this.f2076f.L(null, this);
    }
}
