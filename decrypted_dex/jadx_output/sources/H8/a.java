package H8;

import androidx.lifecycle.InterfaceC0444t;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2936b = new a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f2937c = new a(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f2938d = new a(0, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f2939e = new a(0, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2940a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i10) {
        super(i3);
        this.f2940a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2940a) {
            case 0:
                Lazy lazy = b.f2941a;
                return (InterfaceC0444t) b.a().f2945c.getValue();
            case 1:
                return new c();
            case 2:
                return new C8.c();
            default:
                return new f();
        }
    }
}
