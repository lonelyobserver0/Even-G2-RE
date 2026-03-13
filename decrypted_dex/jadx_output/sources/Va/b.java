package Va;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.shockwave.pdfium.PdfDocument;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import q3.C1514g;
import s3.InterfaceC1597b;
import u3.C1772a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements InterfaceC1597b {

    /* renamed from: a, reason: collision with root package name */
    public C1514g f7916a;

    /* renamed from: b, reason: collision with root package name */
    public Context f7917b;

    /* renamed from: c, reason: collision with root package name */
    public MethodChannel f7918c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7919d;

    @Override // s3.InterfaceC1597b
    public final void a(C1772a c1772a) {
        PdfDocument.Link link = c1772a.f21432a;
        String str = link.f12758c;
        Integer num = link.f12757b;
        if (str == null || str.isEmpty()) {
            if (num != null) {
                this.f7916a.k(num.intValue());
                return;
            }
            return;
        }
        if (!this.f7919d) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent(StubApp.getString2(5111));
            intent.setData(parse);
            intent.addFlags(268435456);
            intent.addFlags(32768);
            Context context = this.f7917b;
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent, null);
            }
        }
        this.f7918c.invokeMethod(StubApp.getString2(6767), str);
    }
}
