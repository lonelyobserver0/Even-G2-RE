package r9;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f20428b = new g(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f20429c = new g(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20430a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i10) {
        super(i3);
        this.f20430a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20430a) {
            case 0:
                return new LruCache(3);
            case 1:
                return new LruCache(3);
            default:
                return new y9.c(0, 0.0d, false);
        }
    }
}
