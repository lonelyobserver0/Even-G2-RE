package N9;

import Z9.C0366a;
import a0.C0379a;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.microsoft.cognitiveservices.speech.util.HttpClient;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l4.BinderC1212t0;
import l4.C1215v;
import l4.InterfaceC1155K;
import l4.P0;
import l4.y1;
import m.e;
import m.l;
import m.n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4947a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4948b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4949c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4950d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4951e;

    public c(HttpClient httpClient, String str, String str2, byte[] bArr, String str3, int[] iArr, byte[] bArr2) {
        this.f4947a = 0;
        this.f4951e = httpClient;
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpClient.newUrl(str).openConnection();
        this.f4949c = httpURLConnection;
        httpURLConnection.setRequestMethod(str2);
        this.f4950d = bArr;
        if (bArr.length > 0) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setDoOutput(true);
        }
        this.f4948b = str3;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i3 + 1;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i3];
            Charset charset = StandardCharsets.UTF_8;
            String str4 = new String(bArr2, i10, i12, charset);
            int i13 = i10 + iArr[i3];
            String str5 = new String(bArr2, i13, iArr[i11], charset);
            i10 = i13 + iArr[i11];
            ((HttpURLConnection) this.f4949c).setRequestProperty(str4, str5);
            i3 += 2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:114|115|(1:117)(5:139|(1:141)|143|134|135)|118|(2:121|119)|122|123|124|125|(2:128|126)|129|130|(1:132)|133|134|135) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0530, code lost:
    
        r2.a().j.c(r7, com.stub.StubApp.getString2(3817));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x045f, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r5 + r12)) goto L116;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.c.run():void");
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Parcelable parcelable, int i3) {
        this.f4947a = i3;
        this.f4949c = obj;
        this.f4950d = obj2;
        this.f4948b = obj3;
        this.f4951e = parcelable;
    }

    public /* synthetic */ c(Object obj, Object obj2, String str, Object obj3, int i3) {
        this.f4947a = i3;
        this.f4949c = obj2;
        this.f4948b = str;
        this.f4950d = obj3;
        this.f4951e = obj;
    }

    public /* synthetic */ c(BinderC1212t0 binderC1212t0, String str, y1 y1Var, InterfaceC1155K interfaceC1155K) {
        this.f4947a = 1;
        this.f4949c = binderC1212t0;
        this.f4948b = str;
        this.f4950d = y1Var;
        this.f4951e = interfaceC1155K;
    }

    public c(C0379a c0379a, String str, String str2, Bundle bundle) {
        this.f4947a = 9;
        this.f4948b = str;
        this.f4949c = str2;
        this.f4950d = bundle;
        Objects.requireNonNull(c0379a);
        this.f4951e = c0379a;
    }

    public c(AppMeasurementDynamiteService appMeasurementDynamiteService, L l9, C1215v c1215v, String str) {
        this.f4947a = 2;
        this.f4949c = l9;
        this.f4950d = c1215v;
        this.f4948b = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f4951e = appMeasurementDynamiteService;
    }

    public c(P0 p02, AtomicReference atomicReference, String str, String str2) {
        this.f4947a = 4;
        this.f4949c = atomicReference;
        this.f4948b = str;
        this.f4950d = str2;
        Objects.requireNonNull(p02);
        this.f4951e = p02;
    }

    public c(C0366a c0366a, e eVar, n nVar, l lVar) {
        this.f4947a = 10;
        this.f4951e = c0366a;
        this.f4949c = eVar;
        this.f4950d = nVar;
        this.f4948b = lVar;
    }
}
