package H0;

import android.os.Handler;
import com.stub.StubApp;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y implements P0.l {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final D0.g f2659b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f2660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f2661d;

    public y(A a3, InputStream inputStream) {
        this.f2661d = a3;
        this.f2658a = new DataInputStream(inputStream);
        D0.g gVar = new D0.g();
        gVar.f1246c = new ArrayList();
        gVar.f1244a = 1;
        this.f2659b = gVar;
    }

    @Override // P0.l
    public final void l() {
        String str;
        while (!this.f2660c) {
            byte readByte = this.f2658a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f2658a.readUnsignedByte();
                int readUnsignedShort = this.f2658a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f2658a.readFully(bArr, 0, readUnsignedShort);
                I i3 = (I) this.f2661d.f2466c.get(Integer.valueOf(readUnsignedByte));
                if (i3 != null && !this.f2661d.f2469f) {
                    i3.f2515e.add(bArr);
                }
            } else if (this.f2661d.f2469f) {
                continue;
            } else {
                Z9.C c10 = this.f2661d.f2464a;
                D0.g gVar = this.f2659b;
                DataInputStream dataInputStream = this.f2658a;
                gVar.getClass();
                M4.I a3 = gVar.a(D0.g.b(readByte, dataInputStream));
                while (a3 == null) {
                    if (gVar.f1244a == 3) {
                        long j = gVar.f1245b;
                        if (j <= 0) {
                            throw new IllegalStateException(StubApp.getString2(2486));
                        }
                        int h2 = android.support.v4.media.session.b.h(j);
                        AbstractC1550k.g(h2 != -1);
                        byte[] bArr2 = new byte[h2];
                        dataInputStream.readFully(bArr2, 0, h2);
                        AbstractC1550k.g(gVar.f1244a == 3);
                        if (h2 > 0) {
                            int i10 = h2 - 1;
                            if (bArr2[i10] == 10) {
                                if (h2 > 1) {
                                    int i11 = h2 - 2;
                                    if (bArr2[i11] == 13) {
                                        str = new String(bArr2, 0, i11, A.f2463g);
                                        ArrayList arrayList = (ArrayList) gVar.f1246c;
                                        arrayList.add(str);
                                        a3 = M4.I.m(arrayList);
                                        ((ArrayList) gVar.f1246c).clear();
                                        gVar.f1244a = 1;
                                        gVar.f1245b = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i10, A.f2463g);
                                ArrayList arrayList2 = (ArrayList) gVar.f1246c;
                                arrayList2.add(str);
                                a3 = M4.I.m(arrayList2);
                                ((ArrayList) gVar.f1246c).clear();
                                gVar.f1244a = 1;
                                gVar.f1245b = 0L;
                            }
                        }
                        throw new IllegalArgumentException(StubApp.getString2(2485));
                    }
                    a3 = gVar.a(D0.g.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) c10.f9077b).post(new Ab.b(6, c10, a3));
            }
        }
    }

    @Override // P0.l
    public final void o() {
        this.f2660c = true;
    }
}
