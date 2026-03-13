package w3;

import android.content.Context;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1860a implements InterfaceC1861b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22105a = 0;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f22106b;

    public /* synthetic */ C1860a() {
    }

    @Override // w3.InterfaceC1861b
    public PdfDocument b(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.i(str, this.f22106b);
    }

    public String toString() {
        switch (this.f22105a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(23849));
                byte[] bArr = this.f22106b;
                sb2.append((int) bArr[0]);
                sb2.append(StubApp.getString2(23850));
                sb2.append((int) bArr[1]);
                sb2.append(StubApp.getString2(23851));
                sb2.append((int) bArr[2]);
                sb2.append(StubApp.getString2(23852));
                sb2.append((int) bArr[3]);
                sb2.append(StubApp.getString2(23853));
                sb2.append((int) bArr[4]);
                sb2.append(StubApp.getString2(23854));
                sb2.append((int) bArr[5]);
                sb2.append(StubApp.getString2(23855));
                sb2.append((int) bArr[6]);
                sb2.append(StubApp.getString2(23856));
                sb2.append((int) bArr[7]);
                sb2.append(StubApp.getString2(23857));
                sb2.append((int) bArr[8]);
                sb2.append(StubApp.getString2(23858));
                return AbstractC1482f.f(bArr[9], StubApp.getString2(265), sb2);
            default:
                return super.toString();
        }
    }

    public C1860a(byte[] bArr) {
        this.f22106b = bArr;
    }
}
