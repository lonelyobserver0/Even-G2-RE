package m8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u8.AbstractC1780d;

/* renamed from: m8.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1282c extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1282c f17156b = new C1282c(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1282c f17157c = new C1282c(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1282c f17158d = new C1282c(2, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1282c(int i3, int i10) {
        super(i3);
        this.f17159a = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17159a) {
            case 0:
                u8.e observer = (u8.e) obj;
                AbstractC1780d state = (AbstractC1780d) obj2;
                Intrinsics.checkNotNullParameter(observer, "observer");
                Intrinsics.checkNotNullParameter(state, "state");
                ((j8.d) observer).getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                throw null;
            case 1:
                u8.e observer2 = (u8.e) obj;
                AbstractC1780d state2 = (AbstractC1780d) obj2;
                Intrinsics.checkNotNullParameter(observer2, "observer");
                Intrinsics.checkNotNullParameter(state2, "state");
                j8.d dVar = (j8.d) observer2;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(state2, "state");
                dVar.c();
                return Unit.INSTANCE;
            default:
                u8.e observer3 = (u8.e) obj;
                AbstractC1780d state3 = (AbstractC1780d) obj2;
                Intrinsics.checkNotNullParameter(observer3, "observer");
                Intrinsics.checkNotNullParameter(state3, "state");
                j8.d dVar2 = (j8.d) observer3;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(state3, "state");
                dVar2.c();
                return Unit.INSTANCE;
        }
    }
}
