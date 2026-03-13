package qa;

import java.io.Closeable;

/* renamed from: qa.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface InterfaceC1533d extends Closeable {
    boolean c();

    long getPosition();

    long length();

    int read();

    int read(byte[] bArr, int i3, int i10);

    void seek(long j);
}
