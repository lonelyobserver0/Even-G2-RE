package J7;

import Qb.I;
import com.mapbox.bindgen.DataRef;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public E7.a f3422a;

    /* renamed from: b, reason: collision with root package name */
    public String f3423b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.ObjectRef f3424c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f3425d;

    /* renamed from: e, reason: collision with root package name */
    public long f3426e;

    /* renamed from: f, reason: collision with root package name */
    public int f3427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ DataRef f3428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f3429h;
    public final /* synthetic */ String j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3430k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j, DataRef dataRef, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f3428g = dataRef;
        this.f3429h = str;
        this.j = str2;
        this.f3430k = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f3430k, this.f3428g, this.f3429h, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa A[Catch: all -> 0x0033, CancellationException -> 0x0037, TryCatch #4 {CancellationException -> 0x0037, all -> 0x0033, blocks: (B:9:0x0098, B:10:0x00a0, B:12:0x00aa, B:15:0x00ba, B:52:0x00bf, B:53:0x00c5, B:20:0x002e, B:22:0x005e, B:24:0x003e, B:34:0x0057, B:26:0x0067, B:7:0x0018, B:8:0x008d, B:27:0x0070), top: B:2:0x0008, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: all -> 0x0033, CancellationException -> 0x0037, TryCatch #4 {CancellationException -> 0x0037, all -> 0x0033, blocks: (B:9:0x0098, B:10:0x00a0, B:12:0x00aa, B:15:0x00ba, B:52:0x00bf, B:53:0x00c5, B:20:0x002e, B:22:0x005e, B:24:0x003e, B:34:0x0057, B:26:0x0067, B:7:0x0018, B:8:0x008d, B:27:0x0070), top: B:2:0x0008, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r15v17, types: [F7.h, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J7.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
