package d;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: d.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0757B extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0757B f13041b = new C0757B(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0757B f13042c = new C0757B(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0757B(int i3, int i10) {
        super(i3);
        this.f13043a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13043a) {
            case 0:
                Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            default:
                Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
                return Boolean.FALSE;
        }
    }
}
