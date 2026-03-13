package U6;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7465b = new b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f7466c = new b(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i10) {
        super(i3);
        this.f7467a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7467a) {
            case 0:
                return new Handler(Looper.getMainLooper());
            default:
                return new Handler(c.j.getLooper());
        }
    }
}
