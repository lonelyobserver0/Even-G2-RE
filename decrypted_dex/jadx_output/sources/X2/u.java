package X2;

import b3.C0503e;
import com.fzfstudio.ezw_ble.ble.BleManager;
import com.fzfstudio.ezw_ble.ble.models.BleConnectTemp;
import com.fzfstudio.ezw_ble.ble.models.BleDevice;
import com.fzfstudio.ezw_ble.ble.models.BleWriteAndRead;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import sb.A0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class u implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8328b;

    public /* synthetic */ u(w wVar, z zVar) {
        this.f8327a = 0;
        this.f8328b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean connect$lambda$7;
        boolean update$lambda$0;
        CharSequence asString$lambda$0;
        Object obj2 = this.f8328b;
        switch (this.f8327a) {
            case 0:
                Result result = (Result) obj;
                boolean m46isFailureimpl = Result.m46isFailureimpl(result.getValue());
                z zVar = (z) obj2;
                String string2 = StubApp.getString2(390);
                if (m46isFailureimpl) {
                    R2.c.c(string2, StubApp.getString2(7108));
                    Throwable m43exceptionOrNullimpl = Result.m43exceptionOrNullimpl(result.getValue());
                    if (m43exceptionOrNullimpl == null) {
                        m43exceptionOrNullimpl = new Exception(StubApp.getString2(7109));
                    }
                    zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(m43exceptionOrNullimpl))));
                } else {
                    R2.c.b(string2, StubApp.getString2(7110));
                    zVar.invoke(Result.m39boximpl(Result.m40constructorimpl(Boolean.TRUE)));
                }
                return Unit.INSTANCE;
            case 1:
                Result result2 = (Result) obj;
                boolean m47isSuccessimpl = Result.m47isSuccessimpl(result2.getValue());
                C0503e c0503e = (C0503e) obj2;
                String string22 = StubApp.getString2(7105);
                if (m47isSuccessimpl) {
                    KProperty[] kPropertyArr = C0503e.f10610n;
                    c0503e.getClass();
                    R2.c.b(string22, StubApp.getString2(7106));
                } else {
                    KProperty[] kPropertyArr2 = C0503e.f10610n;
                    c0503e.getClass();
                    R2.c.c(string22, StubApp.getString2(7107) + Result.m43exceptionOrNullimpl(result2.getValue()));
                }
                return Unit.INSTANCE;
            case 2:
                connect$lambda$7 = BleManager.connect$lambda$7((Ref.ObjectRef) obj2, (BleConnectTemp) obj);
                return Boolean.valueOf(connect$lambda$7);
            case 3:
                update$lambda$0 = BleDevice.update$lambda$0((Integer) obj2, (BleWriteAndRead) obj);
                return Boolean.valueOf(update$lambda$0);
            case 4:
                asString$lambda$0 = TypeReference.asString$lambda$0((TypeReference) obj2, (KTypeProjection) obj);
                return asString$lambda$0;
            default:
                ((Function1) obj2).invoke(new A0(((Result) obj).getValue()));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u(Object obj, int i3) {
        this.f8327a = i3;
        this.f8328b = obj;
    }
}
