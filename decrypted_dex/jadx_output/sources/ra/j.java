package ra;

import java.io.Closeable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface j extends Closeable {
    void B(byte[] bArr);

    boolean c();

    long getPosition();

    void i(int i3, byte[] bArr);

    int peek();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i3, int i10);

    void y(int i3);

    byte[] z(int i3);
}
