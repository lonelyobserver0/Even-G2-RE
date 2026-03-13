package Zb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f9202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, c cVar, int i3) {
        super(1);
        this.f9200a = i3;
        this.f9201b = eVar;
        this.f9202c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9200a) {
            case 0:
                this.f9202c.getClass();
                this.f9201b.g(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f9207h;
                this.f9202c.getClass();
                e eVar = this.f9201b;
                atomicReferenceFieldUpdater.set(eVar, null);
                eVar.g(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
