package Kc;

import java.nio.channels.WritableByteChannel;

/* renamed from: Kc.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface InterfaceC0102i extends F, WritableByteChannel {
    @Override // Kc.F, java.io.Flushable
    void flush();

    InterfaceC0102i j(long j);

    InterfaceC0102i l(int i3);

    InterfaceC0102i q(C0104k c0104k);

    InterfaceC0102i r(String str);

    long t(H h2);

    InterfaceC0102i write(byte[] bArr);

    InterfaceC0102i writeByte(int i3);

    InterfaceC0102i writeInt(int i3);

    InterfaceC0102i writeShort(int i3);
}
