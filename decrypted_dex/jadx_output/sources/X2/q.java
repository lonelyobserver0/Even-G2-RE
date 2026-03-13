package X2;

import b3.C0498N;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8317a;

    public /* synthetic */ q(int i3) {
        this.f8317a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0498N c0498n;
        C0498N c0498n2;
        boolean parseIso$lambda$0;
        boolean parseIso$lambda$2;
        boolean parseIso$lambda$4;
        boolean parseIso$lambda$6;
        boolean parseIso$lambda$8;
        boolean parseIso$lambda$10;
        switch (this.f8317a) {
            case 0:
                Result result = (Result) obj;
                boolean m47isSuccessimpl = Result.m47isSuccessimpl(result.getValue());
                String string2 = StubApp.getString2(390);
                if (m47isSuccessimpl) {
                    R2.c.b(string2, StubApp.getString2(7100));
                } else {
                    Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(result.getValue());
                    E1.a.u(StubApp.getString2(7101), m43exceptionOrNullimpl != null ? m43exceptionOrNullimpl.getMessage() : null, string2);
                }
                break;
            case 1:
                Object value = ((Result) obj).getValue();
                Throwable m43exceptionOrNullimpl2 = Result.m43exceptionOrNullimpl(value);
                String string22 = StubApp.getString2(7096);
                if (m43exceptionOrNullimpl2 != null) {
                    E1.a.u(StubApp.getString2(7099), m43exceptionOrNullimpl2.getMessage(), string22);
                    n nVar = L1.f11306b;
                    if (nVar != null && (c0498n = nVar.f8311d) != null) {
                        c0498n.y();
                    }
                } else if (((Boolean) value).booleanValue()) {
                    R2.c.b(string22, StubApp.getString2(7097));
                } else {
                    R2.c.f(string22, StubApp.getString2(7098));
                    n nVar2 = L1.f11306b;
                    if (nVar2 != null && (c0498n2 = nVar2.f8311d) != null) {
                        c0498n2.y();
                    }
                }
                break;
            case 2:
                parseIso$lambda$0 = InstantKt.parseIso$lambda$0(((Character) obj).charValue());
                break;
            case 3:
                parseIso$lambda$2 = InstantKt.parseIso$lambda$2(((Character) obj).charValue());
                break;
            case 4:
                parseIso$lambda$4 = InstantKt.parseIso$lambda$4(((Character) obj).charValue());
                break;
            case 5:
                parseIso$lambda$6 = InstantKt.parseIso$lambda$6(((Character) obj).charValue());
                break;
            case 6:
                parseIso$lambda$8 = InstantKt.parseIso$lambda$8(((Character) obj).charValue());
                break;
            case 7:
                parseIso$lambda$10 = InstantKt.parseIso$lambda$10(((Character) obj).charValue());
                break;
            case 8:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                String format = String.format(StubApp.getString2(7095), Arrays.copyOf(new Object[]{b2}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(w wVar) {
        this.f8317a = 0;
    }
}
