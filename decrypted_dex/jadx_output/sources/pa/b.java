package pa;

import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import ia.C1066a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import oa.p;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f19723b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19724a;

    public static void d(ArrayList arrayList, long j, C1066a c1066a) {
        String string2 = StubApp.getString2(22130);
        if (j < 0) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(22133));
            sb2.append(j);
            sb2.append(string2);
            c1066a.a();
            sb2.append(c1066a.f14962b);
            throw new IOException(sb2.toString());
        }
        if (j < arrayList.size()) {
            return;
        }
        StringBuilder m4 = AbstractC1482f.m(j, StubApp.getString2(22131), StubApp.getString2(22132));
        m4.append(arrayList.size());
        m4.append(string2);
        c1066a.a();
        m4.append(c1066a.f14962b);
        throw new IOException(m4.toString());
    }

    public static void e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int read = inputStream.read(bArr);
        if (read > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, read);
            byte[] bArr2 = new byte[1024];
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        int inflate = inflater.inflate(bArr2);
                        if (inflate == 0) {
                            if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                                break;
                            } else {
                                inflater.setInput(bArr, 0, inputStream.read(bArr));
                            }
                        } else {
                            outputStream.write(bArr2, 0, inflate);
                            z2 = true;
                        }
                    } catch (DataFormatException e10) {
                        if (!z2) {
                            throw e10;
                        }
                        Log.w(StubApp.getString2("948"), StubApp.getString2("22134"));
                    }
                } finally {
                    inflater.end();
                }
            }
        }
        outputStream.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x023a, code lost:
    
        if (r0 != 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0336, code lost:
    
        r32.write(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028a A[SYNTHETIC] */
    @Override // pa.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pa.e a(java.io.InputStream r31, java.io.OutputStream r32, oa.p r33, int r34) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.b.a(java.io.InputStream, java.io.OutputStream, oa.p, int):pa.e");
    }

    @Override // pa.f
    public e b(InputStream inputStream, OutputStream outputStream, p pVar, int i3) {
        switch (this.f19724a) {
            case 4:
                F1.i(inputStream, outputStream);
                return new e(pVar);
            default:
                return super.b(inputStream, outputStream, pVar, i3);
        }
    }
}
