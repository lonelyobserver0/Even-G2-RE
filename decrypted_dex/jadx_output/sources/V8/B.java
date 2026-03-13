package V8;

import com.mapbox.common.location.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final B f7792b = new B(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final B f7793c = new B(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final B f7794d = new B(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final B f7795e = new B(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final B f7796f = new B(1, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final B f7797g = new B(1, 5);

    /* renamed from: h, reason: collision with root package name */
    public static final B f7798h = new B(1, 6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i3, int i10) {
        super(i3);
        this.f7799a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7799a) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 2:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 3:
                String it4 = (String) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 4:
                M8.a it5 = (M8.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter((Location) obj, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter((Location) obj, "it");
                break;
        }
        return Unit.INSTANCE;
    }
}
