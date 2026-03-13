package x9;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: x9.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1926e extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1926e f22974b = new C1926e(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1926e f22975c = new C1926e(0, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1926e(int i3, int i10) {
        super(i3);
        this.f22976a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22976a) {
            case 0:
                return new LruCache(4);
            default:
                return Unit.INSTANCE;
        }
    }
}
