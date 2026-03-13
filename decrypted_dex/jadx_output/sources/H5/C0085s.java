package H5;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: H5.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0085s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085s(Context context, int i3) {
        super(0);
        this.f2916a = i3;
        this.f2917b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2916a) {
            case 0:
                return Oc.a.K(this.f2917b, E.f2762b);
            default:
                return Oc.a.K(this.f2917b, E.f2761a);
        }
    }
}
