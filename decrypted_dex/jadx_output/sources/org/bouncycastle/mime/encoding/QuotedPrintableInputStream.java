package org.bouncycastle.mime.encoding;

import com.stub.StubApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class QuotedPrintableInputStream extends FilterInputStream {
    public QuotedPrintableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i3;
        int i10;
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            return -1;
        }
        while (read == 61) {
            int read2 = ((FilterInputStream) this).in.read();
            if (read2 == -1) {
                throw new IllegalStateException(StubApp.getString2(33029));
            }
            if (read2 == 13) {
                read = ((FilterInputStream) this).in.read();
                if (read == 10) {
                }
            } else if (read2 != 10) {
                if (read2 >= 48 && read2 <= 57) {
                    i3 = read2 - 48;
                } else {
                    if (read2 < 65 || read2 > 70) {
                        throw new IllegalStateException(StubApp.getString2(33028));
                    }
                    i3 = read2 - 55;
                }
                int i11 = i3 << 4;
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 >= 48 && read3 <= 57) {
                    i10 = read3 - 48;
                } else {
                    if (read3 < 65 || read3 > 70) {
                        throw new IllegalStateException(StubApp.getString2(33027));
                    }
                    i10 = read3 - 55;
                }
                return i11 | i10;
            }
            read = ((FilterInputStream) this).in.read();
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int read = read();
            if (read < 0) {
                break;
            }
            bArr[i11 + i3] = (byte) read;
            i11++;
        }
        if (i11 == 0) {
            return -1;
        }
        return i11;
    }
}
