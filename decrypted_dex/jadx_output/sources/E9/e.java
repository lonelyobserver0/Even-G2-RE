package E9;

import Qb.I;
import Z9.C;
import com.stub.StubApp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f2062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputStream f2063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C c10, InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.f2062a = c10;
        this.f2063b = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f2062a, this.f2063b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File file = (File) this.f2062a.f9077b;
        file.mkdirs();
        StringBuilder sb2 = new StringBuilder();
        int i3 = C.f9075d + 1;
        C.f9075d = i3;
        sb2.append(String.valueOf(i3));
        sb2.append(StubApp.getString2(1938));
        File file2 = new File(file, sb2.toString());
        InputStream inputStream = this.f2063b;
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return file2;
        } finally {
        }
    }
}
