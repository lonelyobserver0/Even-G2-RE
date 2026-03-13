package Vc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7991a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f7993c;

    public /* synthetic */ c(d dVar, Object obj, int i3) {
        this.f7991a = i3;
        this.f7993c = dVar;
        this.f7992b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f7991a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f7992b;
                int size = arrayList.size();
                int length = ((float[]) arrayList.get(0)).length;
                int i3 = size * length;
                float[] fArr = new float[i3];
                for (int i10 = 0; i10 < size; i10++) {
                    float[] fArr2 = (float[]) arrayList.get(i10);
                    for (int i11 = 0; i11 < length; i11++) {
                        fArr[(i11 * size) + i10] = fArr2[i11];
                    }
                }
                d dVar = this.f7993c;
                dVar.f7994d.write(fArr, 0, i3, 0);
                dVar.f7999i.e();
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f7992b;
                int size2 = arrayList2.size();
                int length2 = ((byte[]) arrayList2.get(0)).length;
                int i12 = size2 * length2;
                byte[] bArr = new byte[i12];
                for (int i13 = 0; i13 < size2; i13++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i13);
                    if (bArr2.length != length2) {
                        break;
                    } else {
                        for (int i14 = 0; i14 < length2 / 2; i14++) {
                            int i15 = ((i14 * size2) + i13) * 2;
                            int i16 = i14 * 2;
                            bArr[i15] = bArr2[i16];
                            bArr[i15 + 1] = bArr2[i16 + 1];
                        }
                    }
                }
                d dVar2 = this.f7993c;
                dVar2.f7994d.write(bArr, 0, i12, 0);
                dVar2.f7999i.e();
                break;
            default:
                d dVar3 = this.f7993c;
                int i17 = dVar3.j;
                byte[] bArr3 = (byte[]) this.f7992b;
                if (i17 == 16) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr3);
                    wrap.order(ByteOrder.nativeOrder());
                    FloatBuffer asFloatBuffer = wrap.asFloatBuffer();
                    float[] fArr3 = new float[bArr3.length / 4];
                    asFloatBuffer.get(fArr3);
                    dVar3.f7994d.write(fArr3, 0, bArr3.length / 4, 0);
                } else {
                    dVar3.f7994d.write(bArr3, 0, bArr3.length, 0);
                }
                dVar3.f7999i.e();
                break;
        }
    }
}
