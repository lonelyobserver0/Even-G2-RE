package Kc;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface F extends Closeable, Flushable {
    void E(long j, C0101h c0101h);

    J b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
