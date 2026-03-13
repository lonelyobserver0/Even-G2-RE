package Dc;

import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f1594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1595b;

    public l(r this$0, v reader) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f1595b = this$0;
        this.f1594a = reader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Throwable th;
        EnumC0053b enumC0053b;
        r rVar = this.f1595b;
        v vVar = this.f1594a;
        EnumC0053b enumC0053b2 = EnumC0053b.f1551d;
        IOException e10 = null;
        try {
            try {
                Intrinsics.checkNotNullParameter(this, "handler");
            } catch (IOException e11) {
                e10 = e11;
                enumC0053b = enumC0053b2;
            }
            if (!vVar.a(true, this)) {
                throw new IOException(StubApp.getString2("25159"));
            }
            do {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    enumC0053b = enumC0053b2;
                    rVar.a(enumC0053b, enumC0053b2, e10);
                    xc.b.c(vVar);
                    throw th;
                }
            } while (vVar.a(false, this));
            enumC0053b = EnumC0053b.f1549b;
            try {
                try {
                    rVar.a(enumC0053b, EnumC0053b.f1554g, null);
                } catch (IOException e12) {
                    e10 = e12;
                    EnumC0053b enumC0053b3 = EnumC0053b.f1550c;
                    rVar.a(enumC0053b3, enumC0053b3, e10);
                    xc.b.c(vVar);
                    return Unit.INSTANCE;
                }
                xc.b.c(vVar);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                rVar.a(enumC0053b, enumC0053b2, e10);
                xc.b.c(vVar);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
