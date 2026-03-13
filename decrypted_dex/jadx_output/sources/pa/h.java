package pa;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.gemalto.jp2.JP2Decoder;
import com.stub.StubApp;
import java.io.InputStream;
import java.io.OutputStream;
import oa.C1471d;
import oa.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends f {
    public static Bitmap d(InputStream inputStream, e eVar) {
        try {
            Class.forName(StubApp.getString2("22149"));
            Bitmap decode = new JP2Decoder(inputStream).decode();
            C1471d c1471d = eVar.f19754a;
            if (!c1471d.d(oa.j.f18449G1, false)) {
                c1471d.S(oa.j.f18429C0);
            }
            c1471d.U(oa.j.f18455H3, decode.getWidth());
            c1471d.U(oa.j.f18619y1, decode.getHeight());
            if (!c1471d.f18397a.containsKey(oa.j.f18578p0)) {
                decode.getColorSpace();
            }
            return decode;
        } catch (ClassNotFoundException unused) {
            throw new i(StubApp.getString2(22150));
        }
    }

    @Override // pa.f
    public final e a(InputStream inputStream, OutputStream outputStream, p pVar, int i3) {
        return b(inputStream, outputStream, pVar, i3);
    }

    @Override // pa.f
    public final e b(InputStream inputStream, OutputStream outputStream, p pVar, int i3) {
        C1471d c1471d = new C1471d();
        e eVar = new e(c1471d);
        c1471d.a(pVar);
        Bitmap d8 = d(inputStream, eVar);
        int height = d8.getHeight() * d8.getWidth();
        int[] iArr = new int[height];
        d8.getPixels(iArr, 0, d8.getWidth(), 0, 0, d8.getWidth(), d8.getHeight());
        byte[] bArr = new byte[3072];
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11++) {
            if (i10 + 3 >= 3072) {
                outputStream.write(bArr, 0, i10);
                i10 = 0;
            }
            int i12 = iArr[i11];
            bArr[i10] = (byte) Color.red(i12);
            bArr[i10 + 1] = (byte) Color.green(i12);
            bArr[i10 + 2] = (byte) Color.blue(i12);
            i10 += 3;
        }
        outputStream.write(bArr, 0, i10);
        return eVar;
    }
}
