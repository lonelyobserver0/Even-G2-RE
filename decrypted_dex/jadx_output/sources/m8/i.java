package m8;

import Qb.I;
import a0.C0379a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Zb.a f17171a;

    /* renamed from: b, reason: collision with root package name */
    public G f17172b;

    /* renamed from: c, reason: collision with root package name */
    public List f17173c;

    /* renamed from: d, reason: collision with root package name */
    public r f17174d;

    /* renamed from: e, reason: collision with root package name */
    public C0379a f17175e;

    /* renamed from: f, reason: collision with root package name */
    public int f17176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f17177g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G f17178h;
    public final /* synthetic */ List j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0379a f17179k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, G g10, List list, C0379a c0379a, Continuation continuation) {
        super(2, continuation);
        this.f17177g = rVar;
        this.f17178h = g10;
        this.j = list;
        this.f17179k = c0379a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f17177g, this.f17178h, this.j, this.f17179k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x014d A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:7:0x0021, B:8:0x0147, B:10:0x014d, B:12:0x015c, B:13:0x0161, B:14:0x017a, B:16:0x0180, B:18:0x01a5, B:21:0x0220, B:22:0x0234, B:26:0x01b5, B:28:0x01b9, B:29:0x01d4, B:31:0x01da, B:33:0x01e6, B:35:0x0213, B:37:0x0218, B:38:0x023e, B:39:0x0243), top: B:6:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0220 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:7:0x0021, B:8:0x0147, B:10:0x014d, B:12:0x015c, B:13:0x0161, B:14:0x017a, B:16:0x0180, B:18:0x01a5, B:21:0x0220, B:22:0x0234, B:26:0x01b5, B:28:0x01b9, B:29:0x01d4, B:31:0x01da, B:33:0x01e6, B:35:0x0213, B:37:0x0218, B:38:0x023e, B:39:0x0243), top: B:6:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b5 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:7:0x0021, B:8:0x0147, B:10:0x014d, B:12:0x015c, B:13:0x0161, B:14:0x017a, B:16:0x0180, B:18:0x01a5, B:21:0x0220, B:22:0x0234, B:26:0x01b5, B:28:0x01b9, B:29:0x01d4, B:31:0x01da, B:33:0x01e6, B:35:0x0213, B:37:0x0218, B:38:0x023e, B:39:0x0243), top: B:6:0x0021 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
