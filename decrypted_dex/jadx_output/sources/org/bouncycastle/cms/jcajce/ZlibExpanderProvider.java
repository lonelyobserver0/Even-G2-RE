package org.bouncycastle.cms.jcajce;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.InputExpander;
import org.bouncycastle.operator.InputExpanderProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ZlibExpanderProvider implements InputExpanderProvider {
    private final long limit;

    public static class LimitedInputStream extends FilterInputStream {
        private long remaining;

        public LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            this.remaining = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (r4 >= 0) goto L8;
         */
        @Override // java.io.FilterInputStream, java.io.InputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int read() throws java.io.IOException {
            /*
                r8 = this;
                long r0 = r8.remaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L1c
                java.io.InputStream r0 = r8.in
                int r0 = r0.read()
                if (r0 < 0) goto L1b
                long r4 = r8.remaining
                r6 = 1
                long r4 = r4 - r6
                r8.remaining = r4
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 < 0) goto L1c
            L1b:
                return r0
            L1c:
                org.bouncycastle.util.io.StreamOverflowException r0 = new org.bouncycastle.util.io.StreamOverflowException
                r1 = 28299(0x6e8b, float:3.9655E-41)
                java.lang.String r1 = com.stub.StubApp.getString2(r1)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.cms.jcajce.ZlibExpanderProvider.LimitedInputStream.read():int");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i3, int i10) throws IOException {
            if (i10 < 1) {
                return super.read(bArr, i3, i10);
            }
            long j = this.remaining;
            if (j < 1) {
                read();
                return -1;
            }
            if (j <= i10) {
                i10 = (int) j;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i3, i10);
            if (read > 0) {
                this.remaining -= read;
            }
            return read;
        }
    }

    public ZlibExpanderProvider() {
        this.limit = -1L;
    }

    @Override // org.bouncycastle.operator.InputExpanderProvider
    public InputExpander get(final AlgorithmIdentifier algorithmIdentifier) {
        return new InputExpander() { // from class: org.bouncycastle.cms.jcajce.ZlibExpanderProvider.1
            @Override // org.bouncycastle.operator.InputExpander
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier;
            }

            @Override // org.bouncycastle.operator.InputExpander
            public InputStream getInputStream(InputStream inputStream) {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
                return ZlibExpanderProvider.this.limit >= 0 ? new LimitedInputStream(inflaterInputStream, ZlibExpanderProvider.this.limit) : inflaterInputStream;
            }
        };
    }

    public ZlibExpanderProvider(long j) {
        this.limit = j;
    }
}
