package m9;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17271b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.f17270a = i3;
        this.f17271b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17270a) {
            case 0:
                e eVar = this.f17271b;
                eVar.f17278g = CollectionsKt.flatten(CollectionsKt.flatten(CollectionsKt.flatten(eVar.f17277f)));
                break;
            default:
                List emptyList = CollectionsKt.emptyList();
                e eVar2 = this.f17271b;
                eVar2.f17277f = emptyList;
                eVar2.f17278g = CollectionsKt.emptyList();
                break;
        }
        return Unit.INSTANCE;
    }
}
