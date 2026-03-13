package r7;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s7.C1603a;

/* renamed from: r7.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1579e extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1579e f20377b = new C1579e(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1579e f20378c = new C1579e(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1579e f20379d = new C1579e(1, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1579e(int i3, int i10) {
        super(i3);
        this.f20380a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20380a) {
            case 0:
                C1603a ScaleBarSettings = (C1603a) obj;
                Intrinsics.checkNotNullParameter(ScaleBarSettings, "$this$ScaleBarSettings");
                return Unit.INSTANCE;
            case 1:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new C1580f(it);
            default:
                C1603a ScaleBarSettings2 = (C1603a) obj;
                Intrinsics.checkNotNullParameter(ScaleBarSettings2, "$this$ScaleBarSettings");
                return Unit.INSTANCE;
        }
    }
}
