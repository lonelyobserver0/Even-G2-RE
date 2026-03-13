package s3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.shockwave.pdfium.PdfDocument;
import com.stub.StubApp;
import q3.C1514g;
import u3.C1772a;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1596a implements InterfaceC1597b {

    /* renamed from: a, reason: collision with root package name */
    public C1514g f20745a;

    @Override // s3.InterfaceC1597b
    public final void a(C1772a c1772a) {
        PdfDocument.Link link = c1772a.f21432a;
        String str = link.f12758c;
        Integer num = link.f12757b;
        C1514g c1514g = this.f20745a;
        if (str == null || str.isEmpty()) {
            if (num != null) {
                c1514g.k(num.intValue());
                return;
            }
            return;
        }
        Intent intent = new Intent(StubApp.getString2(5111), Uri.parse(str));
        Context context = c1514g.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            Log.w(StubApp.getString2(2378), StubApp.getString2(23119).concat(str));
        }
    }
}
