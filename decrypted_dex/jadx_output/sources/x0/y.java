package x0;

import java.nio.ByteBuffer;
import kotlin.UByte;
import p0.AbstractC1481e;
import p0.C1478b;
import p0.C1479c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y extends AbstractC1481e {

    /* renamed from: i, reason: collision with root package name */
    public static final int f22824i = Float.floatToIntBits(Float.NaN);

    public static void l(int i3, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i3 * 4.656612875245797E-10d));
        if (floatToIntBits == f22824i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p0.InterfaceC1480d
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer k3;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i10 = this.f19612b.f19609c;
        if (i10 == 21) {
            k3 = k((i3 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24), k3);
                position += 3;
            }
        } else if (i10 == 22) {
            k3 = k(i3);
            while (position < limit) {
                l((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24), k3);
                position += 4;
            }
        } else if (i10 == 1342177280) {
            k3 = k((i3 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UByte.MAX_VALUE) << 24), k3);
                position += 3;
            }
        } else {
            if (i10 != 1610612736) {
                throw new IllegalStateException();
            }
            k3 = k(i3);
            while (position < limit) {
                l((byteBuffer.get(position + 3) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UByte.MAX_VALUE) << 24), k3);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k3.flip();
    }

    @Override // p0.AbstractC1481e
    public final C1478b g(C1478b c1478b) {
        int i3 = c1478b.f19609c;
        if (i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4) {
            return i3 != 4 ? new C1478b(c1478b.f19607a, c1478b.f19608b, 4) : C1478b.f19606e;
        }
        throw new C1479c(c1478b);
    }
}
