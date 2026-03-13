package E9;

import D5.B;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public B f2056a;

    /* renamed from: b, reason: collision with root package name */
    public VoiceInstructions f2057b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f2059d;

    /* renamed from: e, reason: collision with root package name */
    public int f2060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B b2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2059d = b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2058c = obj;
        this.f2060e |= Integer.MIN_VALUE;
        return B.s(this.f2059d, null, this);
    }
}
