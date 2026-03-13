package Dc;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class o extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f1605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC0053b f1607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, r rVar, int i3, EnumC0053b enumC0053b, int i10) {
        super(str, true);
        this.f1604e = i10;
        this.f1605f = rVar;
        this.f1606g = i3;
        this.f1607h = enumC0053b;
    }

    @Override // zc.a
    public final long a() {
        switch (this.f1604e) {
            case 0:
                D d8 = this.f1605f.f1627l;
                EnumC0053b errorCode = this.f1607h;
                d8.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (this.f1605f) {
                    this.f1605f.f1617C.remove(Integer.valueOf(this.f1606g));
                    Unit unit = Unit.INSTANCE;
                }
                return -1L;
            default:
                r rVar = this.f1605f;
                try {
                    int i3 = this.f1606g;
                    EnumC0053b statusCode = this.f1607h;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    rVar.f1615A.v(i3, statusCode);
                } catch (IOException e10) {
                    rVar.d(e10);
                }
                return -1L;
        }
    }
}
