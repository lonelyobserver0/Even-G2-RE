package N4;

import com.stub.StubApp;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {
    static {
        new a();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i3 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i3);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = inputStream.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(arrayDeque, i3);
                }
                i10 += read;
                i3 += read;
            }
            min = android.support.v4.media.session.b.x(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError(StubApp.getString2(3732));
    }
}
