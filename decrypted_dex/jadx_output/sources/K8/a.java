package K8;

import bc.C0540d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3756b = new a(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f3757c = new a(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i10) {
        super(i3);
        this.f3758a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3758a) {
            case 0:
                C0540d Json = (C0540d) obj;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f10755a = true;
                Json.f10757c = true;
                break;
            default:
                C0540d Json2 = (C0540d) obj;
                Intrinsics.checkNotNullParameter(Json2, "$this$Json");
                Json2.f10755a = true;
                Json2.f10757c = true;
                break;
        }
        return Unit.INSTANCE;
    }
}
