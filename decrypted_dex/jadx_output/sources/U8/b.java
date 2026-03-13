package U8;

import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f7484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, int i3, Intent intent) {
        super(0);
        this.f7482a = i3;
        this.f7483b = context;
        this.f7484c = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7482a) {
            case 0:
                Intent intent = this.f7484c;
                Context context = this.f7483b;
                try {
                    context.startService(intent);
                } catch (IllegalStateException unused) {
                    context.startForegroundService(intent);
                }
                break;
            default:
                this.f7483b.stopService(this.f7484c);
                break;
        }
        return Unit.INSTANCE;
    }
}
