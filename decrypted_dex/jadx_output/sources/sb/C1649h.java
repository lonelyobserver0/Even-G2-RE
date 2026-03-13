package sb;

import android.util.Log;
import com.stub.StubApp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: sb.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1649h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f20957a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Result.m46isFailureimpl(((Result) obj).getValue())) {
            Log.e(StubApp.getString2(23300), StubApp.getString2(23299) + this.f20957a);
        }
        return Unit.INSTANCE;
    }
}
