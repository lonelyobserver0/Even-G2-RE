package xb;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xb.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC1953j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wb.e f23175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f23176c;

    public /* synthetic */ RunnableC1953j(wb.e eVar, byte[] bArr, int i3) {
        this.f23174a = i3;
        this.f23175b = eVar;
        this.f23176c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23174a) {
            case 0:
                wb.e this_send = this.f23175b;
                Intrinsics.checkNotNullParameter(this_send, "$this_send");
                Intrinsics.checkNotNullParameter(this.f23176c, StubApp.getString2(24554));
                this_send.c();
                break;
            default:
                String string2 = StubApp.getString2(24553);
                wb.e eVar = this.f23175b;
                Intrinsics.checkNotNullParameter(eVar, string2);
                String string22 = StubApp.getString2(24554);
                byte[] bArr = this.f23176c;
                Intrinsics.checkNotNullParameter(bArr, string22);
                eVar.b(bArr);
                break;
        }
    }
}
