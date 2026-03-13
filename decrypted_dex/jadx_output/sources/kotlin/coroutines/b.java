package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15592a;

    public /* synthetic */ b(int i3) {
        this.f15592a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String string$lambda$0;
        CoroutineContext plus$lambda$0;
        switch (this.f15592a) {
            case 0:
                string$lambda$0 = CombinedContext.toString$lambda$0((String) obj, (CoroutineContext.Element) obj2);
                return string$lambda$0;
            default:
                plus$lambda$0 = CoroutineContext.DefaultImpls.plus$lambda$0((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                return plus$lambda$0;
        }
    }
}
