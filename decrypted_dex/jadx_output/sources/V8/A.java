package V8;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import u8.C1779c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final A f7788b = new A(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final A f7789c = new A(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final A f7790d = new A(0, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(int i3, int i10) {
        super(i3);
        this.f7791a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7791a) {
            case 0:
                return C1779c.f21464a;
            case 1:
                return y.f7905a;
            default:
                return new M8.a();
        }
    }
}
